package Core;

import Gear.Animal;
import Gear.Savana;
import Utils.Tile;

public class Simulation {
	private Savana savana;
	
	public Simulation(Savana s) {
		this.savana=s;
	}
	
	public Savana getSavana() {
		return this.savana;
	}
	
	public boolean run(int iterations) {
		Animal[] animals=this.savana.getAnimals();
		int i, j;
		for(i=0;i<iterations;i++) {
			System.out.println("Esecuzione Iterazione numero "+i);
			for(j=0;j<animals.length;j++) {
				Tile t=this.savana.getTile(animals[j]);
				Action a = new Action(t);
				//todo
			}
		}
		return true;
	}
}
