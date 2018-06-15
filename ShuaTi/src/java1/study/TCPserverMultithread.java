package java1.study;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
*日期：2018年5月4日 下午8:09:06
*@author 龙
*哦吼吼：TCPserverMultithread
*描述：tcp多线程通信
**/
public class TCPserverMultithread {

	private static final int PORT = 9998;
	public static void listen() throws Exception{
		//创建服务端的Socket对象
		ServerSocket serverSocket = new ServerSocket(PORT);
		//使用while循环接受客户端的发送请求
		while(true) {
			final Socket client = serverSocket.accept();
			//开启新线程
			new Thread() {
				public void run() {
					OutputStream os;
					try {
						os = client.getOutputStream();
						System.out.println("开始与客户端通信。。。");
						os.write("hello *^-^*!!!".getBytes());
						Thread.sleep(5000);
						System.out.println("结束通信");
						os.close();
						client.close();
						
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				};
			}.start();
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		listen();
	}
	
}
