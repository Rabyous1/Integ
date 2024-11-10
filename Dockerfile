FROM openjdk:17
EXPOSE 8083
ADD target/RendezVous-0.0.1-SNAPSHOT.jar rdv-dk.jar
ENTRYPOINT ["java","-jar","rdv-dk.jar"]
