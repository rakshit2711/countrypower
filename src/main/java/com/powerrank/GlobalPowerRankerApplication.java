package com.powerrank;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.powerrank.repository.UserRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class GlobalPowerRankerApplication {

	Logger logger=LoggerFactory.getLogger(GlobalPowerRankerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(GlobalPowerRankerApplication.class, args);
	}

}
