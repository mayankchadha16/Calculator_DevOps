FROM openjdk:11
COPY ./target/untitled-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","untitled-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]