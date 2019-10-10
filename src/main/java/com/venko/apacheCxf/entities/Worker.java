package com.venko.apacheCxf.entities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Worker")
public class Worker {
	
	private String name;
	private int age;
	private List<String> skills = new ArrayList<String>();
	
	public Worker() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	

}
