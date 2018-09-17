package xun.lei;

import java.util.Scanner;

/**
 * @date 2018年9月12日 下午7:41:08
 * @author 龙
 * 类描述：
 */
public class Main1 {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		System.out.println(gcd(A, B));
	}
	public static int gcd(int a, int b){
	    return a == 0 ? b : gcd(b%a, a);
	}
	
}
