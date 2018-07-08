package com.datastructure.Tree;

public class BinaryTreeClass {
	
	Nodel root;
	

	
	public void add(int key, String name) {

		Nodel newNode = new Nodel(name, key);

		if (root == null) {
			root = newNode;
		} else {
			Nodel focusNode = root;
			Nodel parent ;
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
	
	public static void main(String[] s) {
		BinaryTreeClass binaryTree=new BinaryTreeClass();
		binaryTree.add(50, "Srinivas");
		binaryTree.add(10, "Satya");
		binaryTree.add(20, "Mounika");
		binaryTree.add(80, "Devika");
		binaryTree.add(20, "Padma");
		binaryTree.inOrderTraverseTree(binaryTree.root);
		binaryTree.preOrderTraverseTree(binaryTree.root);
		binaryTree.postOrderTraverseTree(binaryTree.root);
	}

	private void inOrderTraverseTree(Nodel root2) {
		// TODO Auto-generated method stub
		Nodel focusNode=root2;
		if(focusNode!=null) {
			inOrderTraverseTree(root2.leftNode);
			System.out.println("In Order"+root2.toString());
			inOrderTraverseTree(root2.rightNode);
		}
		
	}
	
	private void preOrderTraverseTree(Nodel root2) {
		// TODO Auto-generated method stub
		Nodel focusNode=root2;
		if(focusNode!=null) {
			System.out.println("Pre Order"+focusNode.toString());
			inOrderTraverseTree(focusNode.leftNode);
			
			inOrderTraverseTree(root2.rightNode);
		}
		
	}
	
	private void postOrderTraverseTree(Nodel root2) {
		// TODO Auto-generated method stub
		Nodel focusNode=root2;
		if(focusNode!=null) {
			
			inOrderTraverseTree(focusNode.leftNode);
			
			inOrderTraverseTree(focusNode.rightNode);
			System.out.println("post order"+focusNode.toString());
		}
		
	}

}

class Nodel{
	 String name;
	 int key;
	 Nodel leftNode;
	 Nodel rightNode;
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
	public Nodel(String name, int value) {
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
