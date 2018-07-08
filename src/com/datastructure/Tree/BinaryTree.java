package com.datastructure.Tree;

public class BinaryTree {

	Node root;

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;

			Node parent;
			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;

					} else {
						focusNode = focusNode.rightChild;
						if (focusNode == null) {
							parent.leftChild = newNode;
							return;
						}
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node {
	int key;
	String name;
	Node leftChild;
	Node rightChild;

	public Node(int key, String name) {
		super();
		this.key = key;
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [key=" + key + ", name=" + name + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}

}
