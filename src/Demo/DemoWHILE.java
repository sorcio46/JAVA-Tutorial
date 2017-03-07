package Demo;

public class DemoWHILE {
	public void run(int n) {
		int a=1, acc=0;
		while(a<=10) {
			acc=acc+n;
			System.out.println("["+a+"] "+acc);
			a++;
		}
	}
}
