package Utils;

import Gear.Animal;

public class Tile {
	private Animal host;
	private Animal guest;
	
	Tile(Animal a){
		this.host=a;
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
}
