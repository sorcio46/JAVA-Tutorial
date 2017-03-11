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
		matrix= new Tile[y][x];
		int i,j,c=0;
		for(i=0;i<y;i++) {
			for(j=0;j<x;j++) {
				Random rand = new Random();
				int  n = rand.nextInt(2);
				Position p = new Position(i,j);
				if(n==1) {
					Animal a = new Animal(p, this.Entities);
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
		//Building borders
		j=y-1;
		for(i=0;i<x;i++) {
			this.matrix[i][j].setRb(true);
		}
		i=x-1;
		for(j=0;j<y;j++) {
			this.matrix[i][j].setDb(true);
		}
		//Organizing entities
		this.animals=new Animal[this.Entities];
		for(i=0;i<y;i++) {
			for(j=0;j<x;j++) {
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
		Tile t = null;
		int i, j;
		for(i=0;i<this.xi;i++) {
			for(j=0;j<this.yi;j++) {
					if(this.matrix[i][j].hasHost()){
						if(this.matrix[i][j].getHost().getId()==a.getId())
							t=this.matrix[i][j];
				}
			}
		}
		return t;
	}
	
	public String toString() {
		String des="Mappa di gioco \n";
		int i, j;
		for(i=0;i<yi;i++) {
			des=des.concat("Riga "+i+" - ");
			for(j=0;j<xi;j++) {
				if (this.matrix[i][j].hasHost()==true)
					des=des.concat("Pos: "+i+","+j+"An #"+this.matrix[i][j].getHost().getId()+"\t");
				else
					des=des.concat("Pos: "+i+","+j+"\t");
			}
			des=des.concat("\n");
		}
		des=des.concat("\nElenco degli animali \n");
		for(i=0;i<this.Entities;i++) {
			des=des.concat(this.animals[i].toString()+"\n");
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
	
	public String miniToString() {
		String des=new String();
		int i, j;
		for(i=0;i<yi;i++) {
			des=des.concat("Riga "+i+" - ");
			for(j=0;j<xi;j++) {
				if (this.matrix[i][j].hasHost()==true)
					des=des.concat("Pos: "+i+","+j+"An #"+this.matrix[i][j].getHost().getId()+"\t");
				else
					des=des.concat("Pos: "+i+","+j+"\t");
			}
			des=des.concat("\n");
		}
		return des;
	}
}
