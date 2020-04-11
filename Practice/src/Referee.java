import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException; 


public class Referee {
 public static class Triplet{
  long x;
  long y;
  long gcd;

}

  
	public static Triplet extEuclid(long a, long b){
      	if(b>a){
          long temp= a;
          a=b;
          b=temp;
        }
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
      return (mod%b + b)%b;
    }
	
	public static void main(String[] args) throws IOException {
		//FileWriter fw=new FileWriter("/home/dipanshu/eclipse-workspace/Practice/src/referee3.txt"); 

		Scanner s = new Scanner(System.in);
      	int T=s.nextInt();
        int count=0;

      for(int t=0;t<T;t++){
      	long a= s.nextLong();
      	long b=s.nextLong();
      	long d=s.nextLong();
        
        if(d==0){
          //fw.write(1+"\n");	
          System.out.println(1);
          count++;
          continue;
        }
        Triplet ans=extEuclid(b,a);
       // System.out.println(ans.gcd);
         if(d%ans.gcd!=0){
          //fw.write(0+"\n");	 
          System.out.println(0);
          count++;
          continue;
        }
        a/=ans.gcd;
        b/=ans.gcd;
        d/=ans.gcd;
       
      	long y1 =(d%a * modInverse(b,a))%a;
        if(d>=y1*b){
      	long n = ((d/b) - (y1))/a;
         // System.out.println(y1+" "+n);
      	//  fw.write((n+1)+"\n");
          System.out.println(n+1);
          count++;
        }
        else {
        //	fw.write(0+"\n");
          System.out.println(0);
          count++;
        }
       
      	
      }
   //   fw.close();
      } 

	}

