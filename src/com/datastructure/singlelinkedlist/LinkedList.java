package com.datastructure.singlelinkedlist;

public class LinkedList<T> {

	Node<T> previous;
	Node<T> first;

	public void add(T element) {
		Node<T> node;
		if (previous == null) {
			node = new Node<T>(element, null);
			previous = node;
			first=node;
		} else {
			node = new Node<T>(element, null);
			previous.setNext(node);
			previous=node;
		}

	}
	
	public void reverse() {
		Node<T> prev = null;
		Node<T> current = first;
		Node<T> next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		first=prev;
		
	}
	public boolean isCyclic(){ 
		Node fast = first; 
		Node slow = first; 
		while(fast!= null && fast.next != null){ 
		fast = fast.next.next; 
		slow = slow.next; 
		//if fast and slow pointers are meeting then LinkedList is cyclic 
		if(fast == slow ){ 
		               return true; 
		} 
		}
		 return false; 
		}

	public void addFirst(T element) {
		Node<T> firstElement=new Node<T>(element,null);
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
