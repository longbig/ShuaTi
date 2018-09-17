package xun.lei;

import java.util.Scanner;

/**
 * @date 2018年9月12日 下午7:41:50
 * @author 龙
 * 类描述：计算勾股数
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int count = computeG(N);
		System.out.println(count);
	}

	private static int computeG(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		if(n < 5)
			return 0;
		for(int i = 1; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				int sum = i*i + j*j;
				int c = (int) Math.sqrt(sum);
				if(c*c == sum && c <= n && gcd(i, c) && gcd(j, c) && gcd(i, j)) {
					count++;
				}
			}
		}
		return count;
	}
	
	private static boolean gcd(int n, int m) {
		int t;
		while(n != 0) {
			t = m % n;
			m = n;
			n = t;
		}
		if(m == 1)
			return true;
		else
			return false;
	}

}
