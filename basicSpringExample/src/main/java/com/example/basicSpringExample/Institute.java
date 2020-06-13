package com.example.basicSpringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Institute {

	@Autowired
	private Course javaCourse;
	
	public String getCourseDetailsFromInstitute(String course) {
		String cc = this.javaCourse.getCourseDetails(course);
		return cc;
	}
}
