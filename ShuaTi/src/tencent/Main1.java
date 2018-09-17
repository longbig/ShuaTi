package tencent;

import java.util.Scanner;

/**
 * @date 2018年9月16日 上午10:48:45
 * @author 龙
 * 类描述：最小公倍数的升级版
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//计算从n+1开始的数的最小公倍数能够整除后面那段最小公倍数；可以就输出
		int small = lgd(n);
		n = n + 1;
		int temp = (n * (n + 1)) / gcd(n, n + 1);
		n = n + 1;
		
		while(temp % small != 0) {
			
			temp = (temp * (n + 1)) / gcd(temp, n + 1);
			n = n + 1;
		}
		System.out.println(n);
		
	}
	
	public static int gcd(int a, int b) {
		return a == 0 ? b : (gcd(a % b, a));
	}
	
	//计算从1到n的最小公倍数
	public static int lgd(int n) {
		if(n == 1)
			return 1;
		int[] array = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			array[i] = i;
		}
		for(int i = 1; i < n; i++) {
			array[i + 1] = (array[i] * array[i + 1]) / gcd(array[i], array[i+1]);
		}
		return array[n];
	}

}
