package Core;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//DemoIO d = new DemoIO();
		//DemoIF d = new DemoIF();
		//DemoWHILE d = new DemoWHILE();
		//DemoFOR d = new DemoFOR();
		//DemoDOWHILE d = new DemoDOWHILE();
		/*
		DemoPRIME d = new DemoPRIME();
		Scanner in = new Scanner(System.in);
		int z=in.nextInt();
		in.close();
		if(d.isPrime(z))
			System.out.println("E' primo");
		else
			System.out.println("Non e' primo");
		*/
		Random rand = new Random();
		int  n = rand.nextInt(2);
		System.out.println(n);
		
	}

}
