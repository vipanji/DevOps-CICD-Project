FROM openjdk:17
COPY app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
