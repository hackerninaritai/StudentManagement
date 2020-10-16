package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import com.example.demo.domain.Student;
import com.example.demo.sqlbuilder.ComplicateSQL;

@Mapper
public interface StudentMapper {
	

	/**
	 * find all the students.
	 */
	List<Student> findAll();
	
	List<Student> findAllWithClass();

	List<Student> findById(int id);

	List<Student> findStudentLike(Student student);
	
	List<Student> findClassMate(Student student);

	int insert(Student student);

	List<Student> findStudentByNameOrEmail(Student student);
	
	@SelectProvider(type = ComplicateSQL.class, method="selectStudentsWithOffsetLimitSql")
	List<Student> findAllWithOffset(int limit, Integer offset);
	
	
}