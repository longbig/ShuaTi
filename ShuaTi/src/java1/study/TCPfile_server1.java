package java1.study;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
*日期：2018年5月4日 下午8:28:08
*@author 龙
*哦吼吼：TCPfile_client
*描述：文件上传的服务端
**/
public class TCPfile_server1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(10001);
		while(true) {
			Socket s = serverSocket.accept();
			new Thread(new ServerThread(s)).start();
		}
	}

}

class ServerThread implements Runnable{
	
	private Socket socket;
	public ServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String ip = socket.getInetAddress().getHostAddress();
		int count= 1;
		try {
			InputStream in = socket.getInputStream();
			File parentFile = new File("F:\\upload\\");
			if(!parentFile.exists()) {
				parentFile.mkdir();
			}
			File file = new File(parentFile, ip+"(" + count + ").jpg");
			while(file.exists()) {
				file = new File(parentFile, ip + "(" + (count++) + ").jpg");
				
			}
			//创建文件输出对象
			FileOutputStream fos = new FileOutputStream(file);
			byte[] buf= new byte[1024];
			int len = 0;
			while((len = in.read(buf)) != -1) {
				fos.write(buf, 0, len);
			}
			OutputStream out = socket.getOutputStream();
			out.write("上传成功！".getBytes());
			fos.close();
			socket.close();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
	
}
