package com.example.basicSpringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class jdbcDao {
	
	@Autowired
	JdbcConnection conn;
	
public String getConnectionName() {
	conn.setName("connection");
	return conn.getName();
}
}
