import java.util.Scanner;
import java.io.FileWriter; 
import java.io.IOException; 

public class PenaltyTest {

	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("/home/dipanshu/eclipse-workspace/Practice/src/output2.txt"); 
		Scanner s = new Scanner( System.in);
		int T=s.nextInt();
		for(int t=0;t<T;t++) {
		String ind = s.next();
		String pak = s.next();
		char[] arr1 = ind.toCharArray();
		char[] arr2 = pak.toCharArray();
		int shot = 0;
		int diff=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]=='1') {
				diff++;
			}
			if(diff>0) {
				if(diff>(arr1.length-i)) {
					shot = 2*(i)+1;
					break;
				}	
			}
			if(diff<0) {
				if(Math.abs(diff)>(arr1.length-i-1)) {
					shot=2*(i)+1;
					break;
				}
			}
			
			if(arr2[i]=='1') {
				diff--;
			}
			
			if(Math.abs(diff)>(arr1.length-i-1)) {
				shot=2*(i+1);
				break;
			} 
		}
		if(diff>0) {
			fw.write("India"+"\n");
			System.out.println("India");
		}
		else if(diff<0) {
			fw.write("Pakistan"+"\n");
			System.out.println("Pakistan");
		}
		else {
			fw.write("Draw"+"\n");
			System.out.println("Draw");
		}
		
		System.out.println(shot);
		fw.write(shot+"\n");
		}
		fw.close();
	}

}
