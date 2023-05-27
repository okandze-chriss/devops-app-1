FROM openjdk:17
EXPOSE 8080
ADD target/Learning-1.0-SNAPSHOT.jar Learning-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/Learning-1.0-SNAPSHOT.jar"]