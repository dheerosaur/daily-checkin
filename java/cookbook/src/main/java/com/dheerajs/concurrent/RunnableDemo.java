package com.dheerajs.concurrent;

class InnerDemo implements Runnable {
	public void run() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("State of thread1 while it called join() on thread2 -"
				+ RunnableDemo.thread1.getState());
			
	}
}

public class RunnableDemo implements Runnable {
	public static Thread thread1;
	public static RunnableDemo obj;
	
	public static void main(String[] args) {
		obj = new RunnableDemo();
		thread1 = new Thread(obj);
		
		System.out.println("State of thread1 after creating it - " + thread1.getState());
		thread1.start();
		
		System.out.println("State of thread1 after calling .start - " + thread1.getState());
	}
	
	public void run () {
		InnerDemo mt = new InnerDemo();
		Thread thread2 = new Thread(mt);

		System.out.println("State of thread2 after creating it - " + thread2.getState());
		thread2.start();
		
		System.out.println("State of thread2 after calling .start - " + thread2.getState());
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("State of thread2 after calling .sleep() - " + thread2.getState());
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("State of thread2 when it has finished - " + thread2.getState());
	}
}
