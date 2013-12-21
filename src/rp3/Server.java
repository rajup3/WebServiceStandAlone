package rp3;

import javax.xml.ws.Endpoint;

import rp3.service.mdm.MDMImpl;


public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Endpoint.publish("http://localhost:9898/MDM", new MDMImpl());
		
		System.out.println(" MDM server is ready!");
	}
}
