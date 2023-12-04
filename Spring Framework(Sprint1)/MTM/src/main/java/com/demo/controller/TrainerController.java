package com.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Trainer;
import com.demo.service.TrainerService;

@RestController
@RequestMapping("/Trainers")
public class TrainerController {

	private final TrainerService service;
	public TrainerController(TrainerService service) {
		this.service=service;
	}
	
	@GetMapping("/get/All")
	public ResponseEntity<List<Trainer>> getAllTrainer(){
		List<Trainer> trainer =service.getAllTrained();
		return ResponseEntity.ok(trainer);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Trainer> getTrainerById(@PathVariable int id){
		Trainer trainer=service.getTrainerById(id);
		if(trainer != null) {
		return ResponseEntity.ok(trainer);
		
	}
		else {
			return ResponseEntity.notFound().build();
		}
	
}
	@PostMapping("/addTrainer")
	public ResponseEntity<String> createTrainer(@RequestBody Trainer trainer){
		Trainer createTrain=service.createTrainer(trainer);
		if(createTrain !=null) {
			return ResponseEntity.status(HttpStatus.CREATED).body("Gym Trainer with Id" + createTrain.getTid() +" added Successfully");
			
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create Trainer ID");
		
		}
	
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<String>  updateTrainer(@PathVariable int id,@RequestBody Trainer updateTrainer){
		Trainer trainer=service.updateTrainer(id, updateTrainer);
		if(trainer != null) {
		
			return ResponseEntity.status(HttpStatus.CREATED).body("Trainer with ID "+id + " updated successfully");	
			}
		else {
			return ResponseEntity.notFound().build();
			}	
		}
	
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteTrainer(@PathVariable int id){
		boolean isdeleted=service.deleteGym(id);
		if(isdeleted) {
		
			return ResponseEntity.ok("Trainer with ID "+id + " was deleted successfully");	
			}
		else {
			return ResponseEntity.notFound().build();
			}	
		}
	
	
}
