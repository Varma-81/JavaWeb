package com.ibm.casestudy.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.ibm.casestudy.dao")
public class DataBaseConfig {

	@Bean
	public DataSource dataSource()
	{
		HikariDataSource ds = new HikariDataSource();
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/casestudy");
		ds.setUsername("Nithin");
		ds.setPassword("nithin123");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
	}
	
//	@Bean
//	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//		return new JdbcTemplate(dataSource);
//	}s
	
}
