package com.LinkedNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

class Node{
	int data;
	Node next;
	Node prev;
	Node(){
		
	}
	Node(int data){
		this.data=data;
	}
}

public class SingleLinkedList {
	Node head =null;
	public static void main(String[] args) {
		SingleLinkedList singleLinkedList=new SingleLinkedList();
		
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		node1.next=node2;
		node1.next.next=node3;
		node1.next.next.next =node4;
		node1.next.next.next.next=node5;
		
		Node secondNode1=new Node(1);
		Node secondNode2=new Node(3);
		Node secondNode3=new Node(5);
		Node secondNode4=new Node(6);
		Node secondNode5=new Node(7);
		secondNode1.next=secondNode2;
		secondNode2.next=secondNode3;
		secondNode3.next=secondNode4;
		secondNode4.next=secondNode5;
		
//		Node insertNode=singleLinkedList.insertAtBeginning(node1, 6);
//		printNodes(insertNode);
//		System.out.println("=============");
//		Node reverseNode=singleLinkedList.reverse(insertNode);
//		printNodes(reverseNode);
//		System.out.println("===============");
//		Node insertAfterGivenNode=singleLinkedList.insertAfterGivenNode(node5, 7);
//		printNodes(insertAfterGivenNode);
//		System.out.println("======Insertion at given position===========");
//		
//		Node beforeGivenNode=singleLinkedList.beforeGivenNode(node1, node2, 9);
//		printNodes(beforeGivenNode);
//		
//		singleLinkedList.countNode(node1);
//		
//		singleLinkedList.searchElement(node1, 9);
		
		System.out.println("==================================================");
//		boolean value=singleLinkedList.hasCycle(node1);
//		System.out.println("has cycle-- "+ value);
//		
//		boolean valueHash=singleLinkedList.hasCycleUsingHash(node1);
//		System.out.println(" value hash-- "+ valueHash);
//		
//		System.out.println("======================");
		
		Node mergedNode=singleLinkedList.mergeNodes(node1, secondNode1);
		printNodes(mergedNode);
		System.out.println("=============");
		Node mergeNodesUsingRecurssion=singleLinkedList.mergeNodesUsingRecurssion(node1, secondNode1);
		printNodes(mergeNodesUsingRecurssion);
		
	}
	
	static void printNodes(Node node) {
		while(node!=null) {
			System.out.println(" node data is -- "+ node.data);
			node=node.next;
		}
	}
	
//	Anil code
	 public Node mergeTwoLists(Node list1, Node list2) {
		 Node list3=null;
		 Node currentNode = null;
       while(list1!=null && list2!=null){
           
               if(list1.data<list2.data){
                   if(currentNode==null){
                       currentNode = new Node(list1.data);
                       list3 = currentNode;
                   } else{
                       currentNode.next = new Node(list1.data);
                       currentNode =currentNode.next;
                   }
                   list1=list1.next;
               }else{
                   if(currentNode==null){
                       currentNode = new Node(list2.data);
                       list3 = currentNode;
                   } else{
                       currentNode.next = new Node(list2.data);
                       currentNode =currentNode.next;
                   }
                   list2=list2.next;
               }
           
       }
       if(list1!=null&&currentNode !=null){
           currentNode.next = list1;
           currentNode =currentNode.next;
       }
        if(list2!=null && currentNode !=null){
           currentNode.next = list2;
           currentNode =currentNode.next;
       }
       return list3;
   }
	
	
	
//	merge two nodes into one sort using collections
	Node mergeNodes(Node node1,Node node2) {
		Node node3=new Node();
		Node current=node3;
		List<Integer> list=new ArrayList<>();
		while(node1!=null) {
			list.add(node1.data);
			node1=node1.next;
		}
		while(node2!=null) {
			list.add(node2.data);
			node2=node2.next;
		}
		Collections.sort(list);
		
		for(int i=0;i<=list.size()-1;i++) {
			current.next=new Node(list.get(i));
			current=current.next;
		}
		
		
		return node3.next;
	}
	
//	merge nodes using recursion
	
	Node mergeNodesUsingRecurssion(Node node1,Node node2) {
		if(node1==null) return node2;
		if(node2==null) return node1;
		
		if(node1.data<node2.data) {
			node1.next=mergeNodesUsingRecurssion(node1.next, node2);
			return node1;
		}else{
			node2.next=mergeNodesUsingRecurssion(node1, node2.next);
			return node2;
		}	
	}
	
//	merge two nodes using temp node.
	Node mergeUsingTempNode(Node node1,Node node2) {
		Node temp=null;
		while(node1!=null) {
			
		}
		
		return temp;
	}
	
//	using Floyd’s cycle finding algorithm or Hare-Tortoise algorithm
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
	
//	using hashing has cycle
	boolean hasCycleUsingHash(Node node) {
		HashSet<Node> set=new HashSet<>();
		while(node!=null) {
			set.add(node);
			node=node.next;
			if(set.contains(node)) {
				return true;
			}
		}
		
		return false;
	}
	
	Node reverse(Node node) {
		Node prev=null;
		Node current=node;
		Node temp;
		while(current!=null) {
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		node=prev;
		return node;
	}
	
	Node insertAtBeginning(Node node,int data) {
		Node newNode=new Node(data);
		if(node!=null) {
			newNode.next=node;
		}
		
		return newNode;
	}
	
	Node insertAfterGivenNode(Node givenNode,int data) {
		Node node=new Node(data);
		Node n=givenNode.next;
		givenNode.next=node;
		node.next=n;
		return givenNode;
	}
	
	Node beforeGivenNode(Node prev,Node current,int data) {
		Node newNode=new Node(data);
		prev.next=newNode;
		newNode.next=current;
		
		return prev;
	}
	
	int countNode(Node node) {
		int count=0;
		while(node!=null) {
			count++;
			node=node.next;
		}
		System.out.println(" count is -- "+ count);
		return count;
	}

	boolean searchElement(Node node,int element) {
		Vector<Integer> v=new Vector<>();
		while(node!=null) {
			v.add(node.data);
			node=node.next;
//			System.out.println(" v is -- "+ v);
		}
		
		if(v.indexOf(element)!=-1) {
			System.out.println(" true ");
			return true;
		}
		return false;
	}
	
	Node doubleLinkedList() {

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
		
//		while(node1!=null) {
//			System.out.println(" double linked list is -- "+ node1.data);
//			node1=node1.next;
//		}
		
		
		SingleLinkedList singleLinkedList=new SingleLinkedList();
		Node reverseDoubleLinkedList=singleLinkedList.reverseDoubleLinkedList(node1,head);
//		printNodes(node1);
		printNodes(reverseDoubleLinkedList);
	return reverseDoubleLinkedList;
	}
	
	
	
	Node reverseDoubleLinkedList(Node node1,Node head) {
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

	Node deleteNode(Node node) {
//		1 9 2 3 4 5
//		delete 9
		
		
		return node;
	}
}

//	class DoubleLinkedList {
//		public static void main(String[] args) {
//			Node node1=new Node(1);
//			Node node2=new Node(2);
//			Node node3=new Node(3);
//			Node node4=new Node(4);
//			node1.next=node2;
//			node1.prev=null;
//			node2.next=node3;
//			node2.prev=node1;
//			node3.next=node4;
//			node3.prev=node2;
//			node4.next=null;
//			node4.prev=node3;
//			
//			while(node1!=null) {
//				System.out.println(" double linked list is -- "+ node1.data);
//				node1=node1.next;
//			}
//		}
//	}


