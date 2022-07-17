package com.kafka.sum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class KafkaAdderApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaAdderApplication.class, args);
	}

}
