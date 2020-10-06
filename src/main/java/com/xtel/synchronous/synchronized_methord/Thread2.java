/**
 * 
 */
package com.xtel.synchronous.synchronized_methord;

/**
 * @author TUAN
 *
 */
public class Thread2 extends Thread{

	private ShareData shareData;
	private String threadName;
	
	public Thread2(ShareData shareData, String threadName) {
		this.shareData = shareData;
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		shareData.outputData(threadName);
	}
	
}
