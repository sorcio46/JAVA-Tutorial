package Core;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//DemoIO d = new DemoIO();
		//DemoIF d = new DemoIF();
		//DemoWHILE d = new DemoWHILE();
		//DemoFOR d = new DemoFOR();
		DemoDOWHILE d = new DemoDOWHILE();
		Scanner in = new Scanner(System.in);
		int z=in.nextInt();
		in.close();
		d.run(z);
	}

}
