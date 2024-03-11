package com.mandi.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mandi.animal.model.AnimalInfo;
import com.mandi.animal.model.DeleteAnimal;
import com.mandi.animal.service.AnimalService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AnimalController {
	@Autowired
	private AnimalService animalService;

	@GetMapping("/animal")
	public List<AnimalInfo> getAllAnimal() {
		return this.animalService.getAllAnimalInfo();
	}

	@PostMapping("/animal")
	public AnimalInfo saveAnimalInfo(@RequestBody AnimalInfo animalInfo) {
		return this.animalService.saveAnimalInfo(animalInfo);
	}

	@PutMapping("/animal")
	public AnimalInfo updateAnimalInfo(@RequestBody AnimalInfo animalInfo) {
		return this.animalService.updateAnimalInfo(animalInfo);
	}

	@DeleteMapping("/animal")
	public boolean deleteAnimal(@RequestBody DeleteAnimal deleteAnimal) {
		return this.animalService.deleteAnimal(deleteAnimal.getId(), deleteAnimal.getFarmerid());
	}

	@GetMapping("/animalprice/{price}")
	public List<AnimalInfo> getAnimalByPrice(@PathVariable("price") int price) {
		return this.animalService.getAnimaByPrice(price);
	}

	@GetMapping("/animalname/{name}")
	public List<AnimalInfo> getAnimalByName(@PathVariable("name") String name) {
		return this.animalService.getAnimalByname(name);
	}

	@GetMapping("/animalstate/{state}")
	public List<AnimalInfo> getAnimalByState(@PathVariable("state") String state) {
		return this.animalService.getAnimalBystate(state);
	}

	@GetMapping("/animalbreed/{breed}")
	public List<AnimalInfo> getAnimalByBreed(@PathVariable("breed") String breed) {
		return this.animalService.getAnimalBybreed(breed);
	}

	@GetMapping("/animaltop/{top}")
	public List<AnimalInfo> getTop(@PathVariable("top") int top) {
		return this.animalService.getTop(top);
	}
}
