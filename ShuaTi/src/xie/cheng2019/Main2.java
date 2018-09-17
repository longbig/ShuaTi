package xie.cheng2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @date 2018年9月4日 下午6:31:48
 * @author 龙
 * 类描述：输入一堆订单，由编号，入住时间，出时间组成；
 * 			给定时间t，   求出t在入<t<出的订单个数，输出所有订单号，排好序的
 */
class Order{
	int No;
	int inTime;
	int outTime;
	
	public Order(int n, int in, int out) {
		this.No = n;
		this.inTime = in;
		this.outTime = out;
	}
	
}


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int A = input.nextInt();
		Order[] orders = new Order[n];
		//使用TreeSet集合，自动排好序的
		ArrayList<Order> allOrder = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int No = input.nextInt();
			int inTime = input.nextInt();
			int outTime = input.nextInt();
			orders[i] = new Order(No, inTime, outTime);
			
			allOrder.add(orders[i]);
		}
		//直接移除并比较，得出结果
		int i = 0;
		for (Order temp : allOrder) {
			if(A >= temp.inTime && A <= temp.outTime) {
				result.add(temp.No);
			}
		}
		
		//输出
		if(result.size() == 0) {
			System.out.println("null");
		}else {
			
			Collections.sort(result);
			for (Integer integer : result) {
				System.out.println(integer);
			}
		}
		
	}

}
