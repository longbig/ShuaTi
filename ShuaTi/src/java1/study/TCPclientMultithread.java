package java1.study;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
*日期：2018年4月30日 上午11:51:15
*@author 龙
*哦吼吼：TCPserver
*描述：
**/
public class TCPclientMultithread {
	
	private static final int PORT = 9998;
	
	public static void connect() throws Exception{
		Socket client = new Socket(InetAddress.getLocalHost(), PORT);
		InputStream is = client.getInputStream();
		byte[] buf = new byte[1024];
		int len = is.read(buf);
		System.out.println(new String(buf, 0, len));
		client.close();
		
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		connect();
	}

}
