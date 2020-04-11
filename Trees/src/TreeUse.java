import java.util.Queue;
import java.util.Scanner;
import java.util.*;

import javax.management.QueryExp;

public class TreeUse {
	// TAKE INPUT Function
	public static TreeNode<Integer> takeInput(Scanner s){
		
		System.out.println("Enter the node data");
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		System.out.println("Enter the number of children for "+ root.data);
		int childCount = s.nextInt();
		for(int i=0;i<childCount;i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
		
	}
	// TAKING INPUT LEVEL WISE
	public static TreeNode<Integer> takeInputLevel(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = s.nextInt();
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.remove();
			System.out.println("Enter no. of children of "+ frontNode.data);
			int childCount=s.nextInt();
			for(int i=0;i<childCount;i++) {
				System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				frontNode.children.add(child);
				pendingNodes.add(child);
			}
		}
		return root;
		
	}
	
	//PRINT RECURSIVE Function
	
	public static void print(TreeNode<Integer> root) {
		String str=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			str+=root.children.get(i).data+",";
		}
		System.out.println(str);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	//PRINT LEVEL WISE Function
	
	public static void printLevelWise(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.remove();
			String str=frontNode.data+": ";
			for(int i=0;i<frontNode.children.size();i++) {
				TreeNode<Integer> childNode = frontNode.children.get(i);
				pendingNodes.add(childNode);
				str+=childNode.data+",";
			}
			System.out.println(str);
		}
	}
		
	// FIND NUMBER OF NODES
		
	public static int numNodes(TreeNode<Integer> root) {
		// ****NOT**** a Base Case, 
		
		if(root == null) {
			return 0;
		}
		
		// ^^^ ONLY THE EDGE CASE ^^^
		
		
		int sum = 1;
		for(int i=0;i<root.children.size();i++) {
			sum += numNodes(root.children.get(i));
		}
		return sum;
		
	}
	
	// Find the Largest Node in the Tree
	
	public static int largest(TreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int[] arr= new int[root.children.size()+1];
		arr[root.children.size()] = root.data;
		
		for(int i=0;i<root.children.size();i++) {
			arr[i] = Math.max(root.children.get(i).data, largest(root.children.get(i)));
		}
		Arrays.sort(arr);
		return arr[root.children.size()];
		
	}
	
	// Largest Node - Coding ninja(Video) Solution
	public static int largestCN(TreeNode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int ans = root.data;
		for(int i=0;i<root.children.size();i++) {
			int largest = largestCN(root.children.get(i));
			if(largest>ans) {
				ans= largest;
			}
		}
		return ans;
	}
	
	// HEIGHT of Tree
	public static int height(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int height = 0;
		for(int i=0;i<root.children.size();i++) {
			int childHeight = height(root.children.get(i));
			if(childHeight>height){
				height = childHeight;
			}
		}
		return 1 + height;
	
	}
	
	// DEPTH of a Node ( ##PRINT nodes at Depth - K
	
	public static void nodesAtK(TreeNode<Integer> root, int K) {
		if(K<0) {
			return ;
		}
		if(K==0) {
			System.out.print(root.data+" ");
			return ;
		}
		for(int i=0;i<root.children.size();i++) {
			nodesAtK(root.children.get(i), K-1);
		}
		
	}
	
	// Total Number of Leaf Nodes
	
	public static int leafNodes(TreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.children.size()==0) {
			return 1;
		}
		int total = 0;
		for(int i=0;i<root.children.size();i++) {
			total+=leafNodes(root.children.get(i));
		}
		return total;
	}
	///////****TREE TRAVERSALS****///////
	
	//PREORDER
	
	public static void preorder(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			preorder(root.children.get(i));
		}
	}
	
	//POSTORDER
	
	public static void postorder(TreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			postorder(root.children.get(i));
		}
		System.out.print(root.data+" ");
	}
		
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	//	TreeNode<Integer> root = new TreeNode<>(5);
	//	TreeNode<Integer> root = takeInput(s);
	//	System.out.println("Root is "+ root.data);
	//	print(root);
		TreeNode<Integer> root2 = takeInputLevel();
	//	print(root2);
		printLevelWise(root2);
		System.out.println(numNodes(root2));
		System.out.println(largest(root2));
		System.out.println(largestCN(root2));
		System.out.println(height(root2));
		nodesAtK(root2, 3);
		System.out.println("Total Leaf Nodes : "+ leafNodes(root2));
		preorder(root2);
		System.out.println();
		postorder(root2);
	}
}
