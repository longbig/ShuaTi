package java1.study;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
*日期：2018年4月30日 上午11:18:19
*@author 龙
*哦吼吼：UDPserver
*描述：
**/
public class UDPserver {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DatagramSocket ds = new DatagramSocket(9993);
		String ss = "super brain";
		/**
		 * 创建要发送的数据包
		 * 有数据，数据长度，接收端IP地址，端口号
		 */
		DatagramPacket dp = new DatagramPacket(ss.getBytes(),
				ss.length(), InetAddress.getByName("localhost"),9999);
		System.out.println("now, we will send a package");
		ds.send(dp);
		ds.close();
		
	}

}
