package services;
import java.io.BufferedReader;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class ServerTheread extends Thread {
	private String message;
	private Socket s;
	private int idClient;
	
	

	public ServerTheread (Socket s , int idCient, int idClient) {
		
		this.s = s;
		this.idClient = idClient;
		
	}

	public void run() {
		try { 
			
				
				BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
				int suma = 0;
				if(idClient == 3) {
					for (int i=0; i<1000000000; i++) {
				    suma ++;
					}
					
				}
			
				while((message = input.readLine()) != null ) {
					System.out.println("clent>"+ message);			
		}
           s.close();
        
		
		
					
			} catch (IOException e) {
					
					System.out.println("SERVER>"+e.getMessage());
				}
			}
		
	
	
	}
	

