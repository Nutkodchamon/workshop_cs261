package com.example.crud.controller;

import org.springframework.beans.factory.anpotation.Autowired;
import com.example.crud.dto.StudentDTO;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody StudentDTO studentDTO) {
        Student student = studentService.saveStudent(studentDTO);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
}
