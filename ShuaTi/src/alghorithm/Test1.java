package alghorithm;

import java.util.HashMap;
import java.util.Hashtable;

public class Test1{
	public static void main(String[] args) {
		int i = -5;
//		System.out.println(Math.round(11));
		
//		String str1 = "test";
//		String str2 = "test";
//		String str3 = new String("test");
//		String str4 = new String("test");
//		System.out.println((str1 == str2) +" "+ (str1 == str3) + (str3==str4));
		System.out.println(func(65530));
	}
	
	public void findOne(int[] array) {
		//建立一个下标是1-100的数组，遍历array，将array[i]的值作为新数组下标，
		//并将该下标对应的值设置为1，如果该值已经是1了，那么下标就是重复的数
		int[] newArray = new int[101];
		int result = 0;
		for(int i = 0; i < array.length; i++) {
			//让下标和值对应，所以加1
			if(newArray[array[i]] == 0) {
				newArray[array[i]] = 1;
			}else {
				result = array[i];
			}
		}
		System.out.println(result);
	}
	
	private static int func(int x) {
		int countx = 0;
		while(x != 0) {
			countx++;
			x = x & (x - 1);
		}
		return countx;
	}
}

