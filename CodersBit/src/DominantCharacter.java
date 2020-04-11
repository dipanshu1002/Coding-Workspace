import java.util.*;
public class DominantCharacter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int n = str.length();
		int[][] pre = new int[26][n];
		for(int i=0;i<n;i++) {
			pre[str.charAt(i)-'a'][i]=1;
		}
		int[] []prefix = new int[26][n];
		for(int i=0;i<26;i++) {
			for(int j=0;j<n;j++) {
				if(j==0) {
					prefix[i][j]=pre[i][j];
				}else {
					if(pre[i][j]==0) {
					prefix[i][j]=prefix[i][j-1];
					}
					else {
						prefix[i][j]=1+prefix[i][j-1];
					}
				}
			}
		}
		int l = s.nextInt();
		l-=1;
		int r = s.nextInt();
		r-=1;
		int maxCount = 0;
		int totCount=0;
		for(int i=0;i<26;i++) {
			if(l==0) {
				int cnt = pre[i][r];
				if(cnt>maxCount) {
					maxCount=cnt;
					totCount=1;
				}else if(cnt==maxCount) {
					totCount+=1;
				}
			}else {
				int cnt = prefix[i][r]-prefix[i][l-1];
				if(cnt>maxCount) {
					maxCount=cnt;
					totCount=1;
				}else if(cnt==maxCount) {
					totCount+=1;
				}
			}
		}
		System.out.println(prefix.length);
		
		
	}
}
