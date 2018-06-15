package zhao.gong.zuo;

import com.sun.javafx.geom.AreaOp.AddOp;

/**
*日期：2018年3月12日 下午7:29:25
*@author 龙
*哦吼吼：Test1
*描述：测试形参
**/
public class Test1 {
	 String str = new String("hello");
	 char[] ch = {'a', 'b', 'c'};
	
	public void fun(String str, char ch[]) {
		str = "world";
		ch[0] = 'e';
	}
	
	//Java的缓存机制
	public void add(int i) {
		i++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 test1 = new Test1();
		test1.fun(test1.str, test1.ch);
		
		System.out.print(test1.str + " and ");
		System.out.println(test1.ch);
		
		//测试缓存机制；
		int i = 0;
		i = i++;
		test1.add(i);
		System.out.println("缓存机制测试结果："+i);
		
		//引用传递
		String xString = "7";
		int x =1;
		int y = 2;
		System.out.println(xString + x + y);
	}

}
