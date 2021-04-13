package com.beginnerjava8.multithreading;

class MultithreadingDemo implements Runnable {
	    public void run() {
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
	 
	// Main Class
	public	class RunnableExample {
	    public static void main(String[] args){
	        int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	            Thread object = new Thread(new MultithreadingDemo());
	            object.start();
	        }
	    }
}
