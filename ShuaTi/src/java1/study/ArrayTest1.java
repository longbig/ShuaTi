package java1.study;

import java.lang.reflect.Array;

/**
*日期：2018年4月11日 下午4:17:58
*@author 龙
*哦吼吼：ArrayTest1
*描述：通过反射创建数组，操作数组
**/
public class ArrayTest1 {
	public static void main(String[] args) {
		try {
			Object arr = Array.newInstance(String.class, 10);
			Array.set(arr, 5, "java");
			Array.set(arr, 6, "longlong");
			
			Object o1 = Array.get(arr, 5);
			Object o2 = Array.get(arr, 6);
			System.out.println(o1);
			System.out.println(o2);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	
	}
}
