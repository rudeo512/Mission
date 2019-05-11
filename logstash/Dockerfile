FROM docker.elastic.co/logstash/logstash:6.7.1
RUN rm -f /usr/share/logstash/pipeline/logstash.conf
ADD pipeline/ /usr/share/logstash/pipeline/
ADD config/ /usr/share/logstash/config/

WORKDIR /usr/share/logstash
COPY data.csv ./file.csv
RUN mkdir -p vendor/jar/jdbc/
COPY mysql-connector-java-5.1.47.jar ./vendor/jar/jdbc/mysql-connector-java-5.1.47.jar

RUN bin/logstash-plugin install logstash-output-jdbc

