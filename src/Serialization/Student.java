package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;
	private int rollno;
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, int rollno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	void display() {
		System.out.println("I am "+this.name);
	}
	

}
