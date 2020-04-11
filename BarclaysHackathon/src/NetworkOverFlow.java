import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class NetworkOverFlow {
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
	
	static class BinaryTreeNode{
		int data;
		BinaryTreeNode left = null;
		BinaryTreeNode right = null;
	}
	public static int overflow(BinaryTreeNode root,int packets) {
		if(root==null) {
			return packets;
		}
		int capacity = root.data;
		int rem=packets-capacity;
		if(capacity>=packets) {
			return 0 ;
		}
		else {
			int leftOverflow = overflow(root.left,(rem+1)/2);
			int rightOverflow = overflow(root.right,rem-((rem+1)/2));
			return leftOverflow+rightOverflow;
		}
	}
	
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int m = s.nextInt();
		int k = 1;
		Queue<BinaryTreeNode> pendingNodes = new LinkedList<>();
		BinaryTreeNode root = new BinaryTreeNode();
		root.data = s.nextInt();
		pendingNodes.add(root);
		k++;
		while(!pendingNodes.isEmpty() && k<=m) {
			BinaryTreeNode frontNode = pendingNodes.remove();
			BinaryTreeNode leftNode = new BinaryTreeNode();
			leftNode.data = s.nextInt();
			frontNode.left = leftNode;
			pendingNodes.add(leftNode);
			k++;
			if(k<=m) {
				BinaryTreeNode rightNode = new BinaryTreeNode();
				rightNode.data = s.nextInt();
				frontNode.right = rightNode;
				pendingNodes.add(rightNode);
				k++;
			}
			
		}
		int ans = overflow(root,n);
		System.out.println(ans);
		
			
	}
}


