package com.datastructure.doublelinkedlist;

public class  LinkedList<T> {

	Node<T> next;
	Node<T> first;
	Node<T> previous;

	public void add(T element) {
		Node<T> node;
		if (next == null) {
			node = new Node<T>(element, null,null);
			next = node;
			first=node;
			previous=node;
		} else {
			node = new Node<T>(element, null,next);
			next.setNext(node);
			next=node;
		}

	}

	public void addFirst(T element) {
		Node<T> firstElement=new Node<T>(element,null,null);
		firstElement.setNext(first);
		first=firstElement;
	}

	public void addLast(T element) {
		add(element);

	}

	public T get(int index) {
		int counter = 1;
		T result = null;
		Node<T> iterator = first;
		while (iterator.getNext() != null && counter != index) {
			iterator = iterator.getNext();
			counter++;
		}
		if (iterator.getNext() != null) {
			result = iterator.getObj();
		}
		return result;
	}

	public int size() {
		return 0;
	}

	public boolean remove(int index) {
		Node<T> current = first;
		Node<T> previous=null;
		
		boolean result = false;
		int counter = 0;
		while (current.getNext() != null && (counter) != index) {
			counter++;
			current = current.getNext();
			previous=current;
		}
		if ((counter) == index) {
			
			current = current.getNext();
			previous.setNext(current);
			result = true;
		}
		return result;
	}
	
	public void display() {
		Node<T> iterator=first;
		while(iterator!=null) {
			System.out.println(iterator.getObj());
			iterator=iterator.getNext();
		}
		
		
	}

}
