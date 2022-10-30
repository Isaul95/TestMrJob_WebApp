package com.testBootReact.systemmrjobtest.controller;

import com.testBootReact.systemmrjobtest.model.Student;
import com.testBootReact.systemmrjobtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping("/add")
    public String agregarNewStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added...!";
    }


}
