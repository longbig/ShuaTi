package xie.cheng2019;

import java.util.Scanner;

/**
 * @date 2018年9月4日 下午6:31:38
 * @author 龙
 * 类描述：求二进制表示中1的个数
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		int count = 0; 
		while(n != 0) {
			count++;
			n = (n - 1) & n;
		}
		System.out.println(count);
	}

}
