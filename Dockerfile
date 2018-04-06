FROM openjdk:8 as builder
COPY . /app
WORKDIR /app
RUN /app/gradlew clean assemble

FROM openjdk:8
MAINTAINER Thomas Einwaller, tom@troii.com
COPY --from=builder /app/build/libs/*.jar /bootapp.jar
COPY run.sh /run.sh

EXPOSE 8080

CMD ["sh", "/run.sh"]
