/**
 * 
 */
package com.xtel.synchronous.static_synchronized_method;

/**
 * @author TUAN
 *
 */
public class WorkingThread extends Thread {
	
	private ShareData shareData;
	private String threadName;
	
	
	public WorkingThread(ShareData shareData, String threadName) {
		this.shareData = shareData;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		shareData.outputData(threadName);
	}
}
