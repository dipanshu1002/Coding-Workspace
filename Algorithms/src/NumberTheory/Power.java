package NumberTheory;

public class Power {
	static long mod = (long)Math.pow(10,9)+7;
	public static long power(long a, long n) {
		if(n==0) {
			return 1;
		}
		if(n%2==0) {
			return power((a*a)%mod,n/2);
		}
		else {
			return (a%mod*power((a*a)%mod,n/2)%mod)%mod;
		}
	}
	public static void main(String[] args) {
		long ans = power(10,19);
		System.out.println(ans);
	}
}
