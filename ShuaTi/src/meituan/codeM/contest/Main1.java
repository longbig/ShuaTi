package meituan.codeM.contest;

import java.util.Scanner;

/**
*日期：2018年5月26日 下午12:27:52
*@author 龙
*哦吼吼：Main1
*描述：题目描述
美团在吃喝玩乐等很多方面都给大家提供了便利。最近又增加了一项新业务：小象生鲜。
这是新零售超市，你既可以在线下超市门店选购生鲜食品，也可以在手机App上下单，最快30分钟就配送到家。
新店开张免不了大优惠。
我们要在小象生鲜超市里采购n个物品，每个物品价格为ai，有一些物品可以选择八折优惠（称为特价优惠）。
有m种满减优惠方式，满减优惠方式只有在所有物品都不选择特价优惠时才能使用，且最多只可以选择最多一款。
每种满减优惠描述为(bi,ci)，即满bi减ci（当消费>=bi时优惠ci）。
求要买齐这n个物品（必须一单买齐），至少需要多少钱（保留两位小数）。
输入描述:
第一行，两个整数n,m。
接下来n行，每行一个正整数ai，以及一个0/1表示是否可以选择特价优惠（1表示可以）。
接下来m行，每行两个正整数bi,ci，描述一款满减优惠。

1 <= n,m <=10
1 <= ai <= 100
1 <= ci < bi <= 1000
输出描述:
一行一个实数，表示至少需要消耗的钱数（保留恰好两位小数）。
示例1
输入
2 1
6 1
10 1
12 2
输出
12.80
示例2
输入
2 2
6 1
10 1
5 1
16 6
输出
10.00
**/

//定义一个商品类
class Item{
	public int a;
	// 0/1是否优惠
	public int offer;
	
	public double thePrice;
	//判断否优惠
	public boolean isOffer() {
		return this.offer == 1 ? true : false;
	}
	//实际价格
	public double nowPrice() {
		if(isOffer()) {
			thePrice = 0.80 * a;
			return thePrice;
		}else {
			return a;
		}
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Item[] items = new Item[n];
		int[][] oofers = new int[m][2];
		double result = 0.00, result1 = 0.00, result2 = 0.00;
		
		//保存操作
		for(int i = 0; i < n; i++) {
			items[i] = new Item();
			items[i].a = scanner.nextInt();
			items[i].offer = scanner.nextInt();
			result1 += items[i].a;
		}
		for(int i = 0; i < m; i++) {
			oofers[i][0] = scanner.nextInt();
			oofers[i][1] = scanner.nextInt();
		}
		
		//满多少减多少策略的最小价格
		result2 = result1 - oofers[0][1];
		for(int i = 0; i < m; i++) {
			if(result1 >= oofers[i][0]) {
				double result3 = result1 - oofers[i][1];
				if(result3 < result2)
					result2 = result3;
			}
		}
		
		//八折优惠的最小价格
		for(int i = 0; i < n; i++) {
			result += items[i].nowPrice();
		}
	
		result = result < result2 ? result : result2;
		System.out.println(String.format("%.2f", result));
	}
}
