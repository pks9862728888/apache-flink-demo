## APACHE FLINK demo
Flink works in unix like environemt only, so install wsl using `wsl --install`

### Download apache flink
- [Flink binary](https://flink.apache.org/downloads/)

### Useful flink commands
- To boot into wsl
```shell
sudo su
```

C drive will be auto mounted as /wsl/c

- To stop flink cluster
```shell
./bin/stop-cluster.sh
```

- To start flink cluster
```shell
./bin/start-cluster.sh
```
If flink cluster is started, flink dashboard can be viewed at: ```http://localhost:8081/#/overview```


- To submit a job
```shell
./bin/flink run pathToJar
```

```shell
./bin/flink run examples/streaming/WordCount.jar
```

Output can be found in log file
```shell
tail log/flink-*-taskexecutor-*.out
```

```shell
./bin/flink run /mnt/c/dev/git/apache-flink-demo/flink-kafka/target/flink-kafka-1.0.0-SNAPSHOT.jar
```
