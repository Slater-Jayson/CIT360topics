package clientSocket;

import java.net.*;
import java.io.*;


public class Client {
	public static void main (String [] args) {
		
		try{
			Socket s = new Socket ("127.0.0.1", 9999);
			DataInputStream dstreamin = new DataInputStream(s.getInputStream());
			DataOutputStream dstreamout = new DataOutputStream(s.getOutputStream());
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String receive="",send="";
			while(!receive.equals("end")){
				send = buffer.readLine();
				dstreamout.writeUTF(send);;
				receive = dstreamin.readUTF();
				
				System.out.println(receive);
			}
			
		}
		catch(Exception x){
			
		}
	}
}

