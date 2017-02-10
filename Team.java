package com;

import java.util.ArrayList;
import java.util.List;



public class Team 
{
	private String region;
	private String name;
	private String Fanchise;
	private String owner;
	List<Player> Players=new ArrayList<Player>();
	public Team(String region,String name,String Fanchise,String owner)
	{
		this.region=region;
		this.name=name;
		this.Fanchise=Fanchise;
		this.owner=owner;
	}
	public List<Player> getPlayers() {
		return Players;
	}
	public void setPlayers(List<Player> players) {
		Players = players;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFanchise() {
		return Fanchise;
	}
	public void setFanchise(String fanchise) {
		Fanchise = fanchise;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	

}
