package com.expose.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expose.entity.Lead;
import com.expose.repository.LeadRepository;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
	@Autowired
	LeadRepository repoo;
	//http://localhost:8080/api/leads
	@PostMapping
	public void leadInfo(@RequestBody Lead lead) { 
		repoo.save(lead);
	}
	@PutMapping
	public void updateRecord(@RequestBody Lead lead) {
		repoo.save(lead);
	}
	//http://localhost:8080/api/leads/leads/1
	@GetMapping("/leads/{id}")
	public Lead getRecord(@PathVariable long id) {
		Optional<Lead> findById = repoo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	//http://localhost:8080/api/leads/leads/1
	@DeleteMapping("/leads/{id}")
	public void deleteRecord(@PathVariable long id) {
		repoo.deleteById(id);
	}
}
