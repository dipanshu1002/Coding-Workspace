package AprilLunch19;
import java.util.*;

public class ATTND {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			HashMap<String, List<String>> map = new HashMap<String, List<String>>();
			
			int N = s.nextInt();
			String[] fName = new String[N];
			String[] lName = new String[N];
			s.nextLine();
			for(int i=0;i<N;i++) {
				String[] str = s.nextLine().split(" ");
				fName[i] = str[0];
				lName[i]=str[1];
				if(map.get(str[0])==null) {
					List<String> list = new ArrayList<>();
					map.put(str[0],list);
					map.get(str[0]).add(str[1]);
				}
				else {
					map.get(str[0]).add(str[1]);
				}
				
			}
			Set<String> key = map.keySet();
			for(int i=0;i<N;i++) {
				if(map.get(fName[i]).size()>1) {
					System.out.println(fName[i]+" "+lName[i]);
				}
				else {
					System.out.println(fName[i]);
				}
			}
		}
	}
}
