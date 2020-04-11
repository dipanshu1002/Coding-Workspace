package AnujaIISc;
import java.util.*;
import java.util.List;
public class Substring 
{ 
	static int id = 0;
    static class email{
        String sender;
        String receiver;
        String message;
    }
    static class Pair{
        String s;
        String r;
        String msg;
        int id;
    }
    public static int checkPair(Pair p3, Set<Pair> set) {
         for(Pair p : set) {
        	 //System.out.println(p.s);
             if((p.s.equals(p3.s)||p.s.equals(p3.r)) && (p.r.equals(p3.s)||p.r.equals(p3.r))) {
                 return p.id;
             }
         }
        return -1;
    }

    public static List<List<Integer>> getEmailThreads(List<String> emails) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Pair> set = new HashSet<Pair>();
        int n = emails.size();
        
        for(String st: emails){
            String[] str = st.split(", ",3);
           //System.out.println(str.length);
            Pair p = new Pair();
            p.s = str[0];
            p.r = str[1];
            

            if(checkPair(p,set)==-1){
            //	System.out.println("called");
                p.id = id+1;
                id+=1;
                set.add(p);
                String msg = str[2];
                int count=1;
                for(int j=0;j<msg.length()-3;j++){
                    if(msg.charAt(j)=='-'&&msg.charAt(j+1)=='-' && msg.charAt(j+2)=='-'){
                        count+=1;
                        j+=3;
                    }
                }
                List<Integer> list2 = new ArrayList<>();
                list2.add(p.id);
                list2.add(count);
                ans.add(list2);
            }else{
                String msg = str[2];
                int count=1;
                p.id = checkPair(p,set);
                for(int j=0;j<msg.length()-3;j++){
                    if(msg.charAt(j)=='-'&&msg.charAt(j+1)=='-' && msg.charAt(j+2)=='-'){
                        count+=1;
                        j+=3;
                    }
                }
                    List<Integer> list2 = new ArrayList<>();
                    list2.add(p.id);
                    list2.add(count);
                    ans.add(list2);
                }
                
          
        }
        
        return ans;
    }
 
    public static void main(String args[])  
    { 
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      s.nextLine();
      List<String> emails = new ArrayList<>();
      for(int i=0;i<n;i++) {
    	  String str = s.nextLine();
    	  emails.add(str);
      }

      List<List<Integer>> ans = new ArrayList<>();
      ans = getEmailThreads(emails);
      System.out.println(ans);
          
    } 
} 