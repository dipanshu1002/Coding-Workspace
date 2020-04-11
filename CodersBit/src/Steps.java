import java.util.*;
public class Steps {
	public static int returnSteps(int id, int N, int total) {
		if(id==N) {
			return 1;
		}
		if(id>N) {
			return -1;
		}
		int op1 = returnSteps(2*id,N,total);
		if(op1!=-1) {
			op1+=1;
		}
		int op2 = returnSteps(3*id,N,total);
		if(op2!=-1) {
			op2+=1;
		}
		int op3 = returnSteps(2*id,N,total);
		if(op3!=-1) {
			op3+=1;
		}
		int op4 = returnSteps(3*id,N,total);
		if(op4!=-1) {
			op4+=1;
		}
		if(op1==-1 && op2==-1 && op3==-1 && op4==-1) {
			return -1;
		}else {
			if(op1==-1) {
				op1=Integer.MAX_VALUE;
			}
			if(op2==-1) {
				op2=Integer.MAX_VALUE;
			}
			if(op3==-1) {
				op3=Integer.MAX_VALUE;
			}
			if(op4==-1) {
				op4=Integer.MAX_VALUE;
			}
			int ans = Math.min(op1,op2);
			int ans2 = Math.min(op3,op4);
			ans = Math.min(ans,ans2);
			return ans;
		}
	}
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int N = s.nextInt();
		int ans = returnSteps(1,N,0);
		System.out.println(ans);
	}
}
