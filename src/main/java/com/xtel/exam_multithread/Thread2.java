/**
 * 
 */
package com.xtel.exam_multithread;

/**
 * @author TUAN
 *
 */
public class Thread2 extends Thread {
	SinhVien sinhvien;

	public Thread2(SinhVien sinhvien) {
		this.sinhvien = sinhvien;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < sinhvien.listAddress.length; i++) {
			synchronized (sinhvien) {
				sinhvien.notifyAll();
				
				try {
					sinhvien.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(String.format("Address: %s", sinhvien.listAddress[i]));
			}
			
		}
//		synchronized (sinhvien) {
//			sinhvien.notifyAll();
//		}
	}
}
