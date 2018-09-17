package jd;

import java.util.Scanner;

/**
 * @date 2018年9月9日 下午8:06:33
 * @author 龙
 * 类描述：对比，一个类有3个属性，如果它的三个属性全低于另一个类的三个属性，
 *     他就是不合格产品，计算不合格个数
 */
public class Main2 {

	//暴力方法，两两比较
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] product = new int[n][3];
		int[] flag = new int[n];
		for(int i = 0; i < n; i++) {
			product[i][0] = input.nextInt();
			product[i][1] = input.nextInt();
			product[i][2] = input.nextInt();
		}
		//两两比较
		for(int i = 0; i < n - 1; i++) {
			int element1 = product[i][0];
			int element2 = product[i][1];
			int element3 = product[i][2];
			for(int j = i + 1; j < n; j++) {
				//后 > 前
				if(element1 < product[j][0]
						&& element2 < product[j][1]
						&& element3 < product[j][2]) {
					flag[i] = 1;
				}
				//前 > 后
				if(element1 > product[j][0]
						&& element2 > product[j][1]
						&& element3 > product[j][2]) {
					flag[j] = 1;
				}
			}
		}
		//计算
		int count = 0;
		for(int i = 0; i < n; i++) {
			count += flag[i];
		}
		System.out.println(count);
	}

}
