package com.ey.codesara.ProductService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(properties = {
		"spring.cloud.config.enabled=false"
})
class ProductServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
