/**
 * 
 */
package com.xtel.multithread;

/**
 * @author TUAN
 *
 */
public class Thread2 extends Thread{

	ShareData shareData;

	public Thread2(ShareData shareData) {
		this.shareData = shareData;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (shareData) {
				try {
					shareData.notifyAll();
					shareData.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				int rad = shareData.getRad();
				rad *= rad;
				System.out.println(String.format("PT: %s", rad));
			}
		}
		
		synchronized (shareData) {
			shareData.notifyAll();
		}
	}
}
