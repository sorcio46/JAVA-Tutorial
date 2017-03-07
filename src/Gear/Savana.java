package Gear;

import java.util.Random;
import Utils.Tile;

public class Savana {
	private Tile map[][] = new Tile [10][10];
	
	Savana() {
		int i,j;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				Random rand = new Random();
				int  n = rand.nextInt(2);
			}
		}
	}
	
	
}
