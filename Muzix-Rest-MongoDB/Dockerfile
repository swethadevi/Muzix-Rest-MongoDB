FROM openjdk:11.0-oracle
ADD ./target/muzix-rest-0.0.1-SNAPSHOT.jar /usr/src/muzix-rest-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","muzix-rest-0.0.1-SNAPSHOT.jar"]