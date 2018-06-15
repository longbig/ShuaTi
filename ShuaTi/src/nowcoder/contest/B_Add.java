package nowcoder.contest;

import java.util.Scanner;

/**
*日期：2018年4月14日 下午12:44:56
*@author 龙
*哦吼吼：B_Add
*描述：
*链接：https://www.nowcoder.com/acm/contest/96/B
来源：牛客网

输入描述:
输入有多组（组数不超过1000），每组占一行，每行有2个正整数A和B。（A,B<=1e9）
输出描述:
每组输出占一行，输出题目中A和B相加的结果。
示例1
输入
123 321
999 1
99 11
输出
444
990
0

最原始方法
**/
public class B_Add {
	
	public static int len(int n) {
		int i = 0;
		while(n != 0) {
			n /= 10;
			i++;
		}
		return i;
	}

	
	public static int badd(int a1, int a2) {
		int len1 = len(a1), len2 = len(a2);
		int ll = Math.min(len1, len2);

		int sum = 0, x = 1;
		
		for(int i = 0; i < ll; i++) {
			int a = a1 % 10;
			int b = a2 % 10;
			a1 /= 10;
			a2 /= 10;
			int c = a + b;
			if(c > 9) {
				c -= 10;
			}
			sum += c * x;
			x *= 10;	
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int tem = 0, ll = 0;
			if(len(a) > len(b)) {
				tem = a;
				ll = len(b);
			}else if(len(a) < len(b)) {
				tem = b;
				ll = len(a);
			}
			
			if(ll != 0) {
				
			tem /= (10 * ll);
			tem *= (10 * ll);
			int exr = badd(a, b);
			int sum;
			sum = exr + tem;
			System.out.println(sum);
			}else {
				System.out.println(badd(a, b));
			}
		}
	}

}
