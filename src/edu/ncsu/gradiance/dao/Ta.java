package edu.ncsu.gradiance.dao;

// Generated Oct 20, 2014 5:39:06 PM by Hibernate Tools 4.3.1

/**
 * Ta generated by hbm2java
 */
public class Ta implements java.io.Serializable {

	private String sid;
	private Student student;
	private String name;

	public Ta() {
	}

	public Ta(Student student, String name) {
		this.student = student;
		this.name = name;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
