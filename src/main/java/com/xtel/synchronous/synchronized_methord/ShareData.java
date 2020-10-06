/**
 * 
 */
package com.xtel.synchronous.synchronized_methord;

/**
 * @author TUAN
 *
 */
public class ShareData {

	public static synchronized void outputData(String threadName) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(String.format("%s : %s", threadName, i));
		}
	}
}
