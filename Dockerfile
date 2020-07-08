FROM openjdk:8-jre-alpine
ADD spring-1.0.0.jar spring-1.0.0.jar
ENTRYPOINT ["java", "-jar", "spring-1.0.0.jar"]