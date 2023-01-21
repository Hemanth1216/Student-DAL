package com.example.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.student.dal.entities.Student;
import com.example.student.dal.repositorys.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository repo;

	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setName("hemanth");
		student.setCourse("Security");
		student.setFee(190d);
		repo.save(student);
	}
	
	@Test
	void testReadStudent() {
		Student student = repo.findById(12l).get();
		System.out.println(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student = repo.findById(12l).get();
		student.setFee(400d);
		repo.save(student);
	}
//	
//	@Test
//	void testDeleteStudent() {
//		Student student = repo.findById(11l).get();
//		repo.delete(student);
//	}
	
//	@Test
//	void testDeleteAllStudent() {
//		repo.deleteAll();
//	}

}
