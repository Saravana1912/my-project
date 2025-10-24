package com.ey.codesara.ConfigServer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "spring.cloud.config.enabled=false")
class ConfigServerApplicationTests {
	@Test
	void contextLoads() {
	}

}
