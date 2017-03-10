package Utils;

import Gear.Animal;

public class Tile {
	private Animal host;
	private Animal guest;
	private Position pos;
	private boolean rb = false;
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
	
	public void setRb(Boolean b) {
		this.rb=b;
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
	
	/*
	 * NW  N  NE
     * W   x  E
     * SW  S  SE
     * 
     * 6   7   8
     * 3   4   5
     * 0   1   2
	 */
	
	public int[] getAllowedDirections() {
		int[] directions = new int[9];
		int i;
		for(i=0;i<directions.length;i++) {
			directions[i]=0;
		}
		directions[4]=1;
		if(this.pos.getX()!=0) {
			directions[3]=1;
			if(this.pos.getY()!=0)
				directions[6]=1;
			if(this.db==false)
				directions[0]=1;
		}
		if(this.pos.getY()!=0) {
			directions[7]=1;
			if(this.rb==false)
				directions[8]=1;
		}
		if(this.rb==false) {
			directions[5]=1;
			if(this.db==false)
				directions[2]=1;
		}
		if(this.db==false)
			directions[1]=0;
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
		if(this.rb==true)
			des=des+" bordo destro";
		if(this.db==true)
			des=des+" bordo sottostante";
		return des;
	}
}
