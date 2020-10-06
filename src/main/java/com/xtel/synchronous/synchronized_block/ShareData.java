/**
 * 
 */
package com.xtel.synchronous.synchronized_block;

/**
 * @author TUAN
 *
 */
public class ShareData {
	
	public void outputData(String threadName) {
		synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				System.out.println(String.format("%s : %s", threadName,i));
			}
		}
	}
}
