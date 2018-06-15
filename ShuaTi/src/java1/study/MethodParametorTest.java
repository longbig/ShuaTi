package java1.study;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

/**
*日期：2018年4月11日 下午2:59:30
*@author 龙
*哦吼吼：MethodParametorTest
*描述：测试方法的形参
**/
class Test12{
	public void replace(String str, List<String> list) {}
}


public class MethodParametorTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class<Test12> tt = Test12.class;
		Method re = tt.getMethod("replace", String.class,List.class);
		System.out.println("replace 的参数个数是：" + re.getParameterCount());
		Parameter[] pps = re.getParameters();
		int index = 1;
		for (Parameter parameter : pps) {
			if(parameter.isNamePresent()) {
				System.out.println("the " + index++ + "个参数是。。。");
				System.out.println("名：" + parameter.getName());
				System.out.println("类型：" + parameter.getType());
				System.out.println("泛型类型：" + parameter.getParameterizedType());
			}
		}
	}

}
