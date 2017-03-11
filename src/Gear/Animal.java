package Gear;

import Utils.Position;

public class Animal {
	
	private int health;
	private Position position;
	private int stamina;
	private int id;
	//public boolean rest;
	
	public Animal(Position p, int id){
		this.id=id;
		this.health=100;
		this.stamina=100;
		this.position=p;
		//this.rest=false;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public void setPosition(Position p) {
		this.position=p;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getStamina() {
		return this.stamina;
	}
	
	public int getId() {
		return this.id;
	}
	
	/*
	public boolean getRest() {
		return this.rest;
	}
	
	public void setRest(boolean a) {
		this.rest=a;
	}
	
	public void rest() {
		if(this.stamina==100)
			this.rest=false;
		else 
			this.stamina=this.stamina+25;
	}
	*/
	
	public String toString() {
		String des;
		des="Animale con id "+this.id+" in posizione "+this.position.toString();
		return des;
	}
}
