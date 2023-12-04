package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Trainer;
import com.demo.repository.TrainerRepository;



@Service
public class TrainerService {

	private final TrainerRepository trepo;
	
	public TrainerService(TrainerRepository trepo) {
		this.trepo = trepo;
		
	}
	
	//get All values
	public List<Trainer> getAllTrained(){
		return trepo.findAll();
		
		
	}
	//get a single value
	public Trainer getTrainerById(int id) {
		return trepo.findById(id).orElse(null);
	}
		
	//post method
		public Trainer createTrainer(Trainer train) {
			return trepo.save(train);
		}
		
		//for put method
		public Trainer updateTrainer(int id, Trainer update) {
			Trainer existingTrainer =trepo.findById(id).orElse(null);
			
			if(existingTrainer == null) {
			return null;
			
		}
			existingTrainer.setTname(update.getTname());
			existingTrainer.setTphone(update.getTphone());
			
			// Clear the existing Member list
		    existingTrainer.getMember().clear();

		    // Add all members from the updated Trainer to the existing Trainer
		    if (update.getMember() != null) {
		        existingTrainer.getMember().addAll(update.getMember());
		    }		   
		    return trepo.save(existingTrainer);
	}
		
		//for delete method
		
		public boolean deleteGym(int id) {
			Trainer existingTrainer=trepo.findById(id).orElse(null);
			
			if(existingTrainer == null)
			{
			return false;
			
		}
			trepo.delete(existingTrainer);
			return true;
		}
}

