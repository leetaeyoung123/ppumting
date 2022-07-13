package com.ppumting.pm80.trainer.service;

import com.ppumting.pm80.trainer.domain.Trainer;

public class TrainerService {
	private TrainerService instance = new TrainerService();
	
	private TrainerService() {
		
	}
	
	public TrainerService getInstance() {
		return instance;
	}
	
	public void addTrainer(Trainer trainer) {
		
	}
}
