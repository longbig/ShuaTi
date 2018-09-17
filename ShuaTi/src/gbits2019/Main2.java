package gbits2019;

import java.util.Scanner;

/**
 * @date 2018年9月3日 下午6:53:46
 * @author 龙
 * 类描述：2018数
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int count = 0;
		if(x < 2018) {
			System.out.println(0);
		}else {
			for(int i = x; i >= 2018; i--) {
				count += howMuch2018(i);
			}
		}
		System.out.println(count);
		
	}

	private static int howMuch2018(int x) {
		// TODO Auto-generated method stub
		int count = 0;
		String string = String.valueOf(x);
		char[] allString = string.toCharArray();
		String rule = "[0-9]*2+[0-9]*0+[0-9]*1+[0-9]*8+[0-9]*";
		if(string.matches(rule)) {
			count++;
		}
		
		return count;
	}

}
