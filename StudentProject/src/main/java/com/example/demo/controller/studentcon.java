package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.studententity;
import com.example.demo.service.studentserv;


@RestController
public class studentcon {
	@Autowired 
	studentserv ss;
	@GetMapping("/view")
	public List<studententity>view_stud(){
		return  ss.view_stud();
	}
	@PostMapping("/save")	
	public String save(@RequestBody studententity  s) {
		 return  ss.save(s);
	
}
	@GetMapping("/view/{id}")
	public Optional<studententity>view_one_std(@PathVariable Long id){
		return ss.view_one_stud(id);
	}
	@DeleteMapping("/del/{id}")
	public Optional<studententity>view_one_delete(@PathVariable Long id){
		return ss.view_one_del(id);
	}
}
