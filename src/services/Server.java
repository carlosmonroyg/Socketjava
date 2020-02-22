package services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Server extends Connection {

	public Server( ) throws IOException {
		super("Server");
		// TODO Auto-generated constructor stub
	}

	
	public void onServer() {
		System.out.println("Server running...");
		
		try {
			s = ss.accept();
			System.out.println("Client online...");
			
			outputClient = new DataOutputStream(s.getOutputStream());
			outputClient.writeUTF("petition received");
			BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while ((message = input.readLine())!= null){
				
				System.out.println("menssage...");
				
			}
			
			System.out.println("cliente offline...");
			
			ss.close();
			System.out.println("server stop....");
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
