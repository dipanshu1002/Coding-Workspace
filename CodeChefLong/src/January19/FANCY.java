package January19;
import java.util.*;
import java.util.regex.*;
public class FANCY {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		s.nextLine();
		for(int t=0;t<T;t++) {
		String str=s.nextLine();
	//	if(str.contains(" not ")||str.contentEquals("not")||str.contains("not ")||str.substring(0,4)=="not "|| str.substring(str.length()-4, str.length()).contentEquals(" not"))
		//	System.out.println("Real Fancy");
		if(str.matches(".*\\bnot\\b.*")) {
			System.out.println("Fancy");
		}
		else
			System.out.println("regularly fancy");
		
	}
	}

}
