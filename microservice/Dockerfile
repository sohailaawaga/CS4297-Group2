# Use a lightweight Java runtime as the base image
FROM openjdk:17-jdk-slim

# Copy the built jar file into the container
COPY target/*.jar app.jar

# Run the jar file when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]

