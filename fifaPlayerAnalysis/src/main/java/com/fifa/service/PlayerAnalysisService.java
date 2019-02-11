package com.fifa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fifa.entity.PlayerAttributeData;
import com.fifa.entity.PlayerPersonalDetails;
import com.fifa.entity.PlayerPositionData;
import com.fifa.entity.ResponseData;
import com.fifa.repo.PlayerAttributeRepository;
import com.fifa.repo.PlayerDetailsRepository;
import com.fifa.repo.PlayerPositionRepository;

@Service
public class PlayerAnalysisService {

	
	
	@Autowired
	private PlayerDetailsRepository playerDetailsRepository;
	
	@Autowired
	private PlayerAttributeRepository playerAttributeRepository;
	
	@Autowired
	private PlayerPositionRepository playerPositionRepository;
	
	
	public List<ResponseData> get_player_info(String name) {
		List<ResponseData> result = new ArrayList<>();
		List<PlayerPersonalDetails> player = new ArrayList<>();
		playerDetailsRepository.findByName(name)
		.forEach(player::add);
		ResponseData r = null;
		
		PlayerAttributeData attr = null;
		PlayerPositionData pos = null;
		
		for(int i = 0;i<player.size();i++) {
			String id = player.get(i).getId();
			attr = playerAttributeRepository.findById(id).orElse(null);
			pos = playerPositionRepository.findById(id).orElse(null);
			//adding data
			//r = null;
			r = new ResponseData();
			r.setDetails(player.get(i));
			r.setAttribute(attr);
			r.setPosition(pos);
			result.add(r);
			
		}
		return result;
	}
	
	public List<ResponseData> get_club_player_list(String club) {
		List<ResponseData> result = new ArrayList<>();
		List<PlayerPersonalDetails> player = new ArrayList<>();
		playerDetailsRepository.findByClub(club)
		.forEach(player::add);
		ResponseData r = null;
		
		PlayerAttributeData attr = null;
		PlayerPositionData pos = null;
		
		for(int i = 0;i<player.size();i++) {
			String id = player.get(i).getId();
			attr = playerAttributeRepository.findById(id).orElse(null);
			pos = playerPositionRepository.findById(id).orElse(null);
			//adding data
			r=  new ResponseData();
			r.setDetails(player.get(i));
			r.setAttribute(attr);
			r.setPosition(pos);
			result.add(r);
		}
		return result;
	}
	
	
}
