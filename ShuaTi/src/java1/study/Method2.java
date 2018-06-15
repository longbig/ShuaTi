package java1.study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
*日期：2018年3月29日 下午5:25:55
*@author 龙
*哦吼吼：Method
*描述：泛型方法的声明，带T形参；
**/
public class Method2 {

	static <T> void test(Collection<? extends T> from, Collection<T> to) {
		for (T ele : from) {
			to.add(ele);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> ao = new ArrayList<>();
		List<String> as = new ArrayList();
		test(as, ao);
 	}

}
