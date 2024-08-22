#!/bin/bash

if [ -f /home/ubuntu/mvn/apache-tomcat-10.1.4/webapps/sample-0.0.1-SNAPSHOT.war ]; then
    rm /home/ubuntu/mvn/apache-tomcat-10.1.4/webapps/sample-0.0.1-SNAPSHOT.war
fi

echo "톰캣 중지"
/home/ubuntu/mvn/apache-tomcat-10.1.4/bin/shutdown.sh;

echo "톰캣 실행"
/home/ubuntu/mvn/apache-tomcat-10.1.4/bin/startup.sh;