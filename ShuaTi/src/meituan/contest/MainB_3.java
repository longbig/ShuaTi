package meituan.contest;

import java.util.Scanner;

/**
*日期：2018年6月23日 下午2:26:54
*@author 龙
*哦吼吼：MainB_3
*描述：b轮第三题
**/
public class MainB_3 {

	//func lowbit
	public static int lowbit(int x) {
		return (x & (-x));
	}
	
	//function f
	public static int f(int l, int r) {
		int rr = lowbit(r);
		
		if(l >= r) {
			return 0;
		}else if((r - rr) >= l) {
			return f(l, r - rr) + 1;
		}else {
			return f(l, r - 1) + 1;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int length = string.length();
		int n = 0, count = 1, l,r;
		for(int i = length-1; i >= 0; i--) {
			int ch = (int)string.charAt(i) - 48;
			n += count * ch;
			count *= 2;
		}
		int max = 0;
		//得到n
		
		
		System.out.println(max);
	}

}
