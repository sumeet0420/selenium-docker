FROM openjdk:15.0.2-jdk-oraclelinux8

# adding work directory

WORKDIR /usr/learnig/docker

ADD target/selenium-docker.jar selenium-docker.jar
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar
ADD target/libs libs
#Add Suite-Files
ADD flight-test.xml flight-test.xml
ADD naukri-tests.xml naukri-tests.xml

# We have to use ":" only because the image will be run on
# linux. For Windows, it would have been ";"
ENTRYPOINT java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* -Dtestng.dtd.http=true -DHUB_HOST=$HUB_HOST org.testng.TestNG naukri-tests.xml
