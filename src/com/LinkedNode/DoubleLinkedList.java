package com.LinkedNode;

public class DoubleLinkedList {
	public Node head =null;
	public static void main(String[] args) {
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		node1.next=node2;
		node1.prev=null;
		node2.next=node3;
		node2.prev=node1;
		node3.next=node4;
		node3.prev=node2;
		node4.next=null;
		node4.prev=node3;
		
		while(node1!=null) {
			System.out.println(" double linked list is -- "+ node1.data);
			node1=node1.next;
		}
		DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
		Node node=doubleLinkedList.createDoubleLinkedList();
		Node reverseDoubleLinkedList=doubleLinkedList.reverseDoubleLinkedList(node);
		printNodes(reverseDoubleLinkedList);
		
	}
	
	Node createDoubleLinkedList() {
		
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		node1.next=node2;
		node1.prev=null;
		node2.next=node3;
		node2.prev=node1;
		node3.next=node4;
		node3.prev=node2;
		node4.next=null;
		node4.prev=node3;
	
	
	return node1;
	}
	
	Node reverseDoubleLinkedList(Node node1) {
		Node prev=null;
		Node current=node1;
		Node temp = null;
		while(current!=null) {
//			swap links
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		head=temp.prev;
		return head;
	}
	
	static void printNodes(Node node) {
		while(node!=null) {
			System.out.println(" node data is -- "+ node.data);
			node=node.next;
		}
	}
}
