package Core;

import java.util.ArrayList;
import Utils.Tile;
import Utils.Position;

public class Action {
	private Tile zone;
	private ArrayList dir;
	
	public Action(Tile a) {
		this.zone=a;
		allowedDirections();
	}
	
	public Tile getZone() {
		return this.zone;
	}
	
	/*
	 * NW  N  NE
     * W   x  E
     * SW  S  SE
     * 
     * 7   8   9
     * 4   5   6
     * 1   2   3
	 */
	
	private void allowedDirections() {
		/*Position p = this.zone.getPosition();
		dir.add(5);
		if(p.getY()!=0) {
			dir.add(8);
			if(p.getX()!=0)
				dir.add(7);
			if(p.getX<)
		}*/
	}
	
	public void move() {
		int [] directions=this.zone.getAllowedDirections();
		//todo
	}
	
}
