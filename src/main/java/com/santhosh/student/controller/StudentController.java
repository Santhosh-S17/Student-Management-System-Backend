package com.santhosh.student.controller;

import com.santhosh.student.entity.Student;
import com.santhosh.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/students")
    public Student addstudent(@RequestBody Student s){
         return service.SaveStudent(s);

    }

    @GetMapping("/students")
    public List<Student> getstudents(){
        return service.GetAllStudents();
    }

    @DeleteMapping ("/students/{id}")
    public String deletestudent(@PathVariable int id){
        service.DeleteStudent(id);
        return "Student Deleted";
    }

    @PutMapping ("/students/{id}")
    public Student updatestudent(@RequestBody Student s,@PathVariable int id){
        s.setId(id);
        return service.SaveStudent(s);

    }
}
