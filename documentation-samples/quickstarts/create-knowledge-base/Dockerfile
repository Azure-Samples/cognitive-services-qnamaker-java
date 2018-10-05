# BUILD IMAGE
# $ docker build --no-cache -t qnamaker-java-create-kb .
#
# RUN CODE
#
# WINDOWS BASH COMMAND 
# $ winpty docker run -it --rm --name qnamaker-java-create-kb qnamaker-java-create-kb 
#
# NON-WINDOWS
# $ docker run -it --rm --name qnamaker-java-create-kb qnamaker-java-create-kb 

FROM openjdk:7
COPY . /usr/src/qnamaker

COPY libs/ /libs/

WORKDIR /usr/src/qnamaker

RUN ls

# linux moby syntax
RUN javac -cp ":libs/*" CreateKB.java

ENTRYPOINT ["java", "-cp",":libs/*", "CreateKB"]