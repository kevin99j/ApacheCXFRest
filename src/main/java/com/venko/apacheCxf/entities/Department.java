package com.venko.apacheCxf.entities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Department")
public class Department {
	private String name;
	private List<Worker> workers = new ArrayList<Worker>();
	
	public Department() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Worker> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}
	
	

}
