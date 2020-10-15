package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.services.StudentService;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper studentMapper;

	public int insertStudent(Student student) {
		return studentMapper.insertStudent(student);
	}

	public int updateStudent(Student student) {
		return studentMapper.updateStudent(student);
	}

	public int deleteStudentById(int studentId) {
		return studentMapper.deleteStudentById(studentId);
	}

	public List<Student> selectAllStudent() {
		return studentMapper.selectAllStudent();
	}

	public Student selectStudentById(int studentId) {
		return studentMapper.selectStudentById(studentId);
	}
}