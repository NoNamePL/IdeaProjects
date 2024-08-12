package com.MySQL.rest_api_my_sql;

import org.springframework.boot.SpringApplication;

public class TestRestApiMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.from(RestApiMySqlApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
