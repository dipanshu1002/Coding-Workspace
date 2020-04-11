import java.util.Scanner;

public class LinkedListUse {
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp= head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		Node<Integer> head=null,tail=null;
		int data=s.nextInt();
		while(data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=tail.next;
			}
			data=s.nextInt();
			
		}
		s.close();
		return head;
	}
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		Node<Integer> newNode=new Node<Integer>(data);
		int index = 0;
		Node<Integer> temp = head;
		if(pos==0) {
			newNode.next = head;
			head=newNode;
			return newNode;
		}
		else {
		while(index<(pos-1)) {
			temp=temp.next;
			index++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		}
		return head;
	}
	
	public static Node<Integer> delete(Node<Integer> head, int pos) {
		int index=0;
		Node<Integer> temp= head;
		if(pos==0) {
			temp=temp.next;
			return temp;
			
		}
		while(index<pos-1 && temp.next!=null) {
			temp=temp.next;
			index++;
		}
		if(temp.next==null) {
			return head;
		}else {
		temp.next=temp.next.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> LL=takeInput();
		printLL(LL);
		LL = insert(LL,45,0);
		printLL(LL);
		LL = delete(LL, 5);
		printLL(LL);

		
	}
}
