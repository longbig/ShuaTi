package java1.study;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
*日期：2018年5月4日 下午8:27:52
*@author 龙
*哦吼吼：TCPfile_server
*描述：
**/
public class TCPfile_client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Socket socket = new Socket("127.0.0.1", 10001);
		OutputStream out = socket.getOutputStream();
		//创建文件输入对象
		FileInputStream fis = new FileInputStream("D:\\1.txt");
		byte[] buf = new byte[1024];
		int len;
		while((len = fis.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		socket.shutdownOutput();
		InputStream in = socket.getInputStream();
		byte[] bufMsg = new byte[1024];
		int num = in.read(bufMsg);
		String Msg = new String(bufMsg, 0, num);
		System.out.println(Msg);
		fis.close();
		socket.close();
		
	}

}
