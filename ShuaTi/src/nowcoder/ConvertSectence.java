package nowcoder;

import java.util.Scanner;

/**
*日期：2018年4月13日 上午11:56:31
*@author 龙
*哦吼吼：ConvertSectence
*描述：句子反转，如：xiao mi 666 ->  666 mi xiao
*注意要使用StringBuffer 来保存结果，再进行转化；
**/
public class ConvertSectence {
	
	//方法
	public static String cc(String string) {
		String[] str1 = string.split(" ");
		StringBuffer result = new StringBuffer();
		for(int i = str1.length - 1; i > 0; i--) {
			result.append(str1[i] + " ");
		}
		result.append(str1[0]);
		String ss = result.toString();
		return ss;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			String string = scanner.nextLine();
			System.out.println(cc(string));
		}
	}

}
