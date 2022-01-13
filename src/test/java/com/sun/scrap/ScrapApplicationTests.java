package com.sun.scrap;

import com.sun.scrap.core.temp.TempService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ScrapApplicationTests {
	
	@Autowired
	private TempService service;

	@Test
	void contextLoads() throws Exception {

		Logger logger = LoggerFactory.getLogger(this.getClass());

		List<String> strings = service.doSomething();

		strings.stream().forEach(logger::info);

	}

}
