package com.demo.flinkjava;


import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.List;

public class NormalFlinkJavaApplication {

  public static void main(String[] args) throws Exception {
    StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();
    executionEnvironment.fromCollection(List.of(1, 2, 3, 4)).print();
    executionEnvironment.execute("testJob");
  }
}
