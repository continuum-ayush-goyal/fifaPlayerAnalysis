package com.fifa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fifa.entity.RequestData;
import com.fifa.entity.ResponseData;
import com.fifa.service.PlayerAnalysisService;

@RestController
public class PlayerAnalysisController {

	@Autowired
	private PlayerAnalysisService playerAnalysisService;
	
	@RequestMapping(method=RequestMethod.POST,value = "/player")
	public List<ResponseData> get_player_info(@RequestBody RequestData req) {
		return playerAnalysisService.get_player_info(req.getName());
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST,value = "/club")
	public List<ResponseData> get_club_player_list(@RequestBody RequestData req) {
		return playerAnalysisService.get_club_player_list(req.getName());
	}
}
