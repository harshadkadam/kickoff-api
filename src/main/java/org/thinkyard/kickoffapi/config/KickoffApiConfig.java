package org.thinkyard.kickoffapi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by harshad on 22/08/16.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "org.thinkyard.kickoffapi", "org.thinkyard.kickoffapi.controller" })
public class KickoffApiConfig extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(KickoffApiConfig.class, args);
	}

	// Used when deploying to a standalone servlet container
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KickoffApiConfig.class);
	}
}
