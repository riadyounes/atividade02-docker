FROM maven:3-openjdk-11-slim

WORKDIR /app


COPY . /app

RUN mvn install -DskipTests && ls /app/target

CMD ["mvn", "spring-boot:run"]