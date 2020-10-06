/**
 * 
 */
package com.xtel.synchronous.synchronized_block;

/**
 * @author TUAN
 *
 */
public class Thread1 extends Thread {

	private ShareData shareData;
	private String threadName;
	
	public Thread1(ShareData shareData, String threadName) {
		this.shareData = shareData;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		shareData.outputData(threadName);
	}
}
