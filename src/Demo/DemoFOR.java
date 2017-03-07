package Core;

public class DemoFOR {
	public void run(int n) {
		int a, acc=0;
		for (a=1;a<=10;a++) {
			acc=acc+n;
			System.out.println("["+a+"] "+acc);
		}
	}
}
