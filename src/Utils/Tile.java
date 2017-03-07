package Utils;

import Gear.Animal;

public class Tile {
	private Animal host;
	private Animal guest;
	
	public Tile(Animal h) {
		this.host=h;
	}
	
	public Tile() {
		this.host=null;
		this.guest=null;
	}
	
	public Animal getHost() {
		return this.host;
	}
	
	public Animal getGuest() {
		return this.guest;
	}
	
	public void setHost(Animal a) {
		this.host=a;
	}
	
	public void setGuest(Animal a) {
		this.guest=a;
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
	
	public String toString() {
		String des;
		des="Tile";
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
