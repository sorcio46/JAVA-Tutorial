package Utils;

import Gear.Animal;

public class Tile {
	private Animal host;
	private Animal guest;
	private Position pos;
	private boolean lb = false;
	private boolean db = false;
	
	public Tile(Animal h, Position p) {
		this.host=h;
		this.pos=p;
	}
	
	public Tile(Position p) {
		this.pos=p;
		this.host=null;
		this.guest=null;
	}
	
	public Animal getHost() {
		return this.host;
	}
	
	public Animal getGuest() {
		return this.guest;
	}
	
	public Position getPosition() {
		return this.pos;
	}
	
	public void setHost(Animal a) {
		this.host=a;
	}
	
	public void setGuest(Animal a) {
		this.guest=a;
	}
	
	public void setLb(Boolean b) {
		this.lb=b;
	}
	
	public void setDb(Boolean b) {
		this.db=b;
	}
	
	public boolean hasHost() {
		if(this.host!=null)
			return true;
		return false;
	}
	
	public boolean hasGuest() {
		if(this.guest!=null)
			return true;
		return false;
	}
	
	public int[] getAllowedDirections() {
		int[] directions = new int[9];
		//todo
		return directions;
	}
	
	public String toString() {
		String des;
		des="Tile in posizione "+this.pos.toString();
		if(this.host!=null)
			des=des+" con";
		else
			des=des+" senza";
		des=des+" Host e";
		if(this.guest!=null)
			des=des+" con";
		else
			des=des+" senza";
		des=des+" Guest";
		return des;
	}
}
