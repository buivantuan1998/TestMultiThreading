/**
 * 
 */
package com.xtel.multithread;

import java.util.Random;

/**
 * @author TUAN
 *
 */
public class Thread1 extends Thread {
	
	ShareData shareData;
	
	public Thread1(ShareData shareData) {
		this.shareData = shareData;
	}

	@Override
	public void run() {
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			synchronized (shareData) {
				int rad = random.nextInt(10) + 1;
				shareData.setRad(rad);
				System.out.println(String.format("Rad: %s", rad));
				
				//Wait => thread2 run
				shareData.notifyAll();
				try {
					shareData.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		}
	}

}
