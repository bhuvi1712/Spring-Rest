package com.nt.config;

import java.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nt.sbeans")
public class AppConfig {

	@Bean(name="ldt")
	public LocalDate createLDT()
	{
		return LocalDate.now();
	}
}
