package com.venko.apacheCxf.repostories;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.venko.apacheCxf.entities.Department;
import com.venko.apacheCxf.entities.Worker;

@Path("/worker")
@Produces(MediaType.APPLICATION_XML)
public class WorkerRepository {

	@GET
	@Path("/getDepDetails")
	public Department getDepDetails() {
		Department department = new Department();	
		Worker worker = new Worker();
		worker.setAge(27);
		worker.setName("Kevin");
		List<String> skills = new ArrayList<String>();
		skills.add("Oracle");
		skills.add("IBM");
		skills.add("JAVA");
		skills.add("Javascript");
		skills.add("PHP");
		skills.add("Mongo");
		skills.add("Cassandra");
		worker.getSkills().addAll(skills);
		
		department.setName("DEVELOPMENT");
		department.getWorkers().add(worker); 
		
		
		return department;
		
	} 
	
	
	
}
