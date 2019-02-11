package com.fifa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PlayerPersonalDetails {
	@Id
	private String id;
	private String name;
	private String age;
	private String photo;
	private String nationality;
	private String flag;
	private String overall;
	private String potential;
	private String club;
	//@Column(name="Club Logo")
	private String clubLogo;
	private String value;
	private String wage;
	private String special;
	
	public PlayerPersonalDetails() {}
	
	
	public PlayerPersonalDetails(String playerId) {
		super();
		this.id = playerId;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getOverall() {
		return overall;
	}
	public void setOverall(String overall) {
		this.overall = overall;
	}
	public String getPotential() {
		return potential;
	}
	public void setPotential(String potential) {
		this.potential = potential;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getClubLogo() {
		return clubLogo;
	}
	public void setClubLogo(String clubLogo) {
		this.clubLogo = clubLogo;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getWage() {
		return wage;
	}
	public void setWage(String wage) {
		this.wage = wage;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}

}
