package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.SubjectMapper;
import com.example.demo.domain.Subject;

@CrossOrigin(origins = "*", maxAge = 3600L)
@RestController
@RequestMapping(path = "/api/subject")
public class SubjectController {

	@Autowired
	SubjectMapper subjectMapper;

	@GetMapping(path = "/all")
	public ResponseEntity<?> getAllSubject() {
		List<Subject> students = subjectMapper.findAll();
		return new ResponseEntity<Object>(students, HttpStatus.OK);
	}
}
