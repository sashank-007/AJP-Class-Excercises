import java.io.*;
import java.net.*;

public class InetDemo{
	public static void main(String[] args){
		try{
			InetAddress ip = InetAddress.getByName("www.google.com");
			System.out.println("Host name is: "+ip.getHostName());
			System.out.println("Host address is: "+ip.getHostAddress());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
