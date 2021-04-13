package com.beginnerjava8.multithreading;

public class MultithreadExample {
	
	public static void main(String[] args) {
		 int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	        	ThreadExample object = new ThreadExample();
	            object.start();
	          
	        }
	}

}

class ThreadExample extends Thread{
	
	 public void run(){
	        try {
	            // Displaying the thread that is running
	            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
	        }
	        catch (Exception e) {
	            // Throwing an exception
	            System.out.println("Exception is caught");
	        }
	    }
	
}
