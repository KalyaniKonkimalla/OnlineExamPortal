package com.EnrollTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EnrollTest.Model.TestEnrollment;

@Repository
public interface TestRepository extends JpaRepository<TestEnrollment, Integer>{

	
	public TestEnrollment findByCourseType(String courseType);
	
	public TestEnrollment findByCourseTypeIgnoreCase(String courseType);
}
