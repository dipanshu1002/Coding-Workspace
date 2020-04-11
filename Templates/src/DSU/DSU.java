package DSU;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DSU{
	////// FUNCTIONS IMPLEMENTED /////
	/*
	 * DSU(~ constructor)
	 * union ( does union by size )
	 * makeSet ( makes the set - parent of it is itself )
	 * find ( does find by using path compression technique )
	 * size ( takes a node(integer) and returns the size(no. of nodes) of the component it is part of. )
	 */
	int n;
	int[] parent;
	int[] size;
	DSU(int n){
		this.n = n;
		parent = new int[n];
		for(int i=0;i<n;i++){
			parent[i]=i;
		}
		size = new int[n];
		for(int i=0;i<n;i++) {
			size[i]=1;
		}
	}
	
	// UNION BY SIZE
	void union(int v1, int v2) {
		int p1 = find(parent, v1);
		int p2 = find(parent, v2);
		if(p1!=p2) {
			if(size[p2]<=size[p1]) {
				size[p1]+=size[p2];
				parent[p2]=p1;
			}else {
				size[p2]+=size[p1];
				parent[p1]=p2;
			}
		}else if(p1==p2) {
			return;
		}
	}
	
	
	
	//UNION SET
	void unionSet(int v1, int v2){
		int p1 = find(parent, v1);
		int p2 = find(parent, v2);
		if(p1!=p2){
			
		}
	}
	
	//MAKE SET
	void makeSet(int[] parent,int v){
		parent[v]=v;
	}
	
	// FIND BY PATH COMPRESSION
	int find(int[] parent,int v){
		if(parent[v]==v){
			return v;
		}
		else{
			parent[v]=find(parent,parent[v]);
			return parent[v];
		}
	}
	
	// SHOW SIZE (I.E NO OF NODES IN A CONNECTED COMPONENT
	int size(int v1) {
		int p1 = find(parent,v1);
		return size[p1];
	}
}