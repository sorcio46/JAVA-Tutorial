package Demo;

import java.util.Scanner;

public class DemoIO {
	public void run() {
		System.out.println("Digitare un numero intero:");
		//Dichiaro l'oggetto scanner e apro l'input
		Scanner numero = new Scanner (System.in);
		//Assegno il valore intero dallo scanner alla variabile intera a
		int a = numero.nextInt();
		//Stampo il valore a
		System.out.println("Il valore che hai messo era "+a+"\n");
		
		System.out.println("Digitare una parola:");
		Scanner input = new Scanner (System.in);
		String s = input.nextLine();
		numero.close();
		input.close();
		System.out.println("La parola che hai messo era: "+s);
	}
}
