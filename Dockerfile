FROM openjdk:8
ADD target/restdemo-0.0.1-SNAPSHOT.jar restdemo-0.0.1-SNAPSHOT.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","restdemo-0.0.1-SNAPSHOT.jar"]