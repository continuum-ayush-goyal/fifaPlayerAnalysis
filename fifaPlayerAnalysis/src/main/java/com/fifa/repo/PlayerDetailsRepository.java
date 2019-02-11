package com.fifa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fifa.entity.PlayerPersonalDetails;


public interface PlayerDetailsRepository extends CrudRepository<PlayerPersonalDetails, String>{

	
	public List<PlayerPersonalDetails> findByName (String name);
	public List<PlayerPersonalDetails> findByClub (String club);
}
