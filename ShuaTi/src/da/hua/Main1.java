package da.hua;

import java.util.Scanner;

/**
 * @date 2018年9月19日 下午9:45:10
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(rev(rev(a) + rev(b)));
	}
	
	//一个函数反转整数，去掉前导0
	public static int rev(int n) {
		String str = String.valueOf(n);
		String out = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			out += str.charAt(i);
		}
		int res = Integer.valueOf(out);
		return res;
	}

}
