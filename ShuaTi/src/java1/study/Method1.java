package java1.study;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/**
*日期：2018年3月29日 下午5:42:11
*@author 龙
*哦吼吼：Method1
*描述：泛型构造器
**/

class Foo{
	public <T> Foo(T t) {
		System.out.println(t);
	}
}

public class Method1<V> implements Callable<V>{
	/*public static void main(String[] args) {
		new Foo("String 测试");
		new Foo(1);
		new Foo(1.11);
		
		new <String> Foo("疯狂Java讲义");
	}*/
	static boolean tt;
	
	public static void main(String[] args) {
	/*	List<Integer> ll = new ArrayList<>();
		ll.add(6);
		List list = ll;
		List<String> ll1 = list;
		System.out.println(ll1.get(0));*/
		
		System.out.println(tt);
	}

	@Override
	public V call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
