package org.example.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPersonResponse{

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("homeworld")
	private String homeworld;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("skin_color")
	private String skinColor;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("created")
	private String created;

	@JsonProperty("mass")
	private String mass;

	@JsonProperty("vehicles")
	private List<String> vehicles;

	@JsonProperty("url")
	private String url;

	@JsonProperty("hair_color")
	private String hairColor;

	@JsonProperty("birth_year")
	private String birthYear;

	@JsonProperty("eye_color")
	private String eyeColor;

	@JsonProperty("species")
	private List<Object> species;

	@JsonProperty("starships")
	private List<String> starships;

	@JsonProperty("name")
	private String name;

	@JsonProperty("height")
	private String height;

	public void setFilms(List<String> films){
		this.films = films;
	}

	public List<String> getFilms(){
		return films;
	}

	public void setHomeworld(String homeworld){
		this.homeworld = homeworld;
	}

	public String getHomeworld(){
		return homeworld;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setSkinColor(String skinColor){
		this.skinColor = skinColor;
	}

	public String getSkinColor(){
		return skinColor;
	}

	public void setEdited(String edited){
		this.edited = edited;
	}

	public String getEdited(){
		return edited;
	}

	public void setCreated(String created){
		this.created = created;
	}

	public String getCreated(){
		return created;
	}

	public void setMass(String mass){
		this.mass = mass;
	}

	public String getMass(){
		return mass;
	}

	public void setVehicles(List<String> vehicles){
		this.vehicles = vehicles;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setHairColor(String hairColor){
		this.hairColor = hairColor;
	}

	public String getHairColor(){
		return hairColor;
	}

	public void setBirthYear(String birthYear){
		this.birthYear = birthYear;
	}

	public String getBirthYear(){
		return birthYear;
	}

	public void setEyeColor(String eyeColor){
		this.eyeColor = eyeColor;
	}

	public String getEyeColor(){
		return eyeColor;
	}

	public void setSpecies(List<Object> species){
		this.species = species;
	}

	public List<Object> getSpecies(){
		return species;
	}

	public void setStarships(List<String> starships){
		this.starships = starships;
	}

	public List<String> getStarships(){
		return starships;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setHeight(String height){
		this.height = height;
	}

	public String getHeight(){
		return height;
	}
}