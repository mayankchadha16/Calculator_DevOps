FROM openjdk:11
COPY ./target/untitled-1.0-SNAPSHOT-jar-with-dependencies ./
WORKDIR ./
CMD [“java”,”-cp”,” untitled-1.0-SNAPSHOT-jar-with-dependencies”,”org.example.Main”]