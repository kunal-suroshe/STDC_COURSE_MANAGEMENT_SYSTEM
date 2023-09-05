package com.cdac.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
