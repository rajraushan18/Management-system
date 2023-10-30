FROM openjdk:17

ADD target/managementsystem-docker.jar managementsystem-docker.jar

EXPOSE 9090

ENTRYPOINT [ "java", "-jar", "managementsystem-docker.jar" ]