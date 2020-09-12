package com.student.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.api.models.Student;
import com.student.api.repositories.StudentRepository;
import com.student.api.utilities.EmailSender;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	private EmailSender emailSender;
	
	@GetMapping
	public List <Student> list () { return studentRepository.findAll();}
	
	@PostMapping
    public void create(@RequestBody Student student) {
		emailSender.sendEmail("cj.ugwuanyi@gmail.com", "The hoes are here.", "The icons are iconic.");
		studentRepository.saveAndFlush(student);
    }

    @GetMapping("/{id}")
    public Student getOne(@PathVariable("id") Long id) {
        return studentRepository.getOne(id);
    }
}
