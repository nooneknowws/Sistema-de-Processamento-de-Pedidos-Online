# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/ms-notificacao-*.jar app.jar

# Expose the port the app runs on (matches application.yaml)
EXPOSE 8084

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]