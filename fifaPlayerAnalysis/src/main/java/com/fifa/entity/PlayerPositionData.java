package com.fifa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PlayerPositionData {

	@Column(name = "Id")
	@Id
	private String playerId;
	private String CAM;
	private String CB;
	private String CDM;
	private String CF;
	private String CM;
	private String LAM;
	private String LB;
	private String LCB;
	private String LCM;
	private String LDM;
	private String LF;
	private String LM;
	private String LS;
	private String LW;
	private String LWB;
	//@Column(name = "Preferred Position")
	private String PreferredPositions;
	private String RAM;
	private String RB;
	private String RCB;
	private String RCM;
	private String RDM;
	private String RF;
	private String RM;
	private String RS;
	private String RW;
	private String RWB;
	private String ST;
	
	@OneToOne(fetch = FetchType.LAZY)
	private PlayerPersonalDetails playerPersonalDetails;
	
	
	public PlayerPersonalDetails getPlayerPersonalDetails1() {
		return playerPersonalDetails;
	}

	public void setPlayerPersonalDetails1(PlayerPersonalDetails playerPersonalDetails) {
		this.playerPersonalDetails = playerPersonalDetails;
	}

	public PlayerPositionData() {}
	
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getCAM() {
		return CAM;
	}
	public void setCAM(String cAM) {
		CAM = cAM;
	}
	public String getCB() {
		return CB;
	}
	public void setCB(String cB) {
		CB = cB;
	}
	public String getCDM() {
		return CDM;
	}
	public void setCDM(String cDM) {
		CDM = cDM;
	}
	public String getCF() {
		return CF;
	}
	public void setCF(String cF) {
		CF = cF;
	}
	public String getCM() {
		return CM;
	}
	public void setCM(String cM) {
		CM = cM;
	}
	public String getLAM() {
		return LAM;
	}
	public void setLAM(String lAM) {
		LAM = lAM;
	}
	public String getLB() {
		return LB;
	}
	public void setLB(String lB) {
		LB = lB;
	}
	public String getLCB() {
		return LCB;
	}
	public void setLCB(String lCB) {
		LCB = lCB;
	}
	public String getLCM() {
		return LCM;
	}
	public void setLCM(String lCM) {
		LCM = lCM;
	}
	public String getLDM() {
		return LDM;
	}
	public void setLDM(String lDM) {
		LDM = lDM;
	}
	public String getLF() {
		return LF;
	}
	public void setLF(String lF) {
		LF = lF;
	}
	public String getLM() {
		return LM;
	}
	public void setLM(String lM) {
		LM = lM;
	}
	public String getLS() {
		return LS;
	}
	public void setLS(String lS) {
		LS = lS;
	}
	public String getLW() {
		return LW;
	}
	public void setLW(String lW) {
		LW = lW;
	}
	public String getLWB() {
		return LWB;
	}
	public void setLWB(String lWB) {
		LWB = lWB;
	}
	public String getPreferredPositions() {
		return PreferredPositions;
	}
	public void setPreferredPositions(String preferredPositions) {
		PreferredPositions = preferredPositions;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getRB() {
		return RB;
	}
	public void setRB(String rB) {
		RB = rB;
	}
	public String getRCB() {
		return RCB;
	}
	public void setRCB(String rCB) {
		RCB = rCB;
	}
	public String getRCM() {
		return RCM;
	}
	public void setRCM(String rCM) {
		RCM = rCM;
	}
	public String getRDM() {
		return RDM;
	}
	public void setRDM(String rDM) {
		RDM = rDM;
	}
	public String getRF() {
		return RF;
	}
	public void setRF(String rF) {
		RF = rF;
	}
	public String getRM() {
		return RM;
	}
	public void setRM(String rM) {
		RM = rM;
	}
	public String getRS() {
		return RS;
	}
	public void setRS(String rS) {
		RS = rS;
	}
	public String getRW() {
		return RW;
	}
	public void setRW(String rW) {
		RW = rW;
	}
	public String getRWB() {
		return RWB;
	}
	public void setRWB(String rWB) {
		RWB = rWB;
	}
	public String getST() {
		return ST;
	}
	public void setST(String sT) {
		ST = sT;
	}
	

}
