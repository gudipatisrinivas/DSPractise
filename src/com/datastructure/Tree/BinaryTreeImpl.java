package com.datastructure.Tree;

public class BinaryTreeImpl {

	Nodes root;

	public void add(int key, String name) {

		Nodes newNode = new Nodes(key, name);
		if (root == null) {
			root = newNode;
		} else {
			Nodes focusNode = root;
			Nodes parent;
			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	void inOrderTraverseTree(Nodes focusNode) {
		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println("FocusNode"+focusNode.toString());
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	int maxDepth(Nodes node) {
		if (node == null) {
			return (0);
		} else {
			// compute the depth of each subtree
			int lDepth = maxDepth(node.leftChild);
			int rDepth = maxDepth(node.rightChild);
			// use the larger one
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}


	public static void main(String[] s) {
		
		BinaryTreeImpl binaryTree=new BinaryTreeImpl();
		binaryTree.add(50, "Srinivas");
		binaryTree.add(10, "Satya");
		binaryTree.add(20, "Mounika");
		binaryTree.add(80, "Devika");
		binaryTree.add(20, "Padma");
		binaryTree.inOrderTraverseTree(binaryTree.root);

	}

}

class Nodes {
	int key;
	String name;
	Nodes leftChild;
	Nodes rightChild;

	public Nodes(int key, String name) {
		super();
		this.key = key;
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nodes [key=" + key + ", name=" + name + "]";
	}

}
