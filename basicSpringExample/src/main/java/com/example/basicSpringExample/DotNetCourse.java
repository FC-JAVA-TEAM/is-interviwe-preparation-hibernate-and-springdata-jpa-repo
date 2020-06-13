package com.example.basicSpringExample;

import org.springframework.stereotype.Component;

@Component
public class DotNetCourse implements Course{

	@Override
	public String getCourseDetails(String CourseName) {
		System.out.println("From net");
		return CourseName;
	}

}
