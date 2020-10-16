package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentMapper;
import com.example.demo.domain.Student;
import com.example.demo.sqlbuilder.ComplicateSQL;

@CrossOrigin(maxAge = 3600L, origins = "*")
@RestController
@RequestMapping(path = "/api/student")
public class StudentController {

	@Autowired
	StudentMapper studentMapper;

	@GetMapping(path = "/all")
	public ResponseEntity<?> getAllStudent() {
		List<Student> students = studentMapper.findAll();
		return new ResponseEntity<Object>(students, HttpStatus.OK);
	}

	@GetMapping(path = "/sql")
	public ResponseEntity<?> getAllStudentWithOffset(@RequestParam Integer limit, @RequestParam Integer offset) {
		List<Student> students = studentMapper.findAllWithOffset(limit, offset);
		return new ResponseEntity<Object>(students, HttpStatus.OK);
	}

	@GetMapping(path = "/allWithClass")
	public ResponseEntity<?> getAllStudentWithClass() {
		List<Student> students = studentMapper.findAllWithClass();
		return new ResponseEntity<Object>(students, HttpStatus.OK);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable Integer id) {
		List<Student> students = studentMapper.findById(id);
		return new ResponseEntity<Object>(students, HttpStatus.OK);
	}

	@GetMapping(path = "/")
	public ResponseEntity<?> getStudentByLike(@RequestBody Student student) {
		List<Student> students = studentMapper.findStudentLike(student);
		return new ResponseEntity<Object>(students, HttpStatus.OK);
	}

	@GetMapping(path = "/classMate")
	public ResponseEntity<?> findClassMate(@RequestBody Student student) {
		List<Student> students = studentMapper.findClassMate(student);
		return new ResponseEntity<Object>(students, HttpStatus.OK);
	}

	@GetMapping(path = "/findByNameOrEmail")
	public ResponseEntity<?> findByNameOrEmail(@RequestBody Student student) {
		List<Student> students = studentMapper.findStudentByNameOrEmail(student);
		return new ResponseEntity<Object>(students, HttpStatus.OK);
	}

	@PostMapping(path = "/insert")
	public ResponseEntity<?> insertStudent(@RequestBody Student student) {
		int result = studentMapper.insert(student);
		return new ResponseEntity<Object>("id: " + result, HttpStatus.OK);
	}
}
