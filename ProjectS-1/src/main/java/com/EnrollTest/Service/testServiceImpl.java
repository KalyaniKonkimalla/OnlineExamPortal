package com.EnrollTest.Service;


import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EnrollTest.Model.TestEnrollment;
import com.EnrollTest.repository.TestRepository;

@Service
public class testServiceImpl implements testService{

	@Autowired
	private TestRepository testrepository;
	
	@Override
	public TestEnrollment saveEnrollment(TestEnrollment Testenroll) {

		return testrepository.save(Testenroll);
	}

	
	@Override
	public TestEnrollment fetchTestByCourseName(String courseType) {

		return testrepository.findByCourseTypeIgnoreCase(courseType);
	}

	@Override
	public TestEnrollment updateTestEnrollment(Integer testid, TestEnrollment testenrollment) {
		
		TestEnrollment teen=testrepository.findById(testid).get();
		if(Objects.nonNull(testenrollment.getCourseType()) &&
				!"".equalsIgnoreCase(testenrollment.getCourseType()))
		{
			teen.setCourseType(testenrollment.getCourseType());
		}
		
		if(Objects.nonNull(testenrollment.getStatusCheck()) &&
				!"".equalsIgnoreCase(testenrollment.getStatusCheck()))
		{
			teen.setStatusCheck(testenrollment.getStatusCheck());
		}
		
		return testrepository.save(teen);
	}

}
