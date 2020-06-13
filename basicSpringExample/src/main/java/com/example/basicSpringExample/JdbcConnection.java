package com.example.basicSpringExample;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value ="prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
