package Core;

import java.io.IOException;
import Gear.Savana;
import Utils.Position;
import Utils.Tile;

public class Main {

	public static void main(String[] args) throws IOException {

		Savana Khaelia = new Savana(4,4);
		System.out.println(Khaelia.toString());
		
		Simulation sim = new Simulation(Khaelia);
		sim.run(3);
		
		/*
		Position p = new Position(0,0);
		Tile t = new Tile(p);
		//t.setDb(true);
		//t.setRb(true);
		System.out.println(t.toString());
		Action a = new Action(t);
		
		int[] dir = t.getAllowedDirections();
		String[] d = {"SW","S","SE","W","x","E","NW","N","NE"};
		
		int i;
		for(i=0;i<dir.length;i++) {
			System.out.println(dir[i]+" "+d[i]);
		}
		
		p = a.move();
		System.out.println("\n"+p.toString());
		t.getPosition().sum(p);
		System.out.println("\n"+t.toString());
		*/
	}

}
