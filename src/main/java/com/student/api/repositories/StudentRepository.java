package com.student.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.api.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
