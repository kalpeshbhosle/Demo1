package chatapplication_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	Socket socket;
	
	BufferedReader br;//to read the input stream
	PrintWriter out;//output stream writing
	
	public Client()
	{
		try {
			
			System.out.println("sending request to the sever");
			socket = new Socket("127.0.0.1",7777);
			System.out.println("connection Done.");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			out = new PrintWriter(socket.getOutputStream());
			
			startReading();
			startWriting();
			
		} catch (Exception e) {
			// TODO: handle exception
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
				 System.out.println("server terminated the  chat");
				 break;
			 }
			 System.out.println("server :"+msg);
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
		System.out.println("This is Client...");
		new Client();

	}

}
