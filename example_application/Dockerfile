FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
# COPY run.sh .
# COPY target/*.jar app.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["run.sh"]