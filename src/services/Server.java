package services;

import java.io.BufferedReader;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//import StarCliente;

public class Server extends Connection {

	public Server( ) throws IOException {
		super("Server");
		
	}

	
	public void onServer() throws ClassNotFoundException {
		
		
		try {
			
			while (true) {
				System.out.println("Server> waiting...");
				
				s = ss.accept();
			System.out.println("Server> client online...");
			
			System.out.println("Server> client online...");
			
			outputClient = new DataOutputStream(s.getOutputStream());
			outputClient.writeUTF("petition received");
			BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while ((message = input.readLine())!= null){
				
				System.out.println("client> "+ message);
				
			
			
			System.out.println("cliente offline...");
			
			}
			
		
		System.out.println("server stop....");
			}
			
			} catch (IOException e) {
			
			System.out.println("SERVER>"+e.getMessage());
		}
	}
}

