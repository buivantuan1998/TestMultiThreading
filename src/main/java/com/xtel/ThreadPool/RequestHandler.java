/**
 * 
 */
package com.xtel.ThreadPool;

import org.apache.log4j.Logger;

/**
 * @author TUAN
 *
 */
public class RequestHandler implements Runnable{

	Logger logger = Logger.getLogger(RequestHandler.class);
	
	private String name;
	
	public RequestHandler(String name) {
		super();
		this.name = name;
	}

	public void run() {
		try {
			System.out.println(String.format(" %s Startting process %s ", Thread.currentThread().getName(), name));
			Thread.sleep(500);
			System.out.println(String.format(" %s Finished process %s ", Thread.currentThread().getName(), name));
		} catch (InterruptedException e) {
			logger.error("Error: "+e.getMessage());
			logger.error("e.printStackTrace(): ");
			e.printStackTrace();
		}catch (Exception e) {
			logger.error("e.printStackTrace(): ");
			e.printStackTrace();
		}
	}

}
