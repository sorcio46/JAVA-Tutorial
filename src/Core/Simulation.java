package Core;

import Gear.Animal;
import Gear.Savana;
import Utils.Position;
import Utils.Tile;

public class Simulation {
	private Savana savana;
	
	public Simulation(Savana s) {
		this.savana=s;
	}
	
	public Savana getSavana() {
		return this.savana;
	}
	
	//to do fix this
	public boolean run(int iterations) {
		Animal[] animals=this.savana.getAnimals();
		int i, j;
		for(i=0;i<iterations;i++) {
			System.out.println("--- Esecuzione Iterazione numero "+i);
			for(j=0;j<animals.length;j++) {
				Tile t=this.savana.getTile(animals[j]);
				Animal al=t.getHost();
				Action a = new Action(t);
				Position p=a.move();
				System.out.println("\n"+t.toString());
				if(p.getX()==0 & p.getY()==0)
					System.out.println("\nL'animale non si è mosso");
				else {
					System.out.println("\nMovimento "+p.toString());
					//null pointer exception, can't find animal
					System.out.println("Posizione di partenza animale "+al.getPosition().toString());
					al.getPosition().sum(p);
					t.setHost(null);
					Tile s=this.savana.getTile(al.getPosition());
				
					/*
					 * At this stage there is no fight
					 */
				
					if(s.hasHost()==true)
						System.out.println("Animale host ucciso, sostituzione su "+al.getPosition().toString());
					else
						System.out.println("Tile libero, host impostato "+al.getPosition().toString());
					s.setHost(al);
				}
			}
		}
		System.out.println("\nFine della simulazione");
		return true;
	}
}
