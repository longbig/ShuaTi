package nowcoder.contest;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Scanner;

/**
*日期：2018年4月5日 上午10:18:13
*@author 龙
*哦吼吼：Main2
*描述：
*

题目描述 
wyh学长十分钟爱数字‘7’，他想知道每一个数字中有多少个数字‘7’

输入描述:
输入第一行一个整数T(1<=T<=10)
接下来有T组测试数据，对于每组测试数据，输入一个整数n(1<=n<=10000000000)
输出描述:
对于每组测试数据，输出对应答案
示例1
输入
2
1234567
123456
输出
1
0
**/
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] array = new String[n];
		int[] out = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = scanner.next();
			for(int j = 0; j < array[i].length(); j++) {
				if((char)array[i].charAt(j) == '7') {
					out[i]++;
				}
			}
		}
		
		for(int i =0; i < n; i++) {
			System.out.println(out[i]);
		}
	}

}
