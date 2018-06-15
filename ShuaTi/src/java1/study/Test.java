package java1.study;

import java.util.*;

/**
*日期：2018年3月29日 下午2:47:01
*@author 龙
*哦吼吼：Test
*描述：
**/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] aa = new Integer[5];
		Number[] bb = aa;
		bb[0] = 0.5;
	}
	
	//类型通配符
	@org.junit.Test
	public void test(List<?> c) {
		for(int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
	}
	
}
