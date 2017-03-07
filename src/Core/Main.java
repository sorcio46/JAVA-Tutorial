package Core;

import java.io.IOException;
import Gear.Savana;

public class Main {

	public static void main(String[] args) throws IOException {

		Savana Khaelia = new Savana(4,4);
		System.out.println(Khaelia.toString());
		
		Simulation sim = new Simulation(Khaelia);
		sim.run(10);
	}

}
