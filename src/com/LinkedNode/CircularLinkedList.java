package com.LinkedNode;

public class CircularLinkedList {
//	public Node head =null;
	public static void main(String[] args) {
		CircularLinkedList circulareLinkedList = new CircularLinkedList();
		Node node=circulareLinkedList.createCircularLinkedList();
		Node nodeAtbeginning=circulareLinkedList.insertNodeAtBeginning(node,0);
		printNodes(nodeAtbeginning);
		System.out.println("================");
		Node nodeAtEnd=circulareLinkedList.insertNodeAtEnd(nodeAtbeginning,5);
		printNodes(nodeAtEnd);
		System.out.println("================");
		Node insertNodeMiddleOfNode=circulareLinkedList.insertNodeMiddleOfNodes(node.next, node.next.next, 9);
		printNodes(insertNodeMiddleOfNode);
		System.out.println("=================");
		boolean value=circulareLinkedList.hasCycle(insertNodeMiddleOfNode);
		System.out.println("has cycle -- "+ value);
		
	}
	
	Node createCircularLinkedList() {
		Node node = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		node.next = node1;
		node1.next = node2;
		node2.next = node;
		return node;
	}

	 Node insertNodeAtEnd(Node node, int i) {
		Node head=node;
		Node newNode=new Node(i);
		Node current=node;
		while(current.next!=head) {
			current=current.next;
		}
		current.next=newNode;
		newNode.next=head;
		return head;
	}


	
	Node insertNodeMiddleOfNodes(Node prev,Node next,int data) {
		
		Node newNode=new Node(data);
		prev.next=newNode;
		newNode.next=next;
		
		return prev;
	}

	Node insertNodeAtBeginning(Node node,int data) {
		Node newNode=new Node(data);
		Node head=node;
		Node current=head;
		while(current.next!=head) {
			current=current.next;
		}
		current.next=newNode;
		newNode.next=head;
		head=newNode;
		
		return head;
	}
	
	boolean hasCycle(Node node) {
		Node slow=node;
		Node fast=node;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	static void printNodes(Node node) {
		Node curr = node;
		do {
			System.out.println(" node data is -- " + curr.data);
			curr = curr.next;
		} while (curr != node);
	}

}
