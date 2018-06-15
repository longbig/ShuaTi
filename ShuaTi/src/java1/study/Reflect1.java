package java1.study;

import java.lang.reflect.Constructor;

/**
*日期：2018年4月11日 下午3:29:11
*@author 龙
*哦吼吼：Reflect1
*描述：
**/
public class Reflect1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("javax.swing.JFrame");
		//获取带一个字符串的构造器
		Constructor cst = clazz.getConstructor(String.class);
		Object object = cst.newInstance("测试窗口");
		System.out.println(object);
	}

}
