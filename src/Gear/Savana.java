package Gear;

import java.util.Random;
import Utils.Position;
import Utils.Tile;

public class Savana {
	private Tile matrix[][];
	
	public Savana(int x, int y) {
		matrix= new Tile[x][y];
		int i,j;
		Position p = new Position(0,0);
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				Random rand = new Random();
				int  n = rand.nextInt(2);
				if(n==1) {
					p.setX(j);
					p.setY(i);
					Animal a = new Animal(p);
					//i - per le righe e j per le colonne
					Tile t = new Tile(a);
					this.matrix[i][j]=t;
				}
				else {
					Tile t = new Tile();
					this.matrix[i][j]=t;
				}
			}
		}
		System.out.println("Building complete! \n");
	}
	
	public Tile getTile(int x, int y) {
		return this.matrix[x][y];
	}
	
	public String toString() {
		String des="Mappa di gioco \n";
		int i, j;
		int rows = matrix.length;
		int cols = matrix[0].length;
		for(i=0;i<rows;i++) {
			des=des.concat("Riga "+i+" - ");
			for(j=0;j<cols;j++) {
				if (this.matrix[i][j].hasHost()==true)
					des=des.concat("Pos: "+j+","+i+"An! \t");
				des=des.concat("Pos: "+i+","+j+"\t");
			}
			des=des.concat("\n");
		}
		return des;
	}
}
