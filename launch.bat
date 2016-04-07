@echo off
title "launch.bat"
set MAVEN_BATCH_PAUSE=on
mvn clean package -DdownloadSources=true tomcat:run