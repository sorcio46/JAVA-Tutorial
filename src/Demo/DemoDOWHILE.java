package Demo;

public class DemoDOWHILE {
	public void run(int n) {
		int a=1, acc=0;
		do {
			acc=acc+n;
			System.out.println("["+a+"] "+acc);
			a++;
		}
		while(a<=10);
	}
}
