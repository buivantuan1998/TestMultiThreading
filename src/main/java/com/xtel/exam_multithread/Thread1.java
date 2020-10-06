/**
 * 
 */
package com.xtel.exam_multithread;

/**
 * @author TUAN
 *
 */
public class Thread1 extends Thread {
	SinhVien sinhvien;

	public Thread1(SinhVien sinhvien) {
		this.sinhvien = sinhvien;
	}
	
	@Override
	public void run() {
		 for (int i = 0; i < sinhvien.listNameStudent.length; i++) {
			 synchronized (sinhvien) {
				 
				 sinhvien.notifyAll();
				 
				 try {
					sinhvien.wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				 System.out.println(String.format("User name: %s", sinhvien.listNameStudent[i]));
			}
			
		}
		 synchronized (sinhvien) {
			sinhvien.notifyAll();
		}
	}
	
}
