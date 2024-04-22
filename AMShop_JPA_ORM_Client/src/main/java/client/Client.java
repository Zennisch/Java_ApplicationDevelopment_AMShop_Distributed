package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import service_interface.IService_Message;

public class Client {
	
	private static final String HOST = "REI";
	private static final int PORT = 8080;
	private static final String URL = "rmi://" + HOST + ":" + PORT + "/";
	
	public static void main(String[] args) {
		
		try {
			IService_Message serviceMessage = (IService_Message) Naming.lookup(URL + "serviceMessage");
			
			System.out.println(serviceMessage.sendHello());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
