package wangyi;


import java.util.Scanner;

/**
*日期：2018年3月28日 下午2:39:53
*@author 龙
*哦吼吼：DiGui
*描述：
*题目描述：
*小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.
*在接下来的一段时间内,他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn. 
*如果遇到的怪物防御力bi小于等于小易的当前能力值c,那么他就能轻松打败怪物,并 且使得自己的能力值增加bi;
*如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的最大公约数.
*那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?
*
输入描述:
对于每组数据,第一行是两个整数n(1≤n<100000)表示怪物的数量和a表示小易的初始能力值.
第二行n个整数,b1,b2...bn(1≤bi≤n)表示每个怪物的防御力
输出描述:
对于每组数据,输出一行.每行仅包含一个整数,表示小易的最终能力值
示例1
输入
3 50
50 105 200
5 20
30 20 15 40 100
输出
110
205
**/

/**
 * 
 * @author 龙
 *解题思路：能力(c)，怪防(bi);
 *		增加策略：1. C >= bi时，增加bi点；
 *				 2.  C < bi时，增加(c,bi)的最大公约数；
 */
public class DiGui {
	
	public static int gcd2(int a, int b) {
		int tmp;
		while(b != 0) {
			tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()) {
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int i;
		for(i = 0; i < n; i++) {
			int x = scanner.nextInt();
			if(a >= x) {
				a += x;
			}else {
				a += gcd2(a, x);
			}
		}
		System.out.println(a);
		}
	}

}
