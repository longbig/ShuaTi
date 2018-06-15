package nowcoder;

import java.util.Scanner;

/**
*日期：2018年4月10日 下午5:34:56
*@author 龙
*哦吼吼：ShuLieSum
*描述：
*题目描述
数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
输入描述:
输入数据有多组，每组占一行，由两个整数n（n < 10000）和m(m < 1000)组成，n和m的含义如前所述。
输出描述:
对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
示例1
输入
81 4
2 2
输出
94.73
3.41
*
**/
public class ShuLieSum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		double sum[] = new double[1000];
		while(scanner.hasNextDouble()) {
		double n = scanner.nextDouble();
		double m = scanner.nextDouble();
	
		while(m-- != 0) {
			sum[i] += n;
			n = Math.sqrt(n);
		}
		i++;
		}
		for(int j = 0; j < i; j++) {
			System.out.printf("%.2f", sum[j]);
			System.out.println();
		}
	}

}
