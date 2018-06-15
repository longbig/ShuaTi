package java1.study;

import java.util.ArrayList;
import java.util.List;

/**
*日期：2018年3月28日 下午9:22:54
*@author 龙
*哦吼吼：ListErr
*描述：
**/
public class ListErr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List strList = new ArrayList();
		strList.add("111");
		strList.add("222");
		strList.add(1);
		strList.forEach(str -> System.out.println(((String)str).length()));
	}

}
