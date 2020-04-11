import java.util.*;	

public class BinaryTreeUSe {
	// PRINT RECURSIVELY - MY SOLUTION
	public static void print(BinaryTreeNode<Integer> root) {
		//This is BaseCase in this case. Different from normal generic tree
		if(root == null) {
			return;
		} 
		String str = root.data +": ";
		if(root.left==null) {
			str+="L_";
		}
		else {
			str+="L"+root.left.data;
		}
		if(root.right==null) {
			str+=", R_";
		}
		else {
			str+=", R"+root.right.data;
		}
		System.out.println(str);
		print(root.left);
		print(root.right);
		
	}
	
	//PRINT RECURSIVELY - CN SOLUTION
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		String str = root.data+": ";
		if(root.left!=null) {
			str+="L:"+root.left.data+",";
		}
		if(root.right!=null) {
			str+="R:"+root.right.data;
		}
		System.out.println(str);
		printTree(root.left);
		printTree(root.right);
	}
	
	//PRINT LEVEL WISE 
	public static void printTreeLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.remove();
			String str = frontNode.data+":";
			if(frontNode.left!=null) {
				str+="L:"+frontNode.left.data+",";
				pendingNodes.add(frontNode.left);
			}
			if(frontNode.right!=null) {
				str+="R:"+frontNode.right.data;
				pendingNodes.add(frontNode.right);
			}
			System.out.println(str);
		}
	}
	
	// TAKE INPUT - RECURSIVELY
	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		System.out.println("Enter the node data");
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = takeInput(s);
		root.right = takeInput(s);
		return root;
	}
	
	//TAKE INPUT - LEVEL WISE
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		System.out.println("Enter root data");
		int rootData=s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.remove();
			System.out.println("Enter left child of "+frontNode.data);
			int leftChild = s.nextInt();
			if(leftChild!=-1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.add(child);
				frontNode.left=child;
			}
			System.out.println("Enter right child of "+frontNode.data);
			int rightChild = s.nextInt();
			if(rightChild!=-1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.add(child);
				frontNode.right=child;
			}
			
		}
		return root;
		
	}
	
	//FIND NUMBER OF NODES
	
	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int ans = 1;
		ans+=countNodes(root.left);
		ans+=countNodes(root.right);
		return ans;
	}
	
	//FIND HEIGHT OF BINARY TREE
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	//FIND NODE 
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int data) {
		if(root == null) {
			return false;
		}
		if(root.data == data) {
			return true;
		}
		boolean leftAns = isNodePresent(root.left, data);
		boolean rightAns = isNodePresent(root.right, data);
		return (leftAns||rightAns);
	}
	
	//MIRROR A BINARY TREE
	public static void mirrorTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorTree(root.left);
		mirrorTree(root.right);
		return;
	}
	// DIAMETER - O(n*h)
	 public static int diameter(BinaryTreeNode<Integer> root) {
		 if(root == null) {
			 return 0;
		 }
		 int leftHeight = height(root.left);
		 int rightHeight = height(root.right);
		 int option1 = leftHeight + rightHeight;
		 int option2 = diameter(root.left);
		 int option3 = diameter(root.right);
		 return Math.max(option1, Math.max(option2, option3));
	
	 }
	 
	 // DIAMETER - BETTER APPROACH - USING PAIR CLASS - O(n)
	 
	 public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root){
		 if(root ==  null) {
			 Pair<Integer, Integer> output = new Pair<>();
			 output.first = 0;
			 output.second = 0;
			 return output;
		 }
		 Pair<Integer, Integer> lo = heightDiameter(root.left);
		 Pair<Integer, Integer> ro = heightDiameter(root.right);
		 int option1 = lo.first + ro.first;
		 int option2 = lo.second;
		 int option3 = ro.second;
		 Pair<Integer, Integer> output = new Pair<>();
		 output.first = 1 + Math.max(lo.first, ro.first);
		 output.second = Math.max(option1, Math.max(option2, option3));
		 return output;
		 
		 
	 }
	 
	 // INORDER TRAVERSAL
	 
	 public static void inorder(BinaryTreeNode<Integer> root) {
		 if(root == null) {
			 return;
		 }
		 inorder(root.left);
		 System.out.print(root.data+" ");
		 inorder(root.right);
	 }
	 
	 public static BinaryTreeNode<Integer> helper(int[] pre, int[] in, int pre_start, int pre_end, int in_start, int in_end){
	     if(pre_start>pre_end) {
	    	 return null;
	     }
	     
		 if(pre_start==pre_end) {
	    	 BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(pre[pre_start]);
	    	 root.left = null;
	    	 root.right = null;
	    	 return root;
	     }
		 BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(pre[pre_start]);
		 int start = in_start;
	      while(in[start]!=root.data) {
	      	start++;
	      }
	      int length = start - in_start;
	      root.left = helper(pre, in,pre_start+1,pre_start+1+length-1 ,in_start, start-1 );
	      root.right = helper(pre, in, pre_start+1+length,pre_end,start+1,in_end);
	      return root;	
	      	
	    }
	 
	 public static BinaryTreeNode<Integer> treeConstruct(int[] pre, int[] in){
		 
		 BinaryTreeNode<Integer> root = helper(pre, in, 0, pre.length-1, 0, in.length-1);
		 return root;
	 }
	 
	 
	 
	 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//BinaryTreeNode<Integer> root = takeInput(s);
		//print(root);
	//	BinaryTreeNode<Integer> root = takeInputLevelWise();
	//	printTree(root);
	//	printTreeLevelWise(root);
	//	System.out.println(countNodes(root));
	//	System.out.println(height(root));
	//	System.out.println(isNodePresent(root, 5));
	//	mirrorTree(root);
	//	printTreeLevelWise(root);
	//	System.out.println(diameter(root));
	//	System.out.println(heightDiameter(root).second);
		int[] pre = new int[] {1,2};
		int[] in = new int[] {2,1};
		printTreeLevelWise(treeConstruct(pre, in));
		
	}

}
