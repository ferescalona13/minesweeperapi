FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} minesweeperapi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/minesweeperapi-0.0.1-SNAPSHOT.jar"]