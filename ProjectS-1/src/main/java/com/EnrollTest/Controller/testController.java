package com.EnrollTest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EnrollTest.Model.TestEnrollment;
import com.EnrollTest.Service.testService;

@RestController
public class testController {
	
	@Autowired
	private testService Testservice;
	
	
	@PostMapping("/saveEnrollment")
	public TestEnrollment saveEnrollement(@RequestBody TestEnrollment Testenroll)
	{
		
		return Testservice.saveEnrollment(Testenroll);
	}
	
	@GetMapping("/saveEnrollment/courseType/{courseType}")
	public TestEnrollment fetchTestByCourseName(@PathVariable("courseType") String courseType)
	{
		return Testservice.fetchTestByCourseName(courseType);
	}
	
	@PutMapping("/saveEnrollment/{tid}")
	public TestEnrollment updateTestEnrollment(@PathVariable("tid") Integer testid,
												@RequestBody TestEnrollment testenrollment)
	{
		return Testservice.updateTestEnrollment(testid,testenrollment);
	}
	
}
