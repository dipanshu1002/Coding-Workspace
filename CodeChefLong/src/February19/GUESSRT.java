package February19;

import java.util.Scanner;

 class Fraction{
	long num;
	long den;
	public Fraction(long num , long den){
		this.num = num;
		this.den = den;
	}
	public void reduce() {
		long gcd = GUESSRT.gcd(this.num, this.den);
		//System.out.println(gcd);
		this.num = num/gcd;
		this.den = den/gcd;
		
	}
	public void add( Fraction b) {
		//Fraction res = new Fraction(1,1);
		this.num = this.num*b.den + b.num*this.den;
		this.den = this.den*b.den;
	}
	public void sub( Fraction b) {
		//Fraction res = new Fraction(1,1);
		this.num = b.num*this.den-this.num*b.den ;
		this.den = this.den*b.den;
	}
	public void multiply( Fraction b) {
		//Fraction res = new Fraction(1,1);
		this.num = this.num*b.num;
		this.den = this.den*b.den;
	}
}
 
 class ModuloInverse {
	 
	  class Triplet{
			long x;
			long y;
			long gcd;
		}

	  
		public  Triplet extEuclid(long a, long b){
	      	
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
	  	public  long modInverse(long a, long b){
	      long mod = extEuclid(a,b).x;
	      //System.out.println(mod);
	      return mod;
	    }
	  	public  long gcd(long a, long b) {
	  		if(b==0) {
	  			return a;
	  		}
	  		return gcd(b,a%b);
	  	}
  }
 
 
public class GUESSRT {
	
	
	public static long gcd(long a , long b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
	
	public static ModuloInverse abc = new ModuloInverse();
	public static long mod = 1000000007;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			long N = s.nextInt();
			long K = s.nextInt();
			long M = s.nextInt();
			Fraction finalProb = new Fraction(0,1);
			Fraction currProb = new Fraction(0,1);
			long ans;
			
			

			Fraction sample = new Fraction(1,1);
			long mov = 1;
			if(N<=K) {
				currProb.num = 1;
				currProb.den = N;
				finalProb.add(currProb);
				finalProb.reduce();
				 //ans = abc.modInverse(finalProb.den,mod);
				//System.out.println(finalProb.num+" "+finalProb.den);
				mov++;
				N+=K;
			}
			else if(N>K) {
				if(M>1) {
					if(N%K!=0) {
						N = N%K;
						mov++;
					}
					else {
						N = K;
						mov++;
					}
				}
				else if(M==1) {
					finalProb.num = 1;
					finalProb.den = N;
					//System.out.println(finalProb.num+" "+finalProb.den);

				}
			}
			while(mov<=M) {
				if(N<=K ) {
					Fraction failureProb = new Fraction(finalProb.num,finalProb.den);
					failureProb.sub(sample);
					currProb.num = 1;
					currProb.den = N;
					currProb.multiply(failureProb);
					currProb.reduce();
					finalProb.add(currProb);
					//ans = abc.modInverse(finalProb.den,mod);

					finalProb.reduce();
					//ans = abc.modInverse(finalProb.den,mod);
					mov++;
					N+=K;
					continue;
				}
				else if(N>K && mov!=M) {
					N = N%K;
					mov++;
				}
				else if(N>K && mov==M) {
					Fraction failureProb = new Fraction(finalProb.num,finalProb.den);
					failureProb.sub(sample);
					currProb.reduce();
					currProb.num = 1;
					currProb.den = N;
				//	System.out.println("Curr-> "+currProb.num+" "+currProb.den);
				//	System.out.println("Prev-> "+prevProb.num+" "+prevProb.den);
					currProb.multiply(failureProb);
					currProb.reduce();
					finalProb.add(currProb);
					//ans = abc.modInverse(finalProb.den,mod);
					finalProb.reduce();
					///ans = abc.modInverse(finalProb.den,mod);
					mov++;
				}
			}
			finalProb.reduce();
			
			//System.out.println(finalProb.num+" "+finalProb.den);
			ans = abc.modInverse(finalProb.den,mod);
			
			//System.out.println(ans);
			System.out.println(((finalProb.num%mod)*(ans%mod))%mod);
			
		}
	}
	
}



