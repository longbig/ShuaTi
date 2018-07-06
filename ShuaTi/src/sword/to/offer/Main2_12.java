package sword.to.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
*日期：2018年7月3日 下午4:26:30
*@author 龙
*哦吼吼：Main2_12
*描述：第2页第12题
*题目描述
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，
则打印出这三个数字能排成的最小数字为
321323。

**/
public class Main2_12 {
	
    public String PrintMinNumber(int [] numbers) {
    	int i, count = numbers.length;
    	String result = "";
    	List<Integer> list = new ArrayList();
    	for(i = 0; i < count; i++) {
    		list.add(numbers[i]);
    	}
    	//排序
    	Collections.sort(list, new Comparator<Integer>() {
    		@Override
			public int compare(Integer s1, Integer s2) {
				// TODO Auto-generated method stub
				String ss1 = s1+""+s2;
				String ss2 = s2+""+s1;
				return ss1.compareTo(ss2);
			}
		});
    	
    	for (Integer ll : list) {
			result += ll;
		}
    	return result;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {123,34535,5675,54,8,0,878,545,84,454,};
		String ss = new Main2_12().PrintMinNumber(numbers);
		System.out.println(ss);
	}
	


}
