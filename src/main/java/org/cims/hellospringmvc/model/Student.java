package org.cims.hellospringmvc.model;

import java.util.Date;
import java.io.Serializable;

public class Student implements Serializable {
	/**
   * 
   */
  private static final long serialVersionUID = 1L;
  private Integer studId;
	private String name;
	private String email;
	private Date dob;
	
	public void setStudId(Integer studId){
		this.studId = studId;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setDob(Date dob){
		this.dob = dob;
	}
	public Integer getStudId(){
		return this.studId;
	}
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public Date getDate(){
		return this.dob;
	}
	
	@Override
	public String toString(){
		return "ID: "+this.studId+" "+"Name: "+this.name+" "+"Email: "+this.email+" "+"Birthday: "+this.dob;
	}
}