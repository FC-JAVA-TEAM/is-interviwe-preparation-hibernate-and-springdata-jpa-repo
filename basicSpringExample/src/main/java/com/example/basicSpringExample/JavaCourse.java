package com.example.basicSpringExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JavaCourse implements Course{

	@Override
	public String getCourseDetails(String CourseName) {
		System.out.println("From java");
		return CourseName;
	}

}
