package meituan.codeM.contest;

import java.util.Scanner;

/**
 * 题目描述：
*日期：2018年5月26日 下午1:54:52
*@author 龙
*哦吼吼：Main2
*描述：
*小美和小团最近沉迷可乐。
*可供TA们选择的可乐共有k种，比如可口可乐、零度可乐等等，每种可乐会带给小美和小团不同的快乐程度。
TA们一共要买n瓶可乐，每种可乐可以买无限多瓶，小美会随机挑选其中的m瓶喝，剩下的n-m瓶小团喝。

请问应该如何购买可乐，使得小美和小团得到的快乐程度的和的期望值最大？
现在请求出购买可乐的方案。
输入描述:
第一行三个整数n，m，k分别表示要买的可乐数、小美喝的可乐数以及可供选择的可乐种数。
接下来k行，每行两个整数a，b分别表示某种可乐分别给予小美和小团的快乐程度。
对于所有数据，1 <= n <= 10,000, 0 <= m <= n, 1 <= k <= 10,000, -10,000 <= a, b <= 10,000
输出描述:
一行k个整数，第i个整数表示购买第i种可乐的数目。
如果有多解，请输出【字典序最小】的那个。
对于两个序列 a1, a2, ..., ak, b1, b2, ..., bk，a的字典序小于b，当且仅当存在一个位置i <= k满足：
ai < bi且对于所有的位置 j < i，aj = bj；
示例1
输入
2 1 2
1 2
3 1
输出
0 2
说明
一共有三种购买方案：
1. 买2瓶第一类可乐，小美和小团各喝一瓶，期望得到的快乐程度和为1+2=3；
2. 买1瓶第一类可乐和1瓶第二类可乐，小美和小团各有二分之一的概率喝到第一类可乐，
	另有二分之一的概率喝到第二类可乐，期望得到的快乐程度和为1*0.5+3*0.5+2*0.5+1*0.5=3.5；
3. 买2瓶第二类可乐，小美和小团各喝一瓶，期望得到的快乐程度和为3+1=4。
**/
/*
 * 思路，计算每瓶可乐带来的欢乐值，每次将最大的填满，如果存在欢乐值一样的，取序号小的那个；
 */
public class Main2 {
	
	//取三个数中最大的那个值
	public static double largest(double aMax, double bMax, double avgMax) {
		double result1 = Math.max(aMax, bMax);
		double result2 = Math.max(avgMax, result1);
		return result2;
	}
	
	//计算1瓶可乐带来的欢乐值
	public static double sumHappy(int n, int m, int a, int b) {
		double sum = 0.0;
	
		sum = a * (m / n) + b * ((n-m) / n);
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		int[][] happy = new int[k][2];
		double[] happyValue = new double[k];
		int[] result = new int[k];
		
		for(int i = 0; i < k; i++) {
			happy[i][0] = scanner.nextInt();
			happy[i][1] = scanner.nextInt();
		}
		//计算欢乐值数组
		double avgMax = sumHappy(n, m, happy[0][0], happy[0][1]);
		double aMax = happy[0][0];
		double bMax = happy[0][1];
		int pos1 = 0, apos = 0, bpos = 0;
		for(int i = 0; i < k; i++) {
			int a = happy[i][0];
			int b = happy[i][1];
			happyValue[i] = sumHappy(n, m, a, b);
			if(happyValue[i] >= avgMax) {
				avgMax = happyValue[i];
				pos1 = i;
			}
			//除了找平均值最大，还要找独占最大情况，以及独占和平均值比较
			//找a,b最大的情况
			if(aMax <= a) {
				aMax = a;
				apos = i;
			}
			if(bMax <= b) {
				bMax = b;
				bpos = i;
			}	
		}
		
		//对三种情况计算欢乐值，取最大的那个
		double aa = 0, bb = 0, av = 0;
		aa = m * aMax + (n-m) * happy[apos][1];
		bb = m * happy[bpos][0] + (n-m) * bMax;
		av = n * avgMax;
		double bbb = largest(aa, bb, av);
		if(bbb == aa) {
			result[apos] = n;
		}else if(bbb == bb) {
			result[bpos] = n;
		}else {
			result[pos1] = n;
		}
		
		//输出结果，只能通过30%的测试
		for(int i = 0; i < k; i++) {
			if(i == 0) {
				System.out.print(result[0]);
			}else {
				System.out.print(" " + result[i]);
			}
		}	
		
	}

}
