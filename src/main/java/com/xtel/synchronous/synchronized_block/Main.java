/**
 * 
 */
package com.xtel.synchronous.synchronized_block;

/**
 * @author TUAN
 *
 */
public class Main {

	public static void main(String[] args) {
		
		ShareData shareData = new ShareData();
		Thread1 thread1 = new Thread1(shareData, "Thread1");
		Thread1 thread2 = new Thread1(shareData, "Thread2");
		Thread1 thread3 = new Thread1(shareData, "Thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
