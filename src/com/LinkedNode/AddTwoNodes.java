package com.LinkedNode;

public class AddTwoNodes {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		AddTwoNodes addTwoNodes=new AddTwoNodes();
		addTwoNodes.addTwoNodes();
		
	}
	
	 int addTwoNodes() {
		Node node1=new Node(2);
		Node node2=new Node(4);
		Node node3=new Node(3);
//		Node node4=new Node(4);
		node1.next=node2;
		node2.next=node3;
//		node3.next=node4;
		
		Node node5=new Node(5);
		Node node6=new Node(6);
		Node node7=new Node(4);
//		Node node8=new Node(4);
		node5.next=node6;
		node6.next=node7;
//		node7.next=node8;
		
		System.out.println("======== Add two nodes=====");
		Node addNodes=addtwoNodes(node1, node5);
		printNodes(addNodes);
		System.out.println("============end========");
//		Node revNode1=reverseNodes(node1);
//		Node revNode2=reverseNodes(node5);
//		
//		System.out.println("========================");
//		int num1=nodeToInt(revNode1);
//		int num2=nodeToInt(revNode2);
//		int sum=num1+num2;
//		Node sumNode=sumNodes(sum);
//		sumNode=reverseNodes(sumNode);
//		System.out.println("==========");
//		printNodes(sumNode);
//		return num1+num2;
		return 0;
	}
	
	 Node reverseNodes(Node node1) {
		Node head=node1;
		Node temp;
		Node prev=null;
		while(node1!=null) {
			temp=node1.next;
			node1.next=prev;
			prev=node1;
			node1=temp;
		}
		head=prev;
		
		return head;
	}
	
	 int nodeToInt(Node node) {
		StringBuffer sb=new StringBuffer();
		
		while(node!=null) {
			sb.append(node.data);
			node=node.next;
		}
		String s=sb.toString();
		int num=Integer.parseInt(s);
		return num;
	}
	 Node sumNodes(int sum) {
		 
		 Node head=null;
		 while( sum!=0) {
			 Node node=new Node(); 
			 int r=sum%10;
			 int q=sum/10;
			 sum=q;
			 System.out.println(" r is "+ r);
			 node.data=r;
			 node.next=head;
			 head=node;
		 }
		System.out.println(" reverse node is ");
		 printNodes(head);
		 return head;
	}
	 void printNodes(Node node) {
		while(node!=null) {
			System.out.println(" node data is -- "+ node.data);
			node=node.next;
		}
	}
	 
	 Node addtwoNodes(Node n1,Node n2) {
		 Node newNode=new Node(0);
		 Node head=newNode;
		 
		 int carry=0;
		 
		 while(n1!=null || n2!=null || carry!=0 ) {
			 int sum=carry;
			 if(n1!=null) {
				 sum+=n1.data; n1=n1.next;
			 }
			 if(n2!=null) {
				 sum+=n2.data;n2=n2.next;
			 }
			 carry=sum/10;
			int remainder=sum%10;
			newNode.next=new Node(remainder);
			newNode=newNode.next;
		 }
		 return head.next;
		 
	 }
	

}
