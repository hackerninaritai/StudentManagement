package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Subject;

@Mapper
public interface SubjectMapper {

	public List<Subject> findAll();
}
