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

	
	public void onServer() {
		System.out.println("Server> waiting...");
		
		try {
			System.out.println("Server> client online...");
			s = ss.accept();
			System.out.println("Server> client online...");
			
			outputClient = new DataOutputStream(s.getOutputStream());
			outputClient.writeUTF("petition received");
			//BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//while ((message = input.readLine())!= null){
				
				System.out.println("client> "+ message);
				
			
			
			System.out.println("cliente offline...");
			//crear un while para que atienda mas de un cliente 
			/*while(true) { // ???              
			      System.out.println("Esperando..."); // Esperando conexión
			      Socket cs = ss.accept();
			      int client= 0;
				  client++;
			      System.out.println("Cliente " + outputClient + " en línea");

			      StarCliente hilo = new StarCliente(cs);
			      hilo.start();
			      System.out.println("clientes atendidos:"+hilo.clientesAtendidos());
			      System.out.println("hilos de clientes activos:"+hilo.hilosActivos());
			  }*/
			
			//todos los clientes se atienden al timpo tienen que tener hilos en la clase server 
		ss.close();
		System.out.println("server stop....");
			
		} catch (IOException e) {
			
			System.out.println("SERVER>"+e.getMessage());
		}
	}
}
