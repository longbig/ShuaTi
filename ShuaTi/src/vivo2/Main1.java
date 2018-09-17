package vivo2;

import java.util.List;

/**
 * @date 2018年9月13日 下午6:49:40
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parent pp = new Son();
		
		List<Object> objects;
		List<String> strings;

		Parent pp1 = new Son();
		System.out.println(pp1.age);
		pp1.fun();
	}

}

class Parent{
	public int age = 1;
	static {
		System.out.println("static Parent");
	}
	
	{
		System.out.println("fei static Parent");
	}
	
	public Parent() {
		System.out.println("Parent");
	}
	public void fun() {
		System.out.println("fun()Parent");
	}
}

class Son extends Parent{
	public int age = 0;
	static {
		System.out.println("static son");
	}
	{
		System.out.println("fei static son");
	}
	public Son() {
		System.out.println("Son");
	}
	public void fun() {
		System.out.println("fun()Son");
	}
}