package wei.ping.hui;

import java.util.Scanner;
import java.util.Stack;

/**
 * @date 2018年9月15日 下午8:43:39
 * @author 龙
 * 类描述：
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		//转十进制数
		int aa = change(a);
		int bb = change(b);
		String result = sToInt(aa + bb);
		System.out.println(result);
	}

	private static String sToInt(int i) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		while(i != 0) {
			char ch = (char)((i & 1) + 48);
			i = i >> 1;
			stack.push(ch);
		}
		String ss = "";
		while(!stack.isEmpty()) {
			ss = ss + stack.pop();
		}
		return ss;
	}

	private static int change(String a) {
		// TODO Auto-generated method stub
		int res = 0;
		int count = 1;
		for(int i = a.length() - 1; i >= 0; i--) {
			res += (a.charAt(i) - 48) * count;
			count *= 2;
		}
		return res;
	}

}
