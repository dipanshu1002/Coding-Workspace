package Round588;

import java.util.*;
import java.io.*;
import java.text.*;
public class Main{
    //SOLUTION BEGIN
    void pre() throws Exception{}
    void solve(int TC) throws Exception{
        int n = ni();
        Pair[] val = new Pair[n];
        for(int i = 0; i< n; i++)val[i] = new Pair(nl(), 0);
        for(int i = 0; i< n; i++)val[i].b = nl();
        Arrays.sort(val);
        boolean[] sel = new boolean[n];
        long[] set = new long[n];int cnt = 0;
        for(int i = 1; i< n; i++){
            if(val[i-1].a == val[i].a)
                set[cnt++] = val[i].a;
        }
        long ans = 0;
        for(int i = 0; i< n; i++){
            boolean inc = false;
            for(int j = 0; j< cnt; j++)if((val[i].a&set[j]) == val[i].a)inc = true;
            if(inc)ans += val[i].b;
        }
        pn(ans);
    }
    class Pair implements Comparable<Pair>{
        long a, b;
        public Pair(long A, long B){
            a = A;b = B;
        }
        public int compareTo(Pair p){return Long.compare(a, p.a);}
    }
    //SOLUTION END
    void hold(boolean b)throws Exception{if(!b)throw new Exception("Hold right there, Sparky!");}
    DecimalFormat df = new DecimalFormat("0.00000000000");
    static boolean multipleTC = false;
    FastReader in;PrintWriter out;
    void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        //Solution Credits: Taranpreet Singh
        int T = (multipleTC)?ni():1;
        pre();for(int t = 1; t<= T; t++)solve(t);
        out.flush();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
    int bit(long n){return (n==0)?0:(1+bit(n&(n-1)));}
    void p(Object o){out.print(o);}
    void pn(Object o){out.println(o);}
    void pni(Object o){out.println(o);out.flush();}
    String n()throws Exception{return in.next();}
    String nln()throws Exception{return in.nextLine();}
    int ni()throws Exception{return Integer.parseInt(in.next());}
    long nl()throws Exception{return Long.parseLong(in.next());}
    double nd()throws Exception{return Double.parseDouble(in.next());}
 
    class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        public FastReader(String s) throws Exception{
            br = new BufferedReader(new FileReader(s));
        }
        String next() throws Exception{
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException  e){
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }
        String nextLine() throws Exception{
            String str = "";
            try{
                str = br.readLine();
            }catch (IOException e){
                throw new Exception(e.toString());
            }
            return str;
        }
    }
}
