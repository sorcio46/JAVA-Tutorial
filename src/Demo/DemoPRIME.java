package Demo;

public class DemoPRIME {
	public boolean isPrime(int n) {
		if(n>100) {
			System.out.println("Il numero e' troppo grande");
			return false;
		}
		int a=3;
		if(n==2)
			return true;
		if(n%2==0)
			return false;
		while(a<n){
			if(n%a==0)
				return false;
			a=a+2;
		}
		return true;
	}
}
