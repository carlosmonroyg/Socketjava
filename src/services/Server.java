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
		System.out.println("Server> waiting...");
		
		try {
			System.out.println("Server> client online...");
			s = ss.accept();
			System.out.println("Server> client online...");
			
			outputClient = new DataOutputStream(s.getOutputStream());
			outputClient.writeUTF("petition received");
			BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while ((message = input.readLine())!= null){
				
				System.out.println("client> "+ message);
				
			}
			
			System.out.println("cliente offline...");
			//crear un while para que atienda mas de un cliente 
			//todos los clientes se atienden al timpo tienen que tener holos en la clase server 
			//ss.close();
			System.out.println("server stop....");
			
		} catch (IOException e) {
			
			System.out.println("SERVER>"+e.getMessage());
		}
	}
}
