package com.demo.flinkkafka;

import org.apache.flink.api.java.ExecutionEnvironment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlinkKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlinkKafkaApplication.class, args);
	}

	@Bean
	public ExecutionEnvironment executionEnvironment() {
		return ExecutionEnvironment.getExecutionEnvironment();
	}
}
