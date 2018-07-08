package com.datastructure.doublelinkedlist;

public class DoubleLinkedListImpl<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll=new LinkedList();
		ll.add("Srinivas");
		ll.add("Satya");
		ll.add("Sankar");
		ll.add("Mounika");
		ll.display();
		System.out.println("***********Adding First *******");
		ll.addFirst("Devika");
		ll.display();
		System.out.println("***********Getting 3 *******");
		System.out.println("3=="+ll.get(3));
		ll.display();
		System.out.println("***********Remove 2 *******");
		System.out.println(ll.remove(2));
		ll.display();
		
	}

}
