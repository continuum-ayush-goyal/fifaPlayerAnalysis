package com.fifa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PlayerAttributeData {
	@Column(name = "Id")
	@Id
	private String playerId;
	private String acceleration;
	private String aggression;
	private String agility;
	private String balance;
	//@Column(name = "Ball Control")
	private String ballControl;
	private String composure;
	private String crossing;
	private String curve;
	private String dribbing;
	private String finishing;
	private String freeKickAccuracy;
	private String gkDiving;
	private String gkHandling;
	private String gkKicking;
	private String gkPositioning;
	private String gkReflexes;
	private String headingAccuracy;
	private String interceptions;
	private String jumping;
	private String longPassing;
	private String longShots;
	private String marking;
	private String penalties;
	private String positioning;
	private String reactions;
	private String shortPassing;
	private String shotPower;
	private String slidingTackle;
	private String sprintSpeed;
	private String stamina;
	private String standingTackle;
	private String strength;
	private String vision;
	private String volleys;
	
	@OneToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "id")
	private PlayerPersonalDetails playerPersonalDetails;

	public String getPositioning() {
		return positioning;
	}

	public void setPositioning(String positioning) {
		this.positioning = positioning;
	}
	
	public PlayerPersonalDetails getPlayerPersonalDetails() {
		return playerPersonalDetails;
	}

	public void setPlayerPersonalDetails(PlayerPersonalDetails playerPersonalDetails) {
		this.playerPersonalDetails = playerPersonalDetails;
	}

	public PlayerAttributeData() {}
	
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}
	public String getAggression() {
		return aggression;
	}
	public void setAggression(String aggression) {
		this.aggression = aggression;
	}
	public String getAgility() {
		return agility;
	}
	public void setAgility(String agility) {
		this.agility = agility;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBallControl() {
		return ballControl;
	}
	public void setBallControl(String ballControl) {
		this.ballControl = ballControl;
	}
	public String getComposure() {
		return composure;
	}
	public void setComposure(String composure) {
		this.composure = composure;
	}
	public String getCrossing() {
		return crossing;
	}
	public void setCrossing(String crossing) {
		this.crossing = crossing;
	}
	public String getCurve() {
		return curve;
	}
	public void setCurve(String curve) {
		this.curve = curve;
	}
	public String getDribbing() {
		return dribbing;
	}
	public void setDribbing(String dribbing) {
		this.dribbing = dribbing;
	}
	public String getFinishing() {
		return finishing;
	}
	public void setFinishing(String finishing) {
		this.finishing = finishing;
	}
	public String getFreeKickAccuracy() {
		return freeKickAccuracy;
	}
	public void setFreeKickAccuracy(String freeKickAccuracy) {
		this.freeKickAccuracy = freeKickAccuracy;
	}
	public String getGkDiving() {
		return gkDiving;
	}
	public void setGkDiving(String gkDiving) {
		this.gkDiving = gkDiving;
	}
	public String getGkHandling() {
		return gkHandling;
	}
	public void setGkHandling(String gkHandling) {
		this.gkHandling = gkHandling;
	}
	public String getGkKicking() {
		return gkKicking;
	}
	public void setGkKicking(String gkKicking) {
		this.gkKicking = gkKicking;
	}
	public String getGkPositioning() {
		return gkPositioning;
	}
	public void setGkPositioning(String gkPositioning) {
		this.gkPositioning = gkPositioning;
	}
	public String getGkReflexes() {
		return gkReflexes;
	}
	public void setGkReflexes(String gkReflexes) {
		this.gkReflexes = gkReflexes;
	}
	public String getHeadingAccuracy() {
		return headingAccuracy;
	}
	public void setHeadingAccuracy(String headingAccuracy) {
		this.headingAccuracy = headingAccuracy;
	}
	public String getInterceptions() {
		return interceptions;
	}
	public void setInterceptions(String interceptions) {
		this.interceptions = interceptions;
	}
	public String getJumping() {
		return jumping;
	}
	public void setJumping(String jumping) {
		this.jumping = jumping;
	}
	public String getLongPassing() {
		return longPassing;
	}
	public void setLongPassing(String longPassing) {
		this.longPassing = longPassing;
	}
	public String getLongShots() {
		return longShots;
	}
	public void setLongShots(String longShots) {
		this.longShots = longShots;
	}
	public String getMarking() {
		return marking;
	}
	public void setMarking(String marking) {
		this.marking = marking;
	}
	public String getPenalties() {
		return penalties;
	}
	public void setPenalties(String penalties) {
		this.penalties = penalties;
	}
	public String getReactions() {
		return reactions;
	}
	public void setReactions(String reactions) {
		this.reactions = reactions;
	}
	public String getShortPassing() {
		return shortPassing;
	}
	public void setShortPassing(String shortPassing) {
		this.shortPassing = shortPassing;
	}
	public String getShotPower() {
		return shotPower;
	}
	public void setShotPower(String shotPower) {
		this.shotPower = shotPower;
	}
	public String getSlidingTackle() {
		return slidingTackle;
	}
	public void setSlidingTackle(String slidingTackle) {
		this.slidingTackle = slidingTackle;
	}
	public String getSprintSpeed() {
		return sprintSpeed;
	}
	public void setSprintSpeed(String sprintSpeed) {
		this.sprintSpeed = sprintSpeed;
	}
	public String getStamina() {
		return stamina;
	}
	public void setStamina(String stamina) {
		this.stamina = stamina;
	}
	public String getStandingTackle() {
		return standingTackle;
	}
	public void setStandingTackle(String standingTackle) {
		this.standingTackle = standingTackle;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getVision() {
		return vision;
	}
	public void setVision(String vision) {
		this.vision = vision;
	}
	public String getVolleys() {
		return volleys;
	}
	public void setVolleys(String volleys) {
		this.volleys = volleys;
	}
	
	
}
