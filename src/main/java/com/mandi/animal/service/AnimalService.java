package com.mandi.animal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mandi.animal.model.AnimalInfo;

@Service
public interface AnimalService {
	public AnimalInfo saveAnimalInfo(AnimalInfo animalInfo);

	public AnimalInfo updateAnimalInfo(AnimalInfo animalInfo);

	public List<AnimalInfo> getAllAnimalInfo();
	
	public void deleteAnimalInfo(Long id);

//	public boolean deleteAnimal(Long id, String farmerid);
	

	public List<AnimalInfo> getAnimaByPrice(int price);

	public List<AnimalInfo> getAnimalByname(String name);

	public List<AnimalInfo> getAnimalBystate(String state);

	public List<AnimalInfo> getAnimalBybreed(String breed);

	public List<AnimalInfo> getTop(int top);

	public List<AnimalInfo> getTopName(String name);
}