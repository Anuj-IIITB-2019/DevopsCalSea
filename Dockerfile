FROM java:8
WORKDIR /
ADD /var/lib/jenkins/workspace/CalseaPipeline/target/CalSea-1.jar Calculator.jar
EXPOSE 8080
CMD java - jar Calculator.jar
