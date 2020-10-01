FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
EXPOSE 8080
ARG OUTPUT_FOLDER=build/libs/
COPY ${OUTPUT_FOLDER} /app/lib
WORKDIR /app/lib
ADD build/libs/lab06-0.0.1-SNAPSHOT.jar lab06.jar
ENTRYPOINT ["java","-jar","lab06.jar"]