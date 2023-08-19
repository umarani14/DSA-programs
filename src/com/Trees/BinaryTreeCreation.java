package com.Trees;

public class BinaryTreeCreation{

	TreeNode root=null;
	TreeNode left=null;
	TreeNode right=null;
	public static void main(String[] args) {
		BinaryTreeCreation bt=new BinaryTreeCreation();
		 	bt.add(6);
		    bt.add(4);
		    bt.add(8);
		    bt.add(3);
		    bt.add(5);
		    bt.add(7);
		    bt.add(9);
	}
	void add(int value) {
		root=addNode(root, value);	
		System.out.println("root is "+ root.val);
		
		System.out.println(searchElement(root, 10));
		
		int depth=maxDepth(root);
		System.out.println("depth is -- "+ depth);
		inOrderPrintElements(root);
	}
	TreeNode addNode(TreeNode root,int value) {
		if(root==null) {
			return new TreeNode(value);
		}
		if(value<root.val) {
			root.left=addNode(root.left,value);
			System.out.println("left "+ root.left.val);
		}else if( value> root.val) {
			root.right=addNode(root.right,value);
			System.out.println(" right is "+ root.right.val);
		}else {
			return root;
		}
		return root;
	}
	
	boolean searchElement(TreeNode node,int value) {
		if(node==null) {
			return false;
		}
		 if(value==node.val) {
			return true;
		}
		
		else if(value<root.val) {
			boolean found = searchElement(node.left, value);
			if(found) {
				TreeNode deleteNode = node.left;
				node.left = null;
//				addNode(node, deleteNode.left);
//				addNode(node, deleteNode.right);
				
			}
		}
		else if(value>root.val) {
			return searchElement(node.right, value);
		}
//		return false;
		
		return value<root.val ? searchElement(node.left, value) : searchElement(node.right, value);
		
	}
	
	  public int maxDepth(TreeNode root) {
          
	       if(root==null){
	           return 0;
	       }
	      int left=maxDepth(root.left);
	      int right=maxDepth(root.right);
	      return Math.max(left,right)+1;

	    }
	  
	  // inorder elements
	  public void inOrderPrintElements(TreeNode root) {
		  if(root==null) {
			  return;
		  }
		  inOrderPrintElements(root.left);
		  System.out.println(root.val);
		  inOrderPrintElements(root.right);
	  }
	  
	  public void preOrderPrintElements(TreeNode root) {
		  if(root==null) {
			  return;
		  }
		  System.out.println(root.val);
		  inOrderPrintElements(root.left);
		  inOrderPrintElements(root.right);
		  
	  }
	  public void postOrderPrintElements(TreeNode root) {
		  if(root==null) {
			  return;
		  }
		  inOrderPrintElements(root.left);
		  inOrderPrintElements(root.right);
		  System.out.println(root.val);
	  }
	  
	

}
