@echo off
title "launch-debug"
set MAVEN_OPTS=-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,address=8000,suspend=n,server=y -Xms256m -Xmx512m -XX:MaxPermSize=128m
mvn clean -DdownloadSources=true package tomcat:run