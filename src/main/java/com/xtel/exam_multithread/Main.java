/**
 * 
 */
package com.xtel.exam_multithread;

/**
 * @author admin
 *
 */
public class Main {

	public static void main(String[] args) {
		SinhVien sinhvien = new SinhVien();
		
		Thread1 thread1 = new Thread1(sinhvien);
		Thread2 thread2 = new Thread2(sinhvien);
		
		thread1.start();
		thread2.start();
	}

}
