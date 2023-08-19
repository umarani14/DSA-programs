package com.LinkedNode;

import java.util.Vector;

public class FirstProgram {
	
	public static void main(String[] args) {
		//create a head
		// call AddElement method to do adding operation
		Node[] head=new Node[1];
//		AddElement add=new AddElement();
		for(int i=0;i<3;i++) {
//			add.addElementAtBeginning(head, i);
			System.out.println(" i value is -- "+ i);
		}
		Node prev=new Node(1);
		
//		add.addElementAtGivenPosition(head[0],prev, 4);
//		
//		add.addElementAtEnd(head, 5);
//		CountElements count=new CountElements();
//		count.countElements(head);
//		SearchElement searchElement=new SearchElement();
//		searchElement.search(head);
//		
//		ReverseElements revElements=new ReverseElements();
//		revElements.reverseElements(head);
	}

}

// to add a new element to the beginning of the list
//	class AddElement{
//		public void addElementAtBeginning(Node[] head,int value) {
//			// create a new node to add value into the list
//			Node newNode=new Node();
//			newNode.data=value;
//			newNode.next=head[0];
//			head[0]=newNode;
//			System.out.println(" head[0] value is " + head[0] );
//		}
//		public void addElementAtGivenPosition(Node head,Node prev,int data) {
//			if(prev==null) {
//				System.out.println(" prev node cannot be null");
//			}
//			
//			Node newNode=new Node();
//			newNode.data=data;
//			newNode.next=prev.next;
//			prev.next=newNode;
//			
//		}
//		
//		public void addElementAtEnd(Node[] head,int data) {
//			Node newNode=new Node();
//			newNode.data=data;
//			if(head[0]==null) {
//				head[0]=newNode;
//			}
//			newNode.next=null;
//			Node last=head[0];
//			
//			while(last.next!=null) {
//				last=last.next;
//			}
//			
//			last=newNode;
//		}
//		
//		public void addElementBeforeGivenNode(Node[] head,Node nextNode,int data){
//			Node newNode=new Node();
//			newNode.data=data;
////			nextNode.
////			while(hea)
//			
////			if(head.next==nextNode) {
////				nextNode=newNode;
////			}
//			
////			newNode.next=nextNode.next;
//			
//			
//			
//		}
//		
//	}
	
	class SearchElement{
//		using vector to store elements and search on vector
		public boolean search(Node[] nodes) {
			Vector<Integer> vector=new Vector<>();
			Node node=nodes[0];
			while(node.next!=null) {
				vector.add(node.data);
				node=node.next;
			}
			int v=vector.indexOf(3);
			if(v==-1) {
				System.out.println("false");
				return false;
			}else {
				System.out.println("true");
			return true;
			}
		}
	}
	
	class ReverseElements{
		public void reverseElements(Node[] nodes) {
			Node prev=null;
			Node next1;
			Node head;
			Node current = nodes[0];
			Node node=nodes[0];
			while(node.next!=null) {
				System.out.println("nodes is-- "+ node.next);
				next1=current.next;
				current.next=prev;
				prev=current;
				current=next1;
			}
			head=prev;
		}
		
	}
	
	class CountElements{
		public int countElements(Node[] node) {
			int count=0;
			int length=node.length;
			System.out.println(" length is -- "+ length);
			
			return count;
		}
	}
	

//class Node {
//    public int data;
//    public Node next;
//    
//}

