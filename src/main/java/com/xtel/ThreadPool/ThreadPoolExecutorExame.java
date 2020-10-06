/**
 * 
 */
package com.xtel.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author TUAN
 *
 */
public class ThreadPoolExecutorExame {

	public static void main(String[] args) throws Exception {
		int corePoolSize = 5;
		int maximumPoolSize = 10;
		int queueCapacity = 100;

		ThreadPoolExecutor excutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, 10, TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(queueCapacity));
		
		for (int i = 0; i < 1000; i++) {
			excutor.execute(new RequestHandler("Request-" + i));
			Thread.sleep(50);
		}
		excutor.shutdown();
		
		while (!excutor.isTerminated()) {
			
		}
		
	}

}
