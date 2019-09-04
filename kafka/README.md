### 변경해야하는 부분
	설정파일의 log.dirs path 변경
	* conf/server.properties
	* conf/server1.properties
	* conf/server2.properties
	* conf/server3.properties
	> log.dirs= {PATH}/kafka/dataX,{PATH}/kafka/dataX

### 실행방법
	3개 노드로 실행
	/bin/kafka-server-start.sh conf/server1.properties
	/bin/kafka-server-start.sh conf/server2.properties
	/bin/kafka-server-start.sh conf/server3.properties
