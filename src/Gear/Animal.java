package Gear;

import Utils.Position;

public class Animal {
	
	private int health;
	private Position position;
	
	Animal(Position p){
		this.health=100;
		this.position=p;
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
}
