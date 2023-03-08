package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.service.service;

@RestController
@CrossOrigin
public class controller {
	@Autowired
        service s;
	
	@PostMapping("/add")
	public model addInfo(@RequestBody model st) {
		return s.saveDetails(st);
	}
	
	@GetMapping("/showDetails")
	public List<model> fetchDetails(){
		return s.getDetails();
	}
	
	@PutMapping("/updateDetails")
	public model updateInfo(@RequestBody model st1) {
		return s.updateDetails(st1);
	}
	@DeleteMapping("/deleteDetails/{id}")
	public String deleteInfo(@PathVariable("id")int id) {
		s.deleteDetails(id);
		return "The element is deleted";
	}
	
	//sorting
	@GetMapping("/sort/{field}")
	public List<model> getWithSort(@PathVariable String field){
		return s.getSorted(field);
	}
	
	//pagination
	@GetMapping("/pagination/{offset}/{pageSize}")
	public List<model> productsWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		return s.getWithPagination(offset, pageSize);
	}
	
        
}
