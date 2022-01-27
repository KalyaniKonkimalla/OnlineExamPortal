package com.EnrollTest.Service;


import com.EnrollTest.Model.TestEnrollment;


public interface testService {



	public TestEnrollment saveEnrollment(TestEnrollment Testenroll);


	public TestEnrollment fetchTestByCourseName(String courseType);

	
	public TestEnrollment updateTestEnrollment(Integer testid,TestEnrollment testenrollment);
}
