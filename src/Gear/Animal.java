package Gear;

import Utils.Position;

public class Animal {
	
	private int health;
	private Position position;
	public int stamina;
	public boolean rest;
	
	public Animal(Position p){
		this.health=100;
		this.stamina=100;
		this.position=p;
		this.rest=false;
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
	
	public boolean getRest() {
		return this.rest;
	}
	
	public void setRest(boolean a) {
		this.rest=a;
	}
	
	public void move(String d) {
		if (this.stamina!=0) {
			if (d.equals("N"))
				this.position.setY(this.position.getY()+1);
			if (d=="NE") {
				this.position.setY(this.position.getY()+1);
				this.position.setX(this.position.getX()+1);
			}
			if (d=="E")
				this.position.setX(this.position.getX()+1);
			if (d=="SE") {
				this.position.setY(this.position.getY()-1);
				this.position.setX(this.position.getX()+1);
			}
			if (d=="S")
				this.position.setY(this.position.getY()-1);
			if (d=="SW") {
				this.position.setY(this.position.getY()-1);
				this.position.setX(this.position.getX()-1);
			}
			//todo
		}
		
	}
	
	public String toString() {
		String des;
		des="Animale in posizione "+this.position.getX()+" "+this.position.getY()+" ";
		return des;
	}
}
