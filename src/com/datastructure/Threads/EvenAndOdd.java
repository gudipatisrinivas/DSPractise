package com.datastructure.Threads;

public class EvenAndOdd {

	Object lock = new Object();

	class Even1 implements Runnable {

		@Override
		public synchronized void run() {
			synchronized (lock) {
				for (int i = 0; i < 20; i++) {
					if (i % 2 == 0) {
						System.out.println("This i from the Thread"+Thread.currentThread()+"Value="+i);
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					} else {

						lock.notifyAll();
					}
				}
			}
		}

	}

	class Odd implements Runnable {
		@Override
		public void run() {
			synchronized (lock) {
				for (int i = 1; i < 20; i++) {
					if (i % 2 == 1) {
						System.out.println("This i from the Thread"+Thread.currentThread()+"Value="+i);
						lock.notify();
						try {
							lock.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Odd1 even1 = new Odd1();
		EvenAndOdd evenAndOdd=new EvenAndOdd();
		EvenAndOdd.Odd odd = evenAndOdd.new Odd();
		EvenAndOdd.Even1 even1=evenAndOdd.new Even1();
		Thread evenThread = new Thread(even1);
		evenThread.setName("Even");
		Thread oddThread = new Thread(odd);
		oddThread.setName("Odd");
		evenThread.start();
		oddThread.start();
		

	}
}
