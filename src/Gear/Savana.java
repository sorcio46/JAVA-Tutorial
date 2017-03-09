package Gear;

import java.util.Random;
import Utils.Position;
import Utils.Tile;

public class Savana {
	private Tile matrix[][];
	private int xi;
	private int yi;
	private int Entities=0;
	private Animal[] animals;
	
	public Savana(int x, int y) {
		this.xi=x;
		this.yi=y;
		matrix= new Tile[x][y];
		int i,j,c=0;
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				Random rand = new Random();
				int  n = rand.nextInt(2);
				Position p = new Position(j,i);
				if(n==1) {
					Animal a = new Animal(p);
					//i - per le righe e j per le colonne
					Tile t = new Tile(a,p);
					this.Entities++;
					this.matrix[i][j]=t;
				}
				else {
					Tile t = new Tile(p);
					this.matrix[i][j]=t;
				}
			}
		}
		this.animals=new Animal[this.Entities];
		for(i=0;i<x;i++) {
			for(j=0;j<y;j++) {
				if(this.matrix[i][j].hasHost()==true) {
					Animal a=this.matrix[i][j].getHost();
					this.animals[c]=a;
					c++;
				}	
			}
		}
		System.out.println("Building complete! \n");
	}
	
	public Tile getTile(Position p) {
		return this.matrix[p.getX()][p.getY()];
	}
	
	public int getEntities() {
		return this.Entities;
	}
	
	public int getXi() {
		return this.xi;
	}
	
	public int getYi() {
		return this.yi;
	}
	
	public Animal[] getAnimals() {
		return this.animals;
	}
	
	public Tile getTile(Animal a) {
		Position p = a.getPosition();
		Tile t = this.matrix[p.getX()][p.getY()];
		return t;
	}
	
	public String toString() {
		String des="Mappa di gioco \n";
		int i, j;
		for(i=0;i<xi;i++) {
			des=des.concat("Riga "+i+" - ");
			for(j=0;j<yi;j++) {
				if (this.matrix[i][j].hasHost()==true)
					des=des.concat("Pos: "+j+","+i+"An! \t");
				des=des.concat("Pos: "+j+","+i+"\t");
			}
			des=des.concat("\n");
		}
		des=des.concat("\nElenco degli animali \n");
		for(i=0;i<this.Entities;i++) {
			des=des.concat("Animale in posizione "+this.animals[i].getPosition().toString()+"\n");
		}
		des=des.concat("\nElenco dei Tiles \n");
		for(i=0;i<xi;i++) {
			for(j=0;j<yi;j++) {
				des=des+matrix[i][j].toString()+"\n";
			}
			des=des.concat("\n");
		}
		return des;
	}
}
