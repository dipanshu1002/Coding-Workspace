package Round566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeC {
	static class Word{
		int freq;
		int vow;
		int con;
		char last_vow;
		
		public Word(int freq,int vow,int con,char last_vow) {
			this.freq=freq;
			this.vow=vow;
			this.con=con;
			this.last_vow=last_vow;
		}
	}
	
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
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long n = s.nextLong();
		HashMap<String,Word> map = new HashMap<String,Word>();
		for(int i=0;i<n;i++) {
			String str = s.nextLine();
			if(map.get(str)==null) {
				int vow=0;
				int con=0;
				char last_vow='.';
				for(int j=0;j<str.length();j++) {
					if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'){
						vow++;
						last_vow=str.charAt(j);
					}
					else {
						con++;
					}
					}
				map.put(str,new Word(1,vow,con,last_vow));
			}
			else {
				Word word = map.get(str);
				word.freq+=1;
				map.put(str,word);
			}
		}
		Set<String> set = map.keySet();
		ArrayList<String> sastVow = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
			
		HashMap<Integer,Set<String>> map2 = new HashMap<Integer,Set<String>>();
		HashMap<Integer,Set<String>> map3 = new HashMap<Integer,Set<String>>();
		HashMap<Integer,Set<String>> map4 = new HashMap<Integer,Set<String>>();

		for(String st: set) {
			
			//Freq as key
			if(map2.get(map.get(st).freq)==null) {
				map2.put(map.get(st).freq,new HashSet<String>());
				map2.get(map.get(st).freq).add(st);
			}else {
				map2.get(map.get(st).freq).add(st);
			}
			//Vowels as key
			if(map3.get(map.get(st).vow)==null) {
				map3.put(map.get(st).vow,new HashSet<String>());
				map3.get(map.get(st).vow).add(st);
			}else {
				map3.get(map.get(st).vow).add(st);
			}
			
		}
		for(String st: set) {
			//Last Vowels as key
			if(map4.get(map.get(st).vow)==null) {
				map4.put(map.get(st).vow,new HashSet<String>());
				map4.get(map.get(st).vow).add(st);
				for(String st3 : map3.get(map.get(st).vow)) {
					if(map.get(st).last_vow==map.get(st3).last_vow && st!=st3) {
						map4.get(map.get(st).vow).add(st3);
					}
				}
			}else {
				continue;
			}
			//System.out.println(st+": "+map.get(st).freq+" "+map.get(st).vow+" "+map.get(st).con+" "+map.get(st).last_vow);
		}
		Iterator<HashMap.Entry<Integer,Set<String>>> itr = map4.entrySet().iterator();
		while(itr.hasNext()) {
			HashMap.Entry<Integer,Set<String>> entry = itr.next();
			if(entry.getValue().size()<=1) {
				itr.remove();
			}
		}
		Iterator<HashMap.Entry<Integer,Set<String>>> itr2 = map3.entrySet().iterator();
		while(itr2.hasNext()) {
			//System.out.println("Iterstor");
			HashMap.Entry<Integer,Set<String>> entry = itr2.next();
			//System.out.println("Entry "+entry);
			if(map4.get(entry.getKey())!=null) {
			Set<String> set2 = map4.get(entry.getKey());
			Set<String> set1 = entry.getValue();
			set1.removeAll(set2);
			if(set1.isEmpty()) {
				itr2.remove();
			}
			}
			
		}


		System.out.println(map2);
		System.out.println(map3);
		System.out.println(map4);
		//System.out.println(map);
	}
}
