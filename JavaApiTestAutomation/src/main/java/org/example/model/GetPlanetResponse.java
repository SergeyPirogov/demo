package org.example.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPlanetResponse{

	@JsonProperty("films")
	private List<String> films;

	@JsonProperty("edited")
	private String edited;

	@JsonProperty("created")
	private String created;

	@JsonProperty("climate")
	private String climate;

	@JsonProperty("rotation_period")
	private String rotationPeriod;

	@JsonProperty("url")
	private String url;

	@JsonProperty("population")
	private String population;

	@JsonProperty("orbital_period")
	private String orbitalPeriod;

	@JsonProperty("surface_water")
	private String surfaceWater;

	@JsonProperty("diameter")
	private String diameter;

	@JsonProperty("gravity")
	private String gravity;

	@JsonProperty("name")
	private String name;

	@JsonProperty("residents")
	private List<Object> residents;

	@JsonProperty("terrain")
	private String terrain;

	public void setFilms(List<String> films){
		this.films = films;
	}

	public List<String> getFilms(){
		return films;
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

	public void setClimate(String climate){
		this.climate = climate;
	}

	public String getClimate(){
		return climate;
	}

	public void setRotationPeriod(String rotationPeriod){
		this.rotationPeriod = rotationPeriod;
	}

	public String getRotationPeriod(){
		return rotationPeriod;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setPopulation(String population){
		this.population = population;
	}

	public String getPopulation(){
		return population;
	}

	public void setOrbitalPeriod(String orbitalPeriod){
		this.orbitalPeriod = orbitalPeriod;
	}

	public String getOrbitalPeriod(){
		return orbitalPeriod;
	}

	public void setSurfaceWater(String surfaceWater){
		this.surfaceWater = surfaceWater;
	}

	public String getSurfaceWater(){
		return surfaceWater;
	}

	public void setDiameter(String diameter){
		this.diameter = diameter;
	}

	public String getDiameter(){
		return diameter;
	}

	public void setGravity(String gravity){
		this.gravity = gravity;
	}

	public String getGravity(){
		return gravity;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setResidents(List<Object> residents){
		this.residents = residents;
	}

	public List<Object> getResidents(){
		return residents;
	}

	public void setTerrain(String terrain){
		this.terrain = terrain;
	}

	public String getTerrain(){
		return terrain;
	}
}