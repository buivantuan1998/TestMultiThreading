/**
 * 
 */
package com.xtel.synchronous.static_synchronized_method;

/**
 * @author TUAN
 *
 */
public class ShareData {
	public synchronized void outputData(String threadName) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(String.format("%s : %s", threadName,i));
		}
	}
}
