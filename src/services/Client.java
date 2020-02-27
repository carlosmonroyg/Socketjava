package services;

import java.io.DataOutputStream;

import java.io.IOException;


public class Client extends Connection
{

	public Client() throws IOException {
		super("Client");
		
	}
	public void onClient() {
		System.out.println("cient running...");
		try {
		outputServer = new DataOutputStream(s.getOutputStream());
		System.out.println("cient> sending data to server...");
		for(int i =0; i < 2; i++)
		{
			
			outputServer.writeUTF("Este es el mansage del cliente carlos numero " + (i+1) + "\n");
		}
		System.out.println("cient> data sent...");
		
		//outputServer.writeUTF("Este es un mensaje para el servidor del cliente carlos ");
		outputServer.flush();
		s.close();
		System.out.println("cient> Stop...");
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}

}
}