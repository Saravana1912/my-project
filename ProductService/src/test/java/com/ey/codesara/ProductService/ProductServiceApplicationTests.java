package com.ey.codesara.ProductService;

import com.ey.codesara.ProductService.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(properties = {
		"spring.cloud.config.enabled=false"
})
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
class ProductServiceApplicationTests {


	@MockBean
	private ProductRepository productRepository;

	@Test
	void contextLoads() {
		assertNotNull(productRepository);
	}
}
