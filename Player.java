package com;

public class Player 
{
	private String name;
	private int age;
	private int shirt_no;
	private String ipl_Team;
	private String Country;
	private String batting_Style;
	private String bowling_Style;
	private String Role;
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	Player(String name,int age,int shirt_no,String ipl_Team,String Country,String batting_Style,String bowling_Style,String Role)
	{
		this.name=name;
		this.age=age;
		this.shirt_no=shirt_no;
		this.ipl_Team=ipl_Team;
		this.Country=Country;
		this.batting_Style=batting_Style;
		this.bowling_Style=bowling_Style;
		this.Role=Role;
		
	}
	public int getShirt_no() {
		return shirt_no;
	}
	public void setShirt_no(int shirt_no) {
		this.shirt_no = shirt_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIpl_Team() {
		return ipl_Team;
	}
	public void setIpl_Team(String ipl_Team) {
		this.ipl_Team = ipl_Team;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getBatting_Style() {
		return batting_Style;
	}
	public void setBatting_Style(String batting_Style) {
		this.batting_Style = batting_Style;
	}
	public String getBowling_Style() {
		return bowling_Style;
	}
	public void setBowling_Style(String bowling_Style) {
		this.bowling_Style = bowling_Style;
	}
	int compareTo(Player p)
	{
		return -1;
	}
	

}
