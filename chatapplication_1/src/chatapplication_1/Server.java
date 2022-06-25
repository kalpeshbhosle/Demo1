package chatapplication_1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
	
	ServerSocket server;
	Socket socket;
	BufferedReader br;//to read the input stream
	PrintWriter out;//output stream writing
	
	//constructor
	public Server() {
		try {
			server = new ServerSocket(7777);
			System.out.println("server is ready for connection");
			System.out.println("Wating. . .");
			socket=server.accept(); 
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			out = new PrintWriter(socket.getOutputStream());
			
			startReading();
			startWriting();
			
			

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void startReading()
	{
		Runnable r1 = () ->{//lambda expression
			 System.out.println("Reader started. . .");
			 
			 while(true)
			 {
				 try
				 {
			 String msg = br.readLine();
			 if (msg.equals("exit"))
			 {
				 System.out.println("client terminated the  chat");
				 break;
			 }
			 System.out.println("Client :"+msg);
			 }catch(Exception e)
				 {
				 e.printStackTrace();
				 }
			 }
		};
		new Thread(r1).start();

	}
	
	public void startWriting()
	{
		Runnable r2 = () ->{
			System.out.println("Writer started. . . ");
			while(true)
			{
				try {
					BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
					String content = br.readLine();
					out.println(content);
					out.flush();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		
		new Thread(r2).start();
	}

	public static void main(String[] args) {
		System.out.println("This is a server ... going to start the"+ " Server ");
		new Server();
	}

}
