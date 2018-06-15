package java1.study;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
*日期：2018年4月30日 上午11:09:47
*@author 龙
*哦吼吼：UDPnet
*描述：UDP网络编程；这是一个接受端；
**/
public class UDPclient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		byte[] buf = new byte[1024];
		//定义UDP的socket对象，即DatagramSocket,端口号为9999
		DatagramSocket ds = new DatagramSocket(9999);
		//定义数据包对象，用于接收数据
		DatagramPacket dp = new DatagramPacket(buf, 1024);
		System.out.println("wait for message");
		ds.receive(dp);
		//调用方法获得接受到的信息，包括数据内容、IP地址、端口号；
		String string = new String(dp.getData(), 0, dp.getLength()) + 
				" from " + dp.getAddress().getHostAddress() + ":" + dp.getPort();
		System.out.println(string);
		ds.close();
 	}

}
