@setlocal
@echo off
rem execute maven package firstly to produce a war
call mvn clean package


rem then copy war to tomcat
set path=%cd%
copy "%path%\target\legou.war" "%TOMCAT_HOME%\webapps\"


rem judge if there is debug mode
if "%1%" == "debug" goto debug
goto nodebug

:debug
echo enter Debug mode , listen port for 8000
set JAVA_OPTS=-Xms256m -Xmx512m -XX:MaxPermSize=128m -Dfile.encoding=UTF-8
rem CATALINA_OPTS=-server -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8787
set CATALINA_HOME=%TOMCAT_HOME%
call %TOMCAT_HOME%\bin\catalina.bat jpda,run
goto end

rem enter nodebug mode
echo start tomcat now
:nodebug
set JAVA_OPTS=-Xms256m -Xmx512m -XX:MaxPermSize=128m -Dfile.encoding=UTF-8
set CATALINA_HOME=%TOMCAT_HOME%
call %TOMCAT_HOME%\bin\startup.bat

:end