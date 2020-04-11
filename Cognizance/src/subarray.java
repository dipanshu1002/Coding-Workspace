import java.util.*; 
  
class subarray{ 
      
    // function to find the length of longest 
    // increasing contiguous subarray 
    public static int lenOfLongIncSubArr(int arr[], 
                                            int n) 
    { 
        // 'max' to store the length of longest 
        // increasing subarray 
        // 'len' to store the lengths of longest 
        // increasing subarray at diiferent  
        // instants of time 
        int max = 0, len = 0; 
           
        if(arr[0]%2!=0) {
        	len=1;
        	max=1;
        	
        }else {
        	len=0;
        }
        // traverse the array from the 2nd element 
        for (int i=1; i<n; i++) 
        { 	
        	if((arr[i])%2!=0){
            // if current element if greater than 
            // previous element, then this element  
            // helps in building up the previous  
            // increasing subarray encountered 
            // so far 
            if (arr[i] > arr[i-1] && arr[i-1]%2!=0) 
                len++; 
            else
            { 
                // check if 'max' length is less  
                // than the length of the current  
                // increasing subarray. If true, 
                // than update 'max' 
                if (max < len)     
                    max = len; 
                       
                // reset 'len' to 1 as from this  
                // element again the length of the  
                // new increasing subarray is being  
                // calculated     
                len = 1;     
            }  
        	}
        } 
           
        // comparing the length of the last 
        // increasing subarray with 'max' 
        if (max < len) 
            max = len; 
           
        // required maximum length 
        return max; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 	
    		Scanner s = new Scanner(System.in);
         	int n = s.nextInt();
         	
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
            	arr[i]=s.nextInt();
            }
            System.out.println(lenOfLongIncSubArr(arr, n)); 
          
        } 
    } 
    
// This code is contributed by Arnav Kr. Mandal. 
