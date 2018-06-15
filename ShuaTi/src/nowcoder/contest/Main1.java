package nowcoder.contest;

import java.util.Scanner;

/**
*日期：2018年4月5日 上午9:46:58
*@author 龙
*哦吼吼：Main1
*描述：
*链接：https://www.nowcoder.com/acm/contest/93/E
来源：牛客网

这个问题很简单，就是问你n的阶乘末尾有几个0？

输入描述:
输入第一行一个整数T(1<=T<=100)，代表测试组数
接下来T行，每行一个数n(1<=n<=10^9)
输出描述:
对于每组测试数据，输出对应答案
示例1
输入
5
1
2
3
4
5
输出
0
0
0
0
1
*
**/
public class Main1 {
	public static int fun(int x) {
		int count = 0;
		while(x > 4) {
			count = count + x/5;
			x = x / 5;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		int i,j;
		
		for(i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
			array[i] = fun(array[i]);
		}
		
		for(i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	
	}

}
