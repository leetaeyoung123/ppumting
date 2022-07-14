package com.ppumting.pm80.trainer.service;

import java.util.List;

import com.ppumting.pm80.trainer.dao.TrainerDao;
import com.ppumting.pm80.trainer.domain.Trainer;

public class TrainerService {
	private static TrainerService instance = new TrainerService(); //싱글톤
	private TrainerDao trainerDao = TrainerDao.getInstance();
	
	public static TrainerService getInstance() {
		return instance;
	}
	
	public void addTrainer(Trainer trainer) {
		trainerDao.addTrainer(trainer);	
	}

	public List<Trainer> findAllTrainers() {
		return trainerDao.findAllTrainers();
	}

	public boolean isValidTrainers(String trainerId, String passwd) {
		return trainerDao.isValidTrainers(trainerId, passwd);
	}
}
