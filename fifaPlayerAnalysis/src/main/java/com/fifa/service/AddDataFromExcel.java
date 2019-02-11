package com.fifa.service;

import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Properties;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fifa.entity.PlayerAttributeData;
import com.fifa.entity.PlayerPersonalDetails;
import com.fifa.entity.PlayerPositionData;
import com.fifa.repo.PlayerAttributeRepository;
import com.fifa.repo.PlayerDetailsRepository;
import com.fifa.repo.PlayerPositionRepository;

@Service
public class AddDataFromExcel {
	
	
	@Autowired
	private PlayerDetailsRepository playerDetailsRepository;
	
	@Autowired
	private PlayerAttributeRepository playerAttributeRepository;
	
	@Autowired
	private PlayerPositionRepository playerPositionRepository;
	
	
	public static void main(String[] args) {
		//readPersonalData();
	}
	
	public void fillData() throws Exception{
		readPersonalData();
		readAttributeData();
		readPositionData();
	}
	
	public void readPersonalData() throws Exception{
		try {
			
            
			
			FileReader reader=new FileReader("paths.properties");  
			Properties p=new Properties();  
		    p.load(reader);
			
			
			Reader reader1 = Files.newBufferedReader(Paths.get(p.getProperty("playerPersonalDetailPath")));
            
			CSVParser csvParser = new CSVParser(reader1, CSVFormat.DEFAULT);
			//Create Workbook instance holding reference to .xlsx file
            Iterator<CSVRecord> itr = csvParser.iterator();
            itr.next();
            while(itr.hasNext()){
            	playerDetailsRepository.save(setPlayerPersonalDetail(itr.next()));
            }
			System.out.println("Saved 1");
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
	public void readAttributeData() throws Exception{
		try {
			
            
			
			FileReader reader=new FileReader("paths.properties");  
			Properties p=new Properties();  
		    p.load(reader);
			
			
			Reader reader1 = Files.newBufferedReader(Paths.get(p.getProperty("playerAttributeDetailPath")));
            CSVParser csvParser = new CSVParser(reader1, CSVFormat.DEFAULT);
			//Create Workbook instance holding reference to .xlsx file
            Iterator<CSVRecord> itr = csvParser.iterator();
            itr.next();
            while(itr.hasNext()){
            	playerAttributeRepository.save(setPlayerAttributeData(itr.next()));
            }
			System.out.println("Saved 1");
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public void readPositionData() throws Exception{
	try {
		FileReader reader=new FileReader("paths.properties");  
		Properties p=new Properties();  
	    p.load(reader);
		
		
		Reader reader1 = Files.newBufferedReader(Paths.get(p.getProperty("playerPositionDataPath")));
        CSVParser csvParser = new CSVParser(reader1, CSVFormat.DEFAULT);
		//Create Workbook instance holding reference to .xlsx file
        Iterator<CSVRecord> itr = csvParser.iterator();
        itr.next();
        while(itr.hasNext()){
        	playerPositionRepository.save(setPlayerPositionData(itr.next()));
        }
		System.out.println("Saved 1");
	}catch(Exception e) {
		e.printStackTrace();
		throw e;
	}
		
	}
	
	public PlayerPositionData setPlayerPositionData(CSVRecord row) {
		PlayerPositionData positionData = new PlayerPositionData();
		positionData.setCAM(row.get(1).toString());
		positionData.setCB(row.get(2).toString());
		positionData.setCDM(row.get(3).toString());
		positionData.setCF(row.get(4).toString());
		positionData.setCM(row.get(5).toString());
		positionData.setPlayerId(row.get(6).toString());
		positionData.setLAM(row.get(7).toString());
		positionData.setLB(row.get(8).toString());
		positionData.setLCB(row.get(8).toString());
		positionData.setLCM(row.get(10).toString());
		positionData.setLDM(row.get(11).toString());
		positionData.setLF(row.get(12).toString());
		positionData.setLM(row.get(13).toString());
		positionData.setLS(row.get(14).toString());
		positionData.setLW(row.get(15).toString());
		positionData.setLWB(row.get(16).toString());
		positionData.setPreferredPositions(row.get(17).toString());
		positionData.setRAM(row.get(18).toString());
		positionData.setRB(row.get(19).toString());
		positionData.setRCB(row.get(20).toString());
		positionData.setRCM(row.get(21).toString());
		positionData.setRDM(row.get(22).toString());
		positionData.setRF(row.get(23).toString());
		positionData.setRM(row.get(24).toString());
		positionData.setRS(row.get(25).toString());
		positionData.setRW(row.get(26).toString());
		positionData.setRWB(row.get(27).toString());
		positionData.setST(row.get(28).toString());
		
		positionData.setPlayerPersonalDetails1(new PlayerPersonalDetails(positionData.getPlayerId()));
		
		return positionData;
		
	}
	
	
	public PlayerAttributeData setPlayerAttributeData(CSVRecord row) {
		PlayerAttributeData playerAttributeData = new PlayerAttributeData();
		playerAttributeData.setAcceleration(row.get(1).toString());
		playerAttributeData.setAggression(row.get(2).toString());
		playerAttributeData.setAgility(row.get(3).toString());
		playerAttributeData.setBalance(row.get(4).toString());
		playerAttributeData.setBallControl(row.get(5).toString());
		playerAttributeData.setComposure(row.get(6).toString());
		playerAttributeData.setCrossing(row.get(7).toString());
		playerAttributeData.setCurve(row.get(8).toString());
		playerAttributeData.setDribbing(row.get(9).toString());
		playerAttributeData.setFinishing(row.get(10).toString());
		playerAttributeData.setFreeKickAccuracy(row.get(11).toString());
		playerAttributeData.setGkDiving(row.get(12).toString());
		playerAttributeData.setGkHandling(row.get(13).toString());
		playerAttributeData.setGkKicking(row.get(14).toString());
		playerAttributeData.setGkPositioning(row.get(15).toString());
		playerAttributeData.setGkReflexes(row.get(16).toString());
		playerAttributeData.setHeadingAccuracy(row.get(17).toString());
		playerAttributeData.setPlayerId(row.get(18).toString());
		playerAttributeData.setInterceptions(row.get(19).toString());
		playerAttributeData.setJumping(row.get(20).toString());
		playerAttributeData.setLongPassing(row.get(21).toString());
		playerAttributeData.setLongShots(row.get(22).toString());
		playerAttributeData.setMarking(row.get(23).toString());
		playerAttributeData.setPenalties(row.get(24).toString());
		playerAttributeData.setPositioning(row.get(25).toString());
		playerAttributeData.setReactions(row.get(26).toString());
		playerAttributeData.setShortPassing(row.get(27).toString());
		playerAttributeData.setShotPower(row.get(28).toString());
		playerAttributeData.setSlidingTackle(row.get(29).toString());
		playerAttributeData.setSprintSpeed(row.get(30).toString());
		playerAttributeData.setStamina(row.get(31).toString());
		playerAttributeData.setStandingTackle(row.get(32).toString());
		playerAttributeData.setStrength(row.get(33).toString());
		playerAttributeData.setVision(row.get(34).toString());
		playerAttributeData.setVolleys(row.get(35).toString());
		
		playerAttributeData.setPlayerPersonalDetails(new PlayerPersonalDetails(playerAttributeData.getPlayerId()));
		
		return playerAttributeData;
	}
	
	public PlayerPersonalDetails setPlayerPersonalDetail(CSVRecord row) {
		PlayerPersonalDetails playerPersonalDetails = new PlayerPersonalDetails();
		playerPersonalDetails.setId(row.get(2).toString());
		playerPersonalDetails.setName(row.get(3).toString());
		playerPersonalDetails.setAge(row.get(4).toString());
		playerPersonalDetails.setPhoto(row.get(5).toString());
		playerPersonalDetails.setNationality(row.get(6).toString());
		playerPersonalDetails.setFlag(row.get(7).toString());
		playerPersonalDetails.setOverall(row.get(8).toString());
		playerPersonalDetails.setPotential(row.get(9).toString());
		playerPersonalDetails.setClub(row.get(10).toString());
		playerPersonalDetails.setClubLogo(row.get(11).toString());
		playerPersonalDetails.setValue(row.get(12).toString());
		playerPersonalDetails.setWage(row.get(13).toString());
		playerPersonalDetails.setSpecial(row.get(14).toString());
		return playerPersonalDetails;
	}
}
