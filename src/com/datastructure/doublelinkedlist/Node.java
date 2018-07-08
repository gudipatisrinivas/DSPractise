package com.datastructure.doublelinkedlist;

public class Node<T> {
	public T obj;
	public Node<T> next;
	public Node<T> previous;
	
	public Node(T obj, Node<T> next, Node<T> previous) {
		super();
		this.obj = obj;
		this.next = next;
		this.previous = previous;
	}
	/**
	 * @return the previous
	 */
	public Node<T> getPrevious() {
		return previous;
	}
	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	public Node(T obj, Node<T> next) {
		super();
		this.obj = obj;
		this.next = next;
	}
	/**
	 * @return the obj
	 */
	public T getObj() {
		return obj;
	}
	/**
	 * @param obj the obj to set
	 */
	public void setObj(T obj) {
		this.obj = obj;
	}
	/**
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}
	

}
