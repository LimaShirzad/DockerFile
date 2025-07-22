
# use tis bsse image
FROM eclipse-temurin:17-jdk
# copy form local machi to docker image
COPY target/dockerex-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java","-jar","myapp.jar"]