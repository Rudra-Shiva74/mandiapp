package com.mandi.animal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mandi.animal.model.AnimalInfo;

@Repository
public interface AnimalRepo extends JpaRepository<AnimalInfo, Long> {
	public List<AnimalInfo> getAnimalByprice(int price);

	@Query("DELETE FROM AnimalInfo u WHERE u.id = :id AND u.farmerid = :farmerid")
	public boolean deleteAnimalbyidAndfarmerid(Long id, String farmerid);

	public List<AnimalInfo> getAnimalByname(String name);

	public List<AnimalInfo> getAnimalBystate(String state);

	public List<AnimalInfo> getAnimalBybreed(String breed);

	@Query("SELECT u FROM AnimalInfo u  ORDER BY u.id DESC LIMIT :top") 
	public List<AnimalInfo> getTop(int top);

}
