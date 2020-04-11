import java.util.*;
public class ques2 {
	static long mod1 = (long)Math.pow(10,6);
	static long mod = (long)Math.pow(10,9)+7;
	public static int sieve(int n) {
		//Array Size - 10^7+1
		int[] arr = new int[n+1];
		
		// 0 - true , 1 - false
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i*i<=n;i++) {
			if(arr[i]==0) {
				for(int j=i*i;j<arr.length;j+=i) 
					arr[j]=1;
				
			}
		}
		int sum=0;
		// count primes till n
		for(int i=0;i<=n;i++) {
			if(arr[i]==0) sum+=arr[i];
			
		}
		System.out.println(sum);
		return sum;
		
		
		
	}
	public static int binomialCoeff(int n, int k) 
	    { 
	        long C[] = new long[k + 1]; 
	         
	        // nC0 is 1 
	        C[0] = 1;   
	       
	        for (int i = 1; i <= n; i++) 
	        { 
	            // Compute next row of pascal  
	            // triangle using the previous row 
	            for (int j = Math.min(i, k); j > 0; j--) 
	                C[j] = (C[j]%mod + C[j-1]%mod)%mod; 
	        } 
	        return (int)C[k]; 
	    } 
	
	public static int getSubsets(int k, int n, List<Integer> arr) {
		int[] arr2 = new int[arr.size()];
		int x=0;
		for(Integer i: arr) {
			arr2[x]=i;
			x++;
		}
		int[] seive = new int[10000001];
		// 0 - true , 1 - false
		seive[0]=1;
		seive[1]=1;
		for(int i=2;i*i<=seive.length;i++) {
			if(seive[i]==0) {
				for(int j=i*i;j<seive.length;j+=i) 
					seive[j]=1;
				
			}
		}
		int[] dp = new int[10000001];
		for(int i=0;i<seive.length;i++) {
			if(seive[i]==0) {
				for(int j=i;j<seive.length;j+=i) {
					dp[j]+=i;
				}
			}
		}
		long sum = 0;
		for(int ele: arr2) {
			sum= (sum%mod1+ dp[ele]%mod1)%mod1;
		}
		return binomialCoeff((int)sum+k-1,k-1);
		
		
	}
	
	/// (n+k-1)C(k-1)
	// factorial(n+k-1)/factorial(n)*factorial(k-1)	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int n = s.nextInt();
		int n2 = s.nextInt();
		List<Integer> arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			int a = s.nextInt();
			arr.add(a);
		}
		int ans = getSubsets(k,n,arr);
		System.out.println(ans);
	} 
}
