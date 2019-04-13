package com.noseparte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ElkJournalApplication {

	Logger logger = LoggerFactory.getLogger(ElkJournalApplication.class);

	@GetMapping("test")
	public void test(){
		logger.info("测试初始一些日志吧！");
	}

	public static void main(String[] args) {
		SpringApplication.run(ElkJournalApplication.class, args);
	}


}
