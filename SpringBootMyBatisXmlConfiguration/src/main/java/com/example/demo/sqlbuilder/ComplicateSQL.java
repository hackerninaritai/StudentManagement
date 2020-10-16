package com.example.demo.sqlbuilder;

import org.apache.ibatis.jdbc.SQL;

public class ComplicateSQL {

	public String selectStudentsWithOffsetLimitSql() {
		// SELECT id, name FROM PERSON
		// LIMIT #{limit} OFFSET #{offset}
		return new SQL().SELECT("id", "name", "phone", "email").FROM("student").LIMIT("#{limit}").OFFSET("#{offset}")
				.toString();
	}
}
