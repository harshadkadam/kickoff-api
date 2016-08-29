package org.thinkyard.kickoffapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by harshad on 22/08/16.
 */

@SpringBootApplication
@ComponentScan("org.thinkyard.kickoffapi")
public class KickoffApiConfig extends SpringBootServletInitializer {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "kickoffapi.primary.datasource")
	public DataSource getDataSource() {
		return DataSourceBuilder.create().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(KickoffApiConfig.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KickoffApiConfig.class);
	}
}
