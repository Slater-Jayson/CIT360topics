package clientSocket;

import java.net.*;
import java.io.*;



public class Server {
	public static void main(String[] args) {
		
		try{
			
			ServerSocket serverS = new ServerSocket(9999);
			Socket s = serverS.accept();
			
			DataInputStream dstreamin = new DataInputStream(s.getInputStream());
			DataOutputStream dstreamout = new DataOutputStream(s.getOutputStream());
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			
			String receive="",send="";
			
			while(!receive.equals("end")){
				receive = dstreamin.readUTF();
				
				System.out.println(receive);;
				
				send = buffer.readLine();
				dstreamout.writeUTF(send);;
				dstreamout.flush();
				}
			s.close();
			
		}
		catch(Exception x){
			
		}
	}
}