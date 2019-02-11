package com.fifa.repo;

import org.springframework.data.repository.CrudRepository;

import com.fifa.entity.PlayerAttributeData;
import com.fifa.entity.PlayerPositionData;


public interface PlayerPositionRepository extends CrudRepository<PlayerPositionData, String>{

}
