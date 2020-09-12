package com.student.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.api.models.Student;
import com.student.api.repositories.StudentRepository;

@SpringBootTest
class ApiApplicationTests {
	
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		
		student.setCourse("Java SE");
		student.setFees(300);
		student.setName("Ghengis Khan");
		
		studentRepository.save(student);
	}

}
