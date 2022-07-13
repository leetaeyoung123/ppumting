package com.ppumting.pm80.trainer.service;

import com.ppumting.pm80.trainer.domain.Trainer;

public class Trainerservice {
	private Trainerservice instance = new Trainerservice();
	
	private Trainerservice() {
		
	}
	
	public Trainerservice getInstance() {
		return instance;
	}
	
	public void addTrainer(Trainer trainer) {
		
	}
}
