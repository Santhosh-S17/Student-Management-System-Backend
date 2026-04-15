package com.santhosh.student.service;

import com.santhosh.student.entity.Student;
import com.santhosh.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student SaveStudent(Student s){
        return repo.save(s);
    }

    public List<Student> GetAllStudents(){
         return repo.findAll();
    }

    public void DeleteStudent(int id){
         repo.deleteById(id);
    }

}
