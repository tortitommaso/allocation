#!/bin/bash

cp bin/* jetty-6.1.11/webapps/allocation/WEB-INF/classes/
cd jetty-6.1.11/
java -Xdebug -Xrunjdwp:transport=dt_socket,address=8585,server=y,suspend=n -jar start.jar