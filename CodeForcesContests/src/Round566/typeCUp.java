package Round566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;


public class typeCUp {
	static class FastReader 
	
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	static class Word{
		String str;
		int vowCount;
		char lastVow;
	}
	static class StringPair{
		String s1;
		String s2;
	}
	static class Pair{
		int vow;
		char lastVow;
	}
	
	static class SPair{
		String s1;
		String s2;
		int x;
		public SPair(String s1,String s2,int x) {
			this.s1 = s1;
			this.s2 = s2;
			this.x  = x;
		}
	}
	
	
	public static Pair vowelCount(String str) {
		Pair p = new Pair();
		int ans=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				ans++;
				p.lastVow=str.charAt(i);
			}
				
		}
		p.vow = ans;
		return p;
	}
	public static int get(char c) {
		switch(c) {
		case 'a':return 0;
		case 'e': return 1;
		case 'i':return 2;
		case 'o': return 3;
		case 'u': return 4;
		}
			return -1;
			
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long n = s.nextLong();
		HashMap<Integer,String>[] map = new HashMap[5];
		ArrayList<Word> list = new ArrayList<Word>();
		for(int i=0;i<5;i++) map[i]= new HashMap<Integer,String>();
		
		
		for(long t=0;t<n;t++) {
			Word word = new Word();
			word.str = s.nextLine();
			word.vowCount=vowelCount(word.str).vow;
			word.lastVow = vowelCount(word.str).lastVow;
			list.add(word);
		}
		Iterator<Word> iter = list.iterator();
		//5 maps - for each vowel (last vowel)
		//Map int-String , int - frequency of vowels
		//
		ArrayList<SPair> listAns = new ArrayList<SPair>();
		ArrayList<SPair> firstAns = new ArrayList<SPair>();
		while(iter.hasNext()) {
			Word word = iter.next();
			int lastVow = get(word.lastVow);
			if(map[lastVow].get(word.vowCount)==null) {
				map[lastVow].put(word.vowCount,word.str);
			}else if(map[lastVow].containsKey(word.vowCount)) {
				String t = map[lastVow].remove(word.vowCount);
				SPair sWord = new SPair(word.str,t,word.vowCount);
				listAns.add(sWord);
				
			}
		}

		
	HashMap<Integer,String> map2 = new HashMap<Integer,String>();
	for(int i=0;i<5;i++) {
			for(HashMap.Entry<Integer,String> e: map[i].entrySet()) {
				//System.out.println(map[i].entrySet());
				//for(int j=i+1;j<5;j++) {
					if(map2.containsKey(e.getKey())) {
						String t = map2.remove(e.getKey());
						SPair pair = new SPair(e.getValue(),t,e.getKey());
						firstAns.add(pair);
					}else {
						map2.put(e.getKey(),e.getValue());
					}
				//}
			}
		
	}
	
	ArrayList<StringPair> finalAns = new ArrayList<StringPair>();
	if(listAns.isEmpty()) {
		System.out.println(0);
		return;
	}
	while(!firstAns.isEmpty()) {
		if(!listAns.isEmpty()) {
		SPair pair1 = firstAns.remove(0);
		SPair pair2 = listAns.remove(0);
		StringPair ans = new StringPair();
		ans.s1 = pair1.s1+" "+pair2.s1;
		ans.s2 = pair1.s2+" "+pair2.s2;
		finalAns.add(ans);
		}
		else {
			break;
		}
		
	}
	//System.out.println("=====");
	
	while(listAns.size()>=2) {
			SPair pair1 = listAns.remove(0);
			SPair pair2 = listAns.remove(0);
			StringPair ans = new StringPair();
			ans.s1 = pair1.s1+" "+pair2.s1;
			ans.s2 = pair1.s2+" "+pair2.s2;
			finalAns.add(ans);
	}
	System.out.println(finalAns.size());
	while(!finalAns.isEmpty()) {
		StringPair ans = finalAns.remove(0);
		System.out.println(ans.s1);
		System.out.println(ans.s2);
	}
	
	
}
}