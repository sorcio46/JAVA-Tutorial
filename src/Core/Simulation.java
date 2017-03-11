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
	
	public boolean run(int iterations) {
		Animal[] animals=this.savana.getAnimals();
		int i, j;
		for(i=0;i<iterations;i++) {
			System.out.println("\n+++***--- Esecuzione Iterazione numero "+i+" ---***+++");
			
			for(j=0;j<animals.length;j++) {
				System.out.println("# \n"+this.savana.miniToString());
				
				if(animals[j].getHealth()!=0) {
					System.out.println("Cerco l'animale con id :"+animals[j].getId());
					Tile t=this.savana.getTile(animals[j]);
					System.out.println(animals[j].toString());
					System.out.println(t.toString());
					Action a = new Action(t);
					Position p=a.move();
					
					if(p.getX()==0 & p.getY()==0)
						System.out.println("L'animale non si è mosso");
					
					else {
						System.out.println("Movimento "+p.toString());
						System.out.println("Posizione di partenza animale "+animals[j].getPosition().toString());
						animals[j].getPosition().sum(p);
						System.out.println("Nuova posizione animale: "+animals[j].getPosition().toString());
						t.setHost(null);
						Tile s=this.savana.getTile(animals[j].getPosition());
				
						/*
						 * At this stage there is no complex behaviour
						 */
				
						if(s.hasHost()==true) {
							animals[s.getHost().getId()].setHealth(0);
							System.out.println("Animale host con id "+s.getHost().getId()+" ucciso, sostituzione su "+animals[j].getPosition().toString());
						}
						else
							System.out.println("Tile libero, host impostato "+animals[j].getPosition().toString());
						s.setHost(animals[j]);
						t.setHost(null);
						}
				}
				else
					System.out.println("Animale con id "+animals[j].getId()+" e' morto, passo al prossimo");
			}
		}
		System.out.println("\nFine della simulazione");
		return true;
	}
}
