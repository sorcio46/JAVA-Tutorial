package Demo;

import java.util.Scanner;

public class DemoIF {
	public void run() {
		System.out.println("Digitare un numero intero:");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.close();
		if (a%2==0)
			System.out.println("Il numero è pari");
		else
			System.out.println("Il numero è dispari");
	}
}
