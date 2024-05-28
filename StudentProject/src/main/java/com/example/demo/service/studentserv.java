package com.example.demo.service;



import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.studententity;
import com.example.demo.repository.studentrep;
@Service
public class studentserv {
	@Autowired
	studentrep sr;
	
	
	public String save(studententity s) {
		
		sr.save(s);
		return "data save";
		
	}
	public List<studententity>view_stud(){
		return sr.findAll();
		
	}
	public Optional<studententity>view_one_stud(Long id){
		
		return sr.findById(id);
		
		
		
		
		
	}
	
	public Optional<studententity> view_one_del(Long id){
		 sr.deleteById(id);
		return null;
		
	}



}
