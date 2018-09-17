package wangyi;

import java.util.Scanner;

/**
 * @date 2018年9月8日 下午3:38:06
 * @author 龙
 * 类描述：互联网职位
 * 橡皮泥斑马
 * 
 * 思路：
 * 可以发现，无论操作多少次，总是由两段下标连续的串组成，
 * 所以直接在原串后面接上原串，求最长黑白相间连续串即可。
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String string = input.next();
		int countB = 0;
		int countW = 0;
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == 'b')
				countB++;
			if(string.charAt(i) == 'w')
				countW++;
		}
		int min = Math.min(countB, countW);
		System.out.println(2 * min + 1);
	}

}
