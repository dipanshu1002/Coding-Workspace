
public class power {
	public static long power(int a, int  b) {
	if(b==0) {
		return 1;
	}
	return a*power(a,b-1);
}
	public static void main(String[] args) {
		int a=8;
		System.out.println(power(3,200));
	}
}
