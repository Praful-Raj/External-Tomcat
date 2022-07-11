FROM openjdk:latest
ADD target/springbootbuild.jar dockertarget.jar
ENTRYPOINT ["java", "-jar", "dockertarget.jar" ]