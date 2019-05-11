#!/bin/bash

docker run --rm  --name=caru_logstash --entrypoint "/bin/sh" -it caru_logstash
bin/logstash -f logstash.conf --verbose