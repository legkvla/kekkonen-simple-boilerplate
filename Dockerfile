FROM java:8
EXPOSE 3000

ADD /target/jess.jar /jess.jar

CMD java -jar /jess.jar
