FROM openjdk:17-jdk-slim

WORKDIR /app

COPY ScientificCalculator.java .

RUN javac ScientificCalculator.java

ENTRYPOINT ["java", "ScientificCalculator"]
