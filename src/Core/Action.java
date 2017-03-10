package Core;

import java.util.Random;

import Utils.Position;
import Utils.Tile;

public class Action {
	private Tile zone;
	
	public Action(Tile a) {
		this.zone=a;
	}
	
	public Tile getZone() {
		return this.zone;
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
	
	//this method needs to be fixed
	public Position move() {
		Position p;
		int[] directions=this.zone.getAllowedDirections();
		int i, c=0;
		for(i=0;i<directions.length;i++) {
			if(directions[i]==1)
				c++;
		}
		int[] go=new int[c];
		c=0;
		for(i=0;i<directions.length;i++) {
			if(directions[i]==1) {
				go[c]=i;
				c++;
			}
		}
		
		Random rand = new Random();
		int  n = rand.nextInt(c);
		
		/*
		 * NW  N  NE
	     * W   x  E
	     * SW  S  SE
	     * 
	     * 6   7   8
	     * 3   4   5
	     * 0   1   2
	     * 
	     * -1,-1  +0,-1  -1,+1
	     * -1,+0  +x,+y  +1,+0
	     * -1,+1  +0,+1  +1,+1	
		 */
		
		switch(go[n]) {
		case 0: p=new Position(-1,1);
		break;
			
		case 1: p=new Position(0,1);
		break;
			
		case 2: p=new Position(1,1);
		break;
			
		case 3: p=new Position(-1,0);
		break;
		
		case 4: p=new Position(0,0);
		break;
		
		case 5: p=new Position(1,0);
		break;
		
		case 6: p=new Position(-1,-1);
		break;
		
		case 7: p=new Position(0,-1);
		break;
		
		case 8: p=new Position(-1,1);
		break;
		
		default: p=new Position(0,0);
		break;
		}
			
		return p;
	}
	
}
