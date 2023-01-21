package com.example.student.dal.repositorys;

import org.springframework.data.repository.CrudRepository;

import com.example.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
