#!/bin/bash

echo "톰캣 중지"
/home/ubuntu/mvn/apache-tomcat-10.1.4/bin/shutdown.sh;

echo "톰캣 실행"
/home/ubuntu/mvn/apache-tomcat-10.1.4/bin/startup.sh;