# Boiler plate to a multi module web project with coverage of unit and integration tests using jacoco and sonarqube 

## RUN ##

mvn spring-boot:run

## TESTS ##

mvn test

## SONAR ##

# 1- run the sonarqube docker
docker pull sonarqube:latest  
docker run -d --name sonarqube -p 9000:9000 sonarqube

# 2- generate token
# go to http://localhost:9000
# create login and password
# define a manually configuration and generate a token

# 3- sent the tests data to the sonar
 mvn clean verify sonar:sonar \                                                                                                                                                              INT ✘
 -Dsonar.projectKey=coverage \
 -Dsonar.host.url=http://localhost:9000 \
 -Dsonar.login=${token}
