package NumberTheory1;
import java.util.Scanner;


public class ModuloInverse {
 
	public static class Triplet{
		long x;
		long y;
		long gcd;
	}

  
	public static Triplet extEuclid(long a, long b){
      	
      	if(b==0){
          Triplet myAns=new Triplet();
          myAns.gcd=a;
          myAns.x=1;
          myAns.y=0;
          return myAns;
        }
      	Triplet smallAns= new Triplet();
      	smallAns= extEuclid(b,a%b);
      	Triplet myAns=new Triplet();
      	myAns.gcd= smallAns.gcd;
      	myAns.x=smallAns.y;
      	myAns.y= smallAns.x - (a/b)*smallAns.y;
      	return myAns;
    
      
    }
  	public static long modInverse(long a, long b){
      long mod = extEuclid(a,b).x;
      System.out.println(mod);
      return mod;
    }
  	public static long gcd(long a, long b) {
  		if(b==0) {
  			return a;
  		}
  		return gcd(b,a%b);
  	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
      		int T=s.nextInt();
      		for(int t=0;t<T;t++){
      		long a= s.nextLong();
      		long m=s.nextLong();
      		long ans = modInverse(a,m);
      		System.out.println(ans);
      		System.out.println("GCD: "+ gcd(a,m));
      	//	Triplet ex = extEuclid(12,5);
      	//	System.out.println(ex.x+" "+ex.y+" "+ex.gcd);
      	//	System.out.println(gcd(a,m));
        
       }
      } 

	}


