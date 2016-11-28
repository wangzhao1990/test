package org.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(6789);
		while(true){
			Socket s = ss.accept();	// 阻塞的状态
			InputStream is = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String str = br.readLine();
			System.out.println("客户端说：" + str);
			br.close();
			is.close();
			s.close();
		}
	}
}
