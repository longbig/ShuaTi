package java1.study;

import java.net.InetAddress;

/**
*日期：2018年4月30日 上午10:33:17
*@author 龙
*哦吼吼：Network1
*描述：网络编程1，测试InetAddress类
**/
public class Network1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InetAddress localAddress = InetAddress.getLocalHost();
		InetAddress remoteAddress = InetAddress.getByName("www.baidu.com");
		
		System.out.println("本机的IP地址：" + localAddress.getHostAddress());
		System.out.println("远程的IP地址：" + remoteAddress.getHostAddress());
		System.out.println("3秒是否可达？ " + remoteAddress.isReachable(3000));
		System.out.println("远程的主机名：" + remoteAddress.getHostName());
		
		
	}

}
