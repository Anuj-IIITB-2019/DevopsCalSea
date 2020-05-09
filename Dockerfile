FROM java:8
WORKDIR /
ADD DevopsCalSea.jar DevopsCalSea.jar
EXPOSE 8080
CMD java - jar DevopsCalSea.jar
