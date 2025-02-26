FROM openjdk:17-jdk-slim

WORKDIR /app

# Install wget
RUN apt-get update && apt-get install -y wget

# Copy source and test files
COPY ScientificCalculator.java .
COPY ScientificCalculatorTest.java .

# Download JUnit
RUN wget -q https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.2/junit-platform-console-standalone-1.9.2.jar -O junit.jar

# Compile Java files with JUnit
RUN javac -cp .:junit.jar ScientificCalculator.java ScientificCalculatorTest.java

# Run JUnit tests
RUN java -jar junit.jar --class-path . --select-class ScientificCalculatorTest

# Set entry point to run the calculator program
ENTRYPOINT ["java", "ScientificCalculator"]
