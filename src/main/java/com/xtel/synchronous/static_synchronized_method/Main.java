/**
 * 
 */
package com.xtel.synchronous.static_synchronized_method;

/**
 * @author TUAN
 *
 */
public class Main {

	public static void main(String[] args) {
		
		ShareData sd = new ShareData();
		WorkingThread thread1 = new WorkingThread(sd, "Thread1");
		WorkingThread thread2 = new WorkingThread(sd, "Thread2");
		WorkingThread thread3 = new WorkingThread(sd, "Thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
