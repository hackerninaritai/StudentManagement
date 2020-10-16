package com.example.demo.domain;

public class StudyResult {

	private int studentId;
	private int subjectId;
	private long mark1;
	private long mark2;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public long getMark1() {
		return mark1;
	}

	public void setMark1(long mark1) {
		this.mark1 = mark1;
	}

	public long getMark2() {
		return mark2;
	}

	public void setMark2(long mark2) {
		this.mark2 = mark2;
	}

	public StudyResult(int studentId, int subjectId, long mark1, long mark2) {
		super();
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public StudyResult() {
		super();
	}

}
