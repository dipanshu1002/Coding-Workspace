package Test1;
import java.util.*;
public class FredoTask {
	static double EPS=1E-15;  

	static double findMinValue(double arr[], double n)  
	{  
	    // add logarithmic value of all elements to sum  
	    double sum = 0;  
	    for (int i=0; i<n; i++)  
	        sum += (double)Math.log10(arr[i])+EPS;  
	  
	    // to find the nth root of sum  
	    double xl = (double)(sum/n+EPS);  
	  
	    // to find the antilog of xl  
	    double res = Math.pow((double)10.0, (double)xl) + EPS;  
	    return (double)Math.ceil(res+EPS);  
	}  
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
        double[]arr = new double[N];
//        double pro = 0;
        for(int i=0;i<N;i++){
            arr[i]=s.nextDouble();
        }
        System.out.println((long)findMinValue(arr,N));
       
        
        
        
	}

}

