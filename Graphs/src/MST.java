import java.util.*;
public class MST {
	static class Edges{
		int src;
		int des;
		int weight;
	}
	
	public static int topParent(int[] parent,int i) {
		if(parent[i]==i) {
			return parent[i];
		}
		else {
			int ans = topParent(parent,parent[i]);
			return ans;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int T = s.nextInt();
//		for(int t=0;t<T;t++) {
		int n = s.nextInt();
		int e = s.nextInt();
		Edges[] arr = new Edges[e];
		for(int i=0;i<e;i++) {
			Edges edge = new Edges();
			edge.src = s.nextInt();
			edge.des = s.nextInt();
			edge.weight = s.nextInt();
			arr[i]=edge;
		}
		
		Arrays.sort(arr, new Comparator<Edges>(){
			public int compare(Edges left, Edges right) {
				return left.weight-right.weight;
			}
			
		});
//		System.out.println(Arrays.toString(arr));
		for(int i=0;i<e;i++) {
			System.out.print(arr[i].src+" "+arr[i].des+" "+arr[i].weight+" ");
			System.out.println();
		}
		System.out.println();

		Edges[] output = new Edges[n-1];
		
		int[] parent = new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		int count = 0;
		while(count<(n-1)) {
			//System.out.println(count);
			for(int i=0;i<e;i++) {
				int p1 = topParent(parent,arr[i].src);
				int p2 = topParent(parent,arr[i].des);
				//System.out.println(arr[i].src+" "+arr[i].des+" "+p1+" "+p2);
				if(p1!=p2) {
					parent[p2]=p1;
					output[count]=arr[i];
					count++;
					if(count>=(n-1)) {
						break;
					}
				}
				else {
					continue;
				}
			}
		}
		
		//System.out.println(count);
		for(int i=0;i<n-1;i++) {
			if(output[i].des<output[i].src) {
				int temp = output[i].src;
				output[i].src = output[i].des;
				output[i].des=temp;
			}
			System.out.println((output[i].src) +" "+(output[i].des)+" "+output[i].weight);
		}
		
	}
}
