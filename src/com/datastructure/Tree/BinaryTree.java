package com.datastructure.Tree;

public class BinaryTree {

	Node root;

	public void add(int key, String name) {

		Node newNode = new Node(name, key);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftNode;
					if (focusNode == null) {
						parent.leftNode = newNode;
						return;
					}

				} else {
					focusNode = focusNode.rightNode;
					if (focusNode == null) {
						parent.rightNode = newNode;
						return;
					}

				}

			}

		}

	}

	

	private void inOrderTraverseTree(Node root2) {
		// TODO Auto-generated method stub
		Node focusNode = root2;
		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftNode);
			System.out.println("In Order" + root2.toString());
			inOrderTraverseTree(focusNode.rightNode);
		}

	}

	private void preOrderTraverseTree(Node root2) {
		// TODO Auto-generated method stub
		Node focusNode = root2;
		if (focusNode != null) {
			System.out.println("Pre Order" + focusNode.toString());
			preOrderTraverseTree(focusNode.leftNode);

			preOrderTraverseTree(focusNode.rightNode);
		}

	}

	private void postOrderTraverseTree(Node root2) {
		// TODO Auto-generated method stub
		Node focusNode = root2;
		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftNode);

			postOrderTraverseTree(focusNode.rightNode);
			System.out.println("post order" + focusNode.toString());
		}

	}

	int countLeaves(Node node) {
		// Return the number of leaves in the tree to which node points.
		if (node == null)
			return 0; // An empty tree has no leaves.
		else if (node.leftNode == null && node.rightNode == null) {
			System.out.println("Node" + node.toString());
			return 1; // Node is a leaf.
		} else {
			return countLeaves(node.leftNode) + countLeaves(node.rightNode);
		}
	}
	
	int maxDepth(Node node) { 
		int result=0;   
		if (node == null) {
		     return (0);
		   } 
		   else {
		 // compute the depth of each subtree
		 int lDepth = maxDepth(node.leftNode); 
		int rDepth = maxDepth(node.rightNode); 
		// use the larger one 
		if (lDepth > rDepth)
		   result= (lDepth + 1); 
		else 
		   result=(rDepth + 1); 
		   }
		return result;
		 }
	
	private void mirror(Node node) {
		  if (node != null) {
			// do the sub-trees
			mirror(node.leftNode);
			mirror(node.rightNode);
			// swap the left/right pointers
			Node temp = node.leftNode;
			node.leftNode = node.rightNode;
			node.rightNode = temp;
		  }
		}


	
	public static void main(String[] s) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.add(50, "Srinivas");
		binaryTree.add(30, "Satya");
		binaryTree.add(40, "Sriya");
		binaryTree.add(20, "Mounika");
		binaryTree.add(80, "Devika");
		binaryTree.add(10, "Padma");
		System.out.println("***********Inorder ********");
		binaryTree.inOrderTraverseTree(binaryTree.root);
		System.out.println("***********Pre Order ********");
		binaryTree.preOrderTraverseTree(binaryTree.root);
		System.out.println("***********Post Order ********");
		binaryTree.postOrderTraverseTree(binaryTree.root);
		System.out.println("***********Max Dept ********");
		System.out.println(binaryTree.maxDepth(binaryTree.root));
		System.out.println("***********Count Leaves********");
		System.out.println(binaryTree.countLeaves(binaryTree.root));
		System.out.println("***********Dept ********");
		System.out.println("Max Depth=" + binaryTree.maxDepth(binaryTree.root));
		System.out.println("*********** Before Mirror ********");
		binaryTree.preOrderTraverseTree(binaryTree.root);
		binaryTree.mirror(binaryTree.root);
		System.out.println("*********** After Mirror ********");
		
		binaryTree.preOrderTraverseTree(binaryTree.root);
	}

}

class Node{
	 String name;
	 int key;
	 Node leftNode;
	 Node rightNode;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return key;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.key = value;
	}
	public Node(String name, int value) {
		super();
		this.name = name;
		this.key = value;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nodel [name=" + name + ", key=" + key + "]";
	}


}
