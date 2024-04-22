package com.mandi.animal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mandi.animal.model.AnimalInfo;
import com.mandi.animal.repo.AnimalRepo;

@Component
public class AnimalServiceImp implements AnimalService {

	@Autowired
	private AnimalRepo animalRepo;

	@Override
	public AnimalInfo saveAnimalInfo(AnimalInfo animalInfo) {
		return this.animalRepo.save(animalInfo);
	}

	@Override
	public AnimalInfo updateAnimalInfo(AnimalInfo animalInfo) {
		return this.animalRepo.saveAndFlush(animalInfo);
	}

	@Override
	public List<AnimalInfo> getAllAnimalInfo() {
		return this.animalRepo.findAll();
	}

	
//	@Override
//	public boolean deleteAnimal(Long id, String farmerid) {
//		try {
//			this.animalRepo.deleteAnimalbyidAndfarmerid(id, farmerid);
//			return true;
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//	}
	
	

	@Override
	public List<AnimalInfo> getAnimaByPrice(int price) {
		return this.animalRepo.getAnimalByprice(price);
	}

	@Override
	public List<AnimalInfo> getAnimalByname(String name) {
		return this.animalRepo.getAnimalByname(name);
	}

	@Override
	public List<AnimalInfo> getAnimalBystate(String state) {
		return this.animalRepo.getAnimalBystate(state);
	}

	@Override
	public List<AnimalInfo> getAnimalBybreed(String breed) {
		return this.animalRepo.getAnimalBybreed(breed);
	}

	@Override
	public List<AnimalInfo> getTop(int top) {
		return this.animalRepo.getTop(top);
	}

	@Override
	public List<AnimalInfo> getTopName(String name) {
		return this.animalRepo.getTopName(name, 10);
	}

	@Override
	public void deleteAnimalInfo(Long id) {
	
		this.animalRepo.deleteById(id);
	}

	
	
	
}