FROM openjdk:8-jdk
#ENV TZ=Asia/Seoul
#RUN apt-get update && \
#    apt-get upgrade -y && \
#    apt-get install -yq tzdata && \
#    ln -fs /usr/share/zoneinfo/Asia/Seoul /etc/localtime && \
#    dpkg-reconfigure -f noninteractive tzdata

ARG JAR_FILE=build/libs/ssetest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ssetest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/ssetest-0.0.1-SNAPSHOT.jar"]