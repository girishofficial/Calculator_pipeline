FROM openjdk:17-jdk-slim

WORKDIR /app

COPY ScientificCalculator.java .
COPY ScientificCalculatorTest.java .

RUN javac ScientificCalculator.java ScientificCalculatorTest.java

ENTRYPOINT ["java", "ScientificCalculatorTest"]
