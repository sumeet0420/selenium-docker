# Learning Selenium With Docker

###Maven Command to create package
`mvn clean -DskipTests=true package`

### Command should be executed from target directory..
`java -cp selenium-docker.jar;selenium-docker-tests.jar;libs/* org.testng.TestNG ..\naukri-test.xml`
