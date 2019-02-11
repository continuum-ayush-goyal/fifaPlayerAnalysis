package com.fifa.entity;

public class ResponseData {

	private PlayerPersonalDetails details;
	private PlayerAttributeData attribute;
	private PlayerPositionData position;
	public PlayerPersonalDetails getDetails() {
		return details;
	}
	public void setDetails(PlayerPersonalDetails details) {
		this.details = details;
	}
	public PlayerAttributeData getAttribute() {
		return attribute;
	}
	public void setAttribute(PlayerAttributeData attribute) {
		this.attribute = attribute;
	}
	public PlayerPositionData getPosition() {
		return position;
	}
	public void setPosition(PlayerPositionData position) {
		this.position = position;
	}
	
}
