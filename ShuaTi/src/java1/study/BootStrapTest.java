package java1.study;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
*日期：2018年4月11日 下午1:50:13
*@author 龙
*哦吼吼：BootStrapTest
*描述：获取根类加载器的所有url
**/
public class BootStrapTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ClassLoader ss = ClassLoader.getSystemClassLoader();
		System.out.println("系统类加载器：" + ss);
		
		Enumeration<URL> ee = ss.getResources("");
		while(ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}
		ClassLoader sp = ss.getParent();
		System.out.println("系统类的父类是：" + sp);
		
		System.out.println("扩展类加载器的父类：" + sp.getParent());
		
	}

}
