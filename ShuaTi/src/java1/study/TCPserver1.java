package java1.study;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
*日期：2018年4月30日 上午11:51:01
*@author 龙
*哦吼吼：TCPclient
*描述：
**/
public class TCPserver1 {
	
	private static final int PORT = 9994;
	//定义一个listen方法
	public static void listen() throws Exception{
		ServerSocket serverSocket = new ServerSocket(PORT);
		//accept()方法接受数据
		Socket client = serverSocket.accept();
		OutputStream os = client.getOutputStream();
		System.out.println("开始与客户端交互数据");
		os.write("miniFish ^-^!!!".getBytes());
		Thread.sleep(5000);
		System.out.println("结束tongxin");
		os.close();
		client.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		listen();
		
	}

}
