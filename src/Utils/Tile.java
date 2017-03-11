package Utils;

import Gear.Animal;

public class Tile {
	private Animal host;
	private Animal guest;
	private Position pos;
	private boolean rb = false;
	private boolean db = false;
	private int[] directions;
	
	public Tile(Animal h, Position p) {
		this.host=h;
		this.guest=null;
		this.pos=p;
		directions();
	}
	
	public Tile(Position p) {
		this.pos=p;
		this.host=null;
		this.guest=null;
		directions();
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
	
	private void directions() {
		this.directions = new int[9];
		int i;
		for(i=0;i<this.directions.length;i++) {
			this.directions[i]=0;
		}
		this.directions[4]=1; //No Movement
		if(this.pos.getX()!=0) { //Not in the first column
			this.directions[3]=1; //West
			if(this.pos.getY()!=0)
				this.directions[6]=1; //North-West
			if(this.db==false)
				this.directions[0]=1; //South-West
		}
		if(this.pos.getY()!=0) { //Not in the first row
			this.directions[7]=1; //North
			if(this.rb==false)
				this.directions[8]=1; //North-East
		}
		if(this.rb==false) { //Not on the right border
			this.directions[5]=1; //East
			if(this.db==false)
				this.directions[2]=1; //South-East
		}
		if(this.db==false) //Not on the down border
			this.directions[1]=1; //South
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
		directions();
	}
	
	public void setDb(Boolean b) {
		this.db=b;
		directions();
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
		return this.directions;
	}
	
	public String toString() {
		String des;
		des="Tile in posizione "+this.pos.toString();
		if(this.host!=null)
			des=des+" con Host id "+this.host.getId();
		else
			des=des+" senza Host";
		if(this.guest!=null)
			des=des+" con Guest id "+this.guest.getId();
		else
			des=des+" senza Guest";
		if(this.rb==true)
			des=des+" al bordo destro";
		if(this.db==true)
			des=des+" con bordo sottostante";
		return des;
	}
}
