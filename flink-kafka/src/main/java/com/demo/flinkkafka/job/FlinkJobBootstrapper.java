package com.demo.flinkkafka.job;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FlinkJobBootstrapper {
  private final ExecutionEnvironment executionEnvironment;

  @PostConstruct
  public void bootstrapJob() {
    log.info("Executing spring job...");
    try {
      executionEnvironment.fromCollection(List.of(1, 2, 3, 4))
          .print();
      executionEnvironment.execute("HelloWorld");
    } catch (Exception e) {
      log.error("Exception occurred while executing flink job, ex: {}", e.toString());
    }
  }
}
