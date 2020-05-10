FROM java:8
WORKDIR /
ADD target/CalSea-1.jar Calculator.jar
EXPOSE 8080
CMD java - jar Calculator.jar
