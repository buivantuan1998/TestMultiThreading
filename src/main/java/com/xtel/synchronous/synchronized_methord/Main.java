/**
 * 
 */
package com.xtel.synchronous.synchronized_methord;

/**
 * @author admin
 *
 */
public class Main {

	public static void main(String[] args) {
		
		ShareData shareData = new ShareData();
		
		Thread2 thread1 = new Thread2(shareData, "Thread1");
		Thread2 thraed2 = new Thread2(shareData, "Thread2");
		Thread2 thread3 = new Thread2(shareData, "Thread3");
		
		thread1.start();
		thraed2.start();
		thread3.start();
	}

}
