package com.MySQL.rest_api_my_sql;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class RestApiMySqlApplicationTests {

	@Test
	void contextLoads() {
	}

}
