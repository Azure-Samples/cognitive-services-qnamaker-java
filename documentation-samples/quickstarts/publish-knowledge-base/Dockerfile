# BUILD IMAGE
# $ docker build --no-cache -t qnamaker-getanswer-java .
#
# RUN CODE
#
# WINDOWS BASH COMMAND 
# $ winpty docker run -it --rm --name qnamaker-getanswer-java qnamaker-getanswer-java 
#
# NON-WINDOWS
# $ docker run -it --rm --name qnamaker-getanswer-java qnamaker-getanswer-java tail 

FROM openjdk:7
COPY . /usr/src/LUIS

COPY lib/ /lib/

WORKDIR /usr/src/LUIS
RUN ls

# linux moby syntax
RUN javac -cp "lib/*" PublishKB.java

# java -cp ".;lib/*" GetAnswer

# Windows-version of location of class path
ENTRYPOINT ["java", "-cp",".;lib/*", "PublishKB"]
