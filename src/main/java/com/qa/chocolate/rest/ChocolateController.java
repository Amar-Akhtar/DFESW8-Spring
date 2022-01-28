package com.qa.chocolate.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.chocolate.domain.Chocolate;

@RestController
public class ChocolateController {

	private List<Chocolate> choco = new ArrayList<>();
	
	//CRUD
	
	//Create - Post
	@PostMapping("/createChoco")
	public void createChoco(@RequestBody Chocolate c) {
		//service -> create
		this.choco.add(c);
	}
	
	//insert into chocolate(name, brand, ...) values("dairy milk", "cadbury",...)
	
	//Read - Get
	@GetMapping("/getChoco")
	public List<Chocolate> getChoco(){
		return this.choco;
	
	}
	//Read By - ID - GET
	@GetMapping("/getOne/{id}")
	public Chocolate getOne(@PathVariable int id) {
		return this.choco.get(id);
	}
	
	
	//Update - Put/Patch (PUT)
	
	//Delete - Delete
	@DeleteMapping("/removeChoco/{id}")
	public Chocolate removeChoco(@PathVariable int id) {
		return this.choco.remove(id);
	
	}
	


}
