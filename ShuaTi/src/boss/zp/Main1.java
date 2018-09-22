package boss.zp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @date 2018年9月21日 下午7:24:31
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String string = in.next();
		ArrayList<String> list = new ArrayList<>();
		int start = 0;
		boolean flag = true;
		char ch;
		for(int end = 0; end < string.length(); end++) {
			ch = string.charAt(end);
			if(Character.isDigit(ch) && flag) {
				start = end;
				flag = false;
			}
			if((Character.isLetter(ch) && !flag) || (!flag && end == string.length() - 1)) {
				String newString = string.substring(start, end);
				if(end == string.length() - 1) {
					newString = string.substring(start, end + 1);
				}
				list.add(newString);
				start = end;
				flag = true;
			}
		}
		
		BigInteger max = new BigInteger("0");
		for (String string2 : list) {
			System.out.println(string2);
			BigInteger now = new BigInteger(string2);
			if(now.compareTo(max) > 0) {
				max = now;
			}
		}
		System.out.println(max);
		
		
	}

}
