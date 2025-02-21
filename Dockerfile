FROM ubuntu:latest
RUN apt-get update && apt-get install -y dos2unix
COPY calculator.sh /app/
RUN dos2unix /app/calculator.sh
RUN chmod +x /app/calculator.sh
WORKDIR /app
ENTRYPOINT ["/bin/bash", "./calculator.sh"]
