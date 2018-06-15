package meituan.contest;

import java.util.Scanner;

/**
*日期：2018年6月9日 下午8:33:37
*@author 龙
*哦吼吼：Main2_2
*描述：初赛A第二题
**/

class Ball{
	int x;
	int change;
	
	public void pWall() {
		if(this.x == 0) {
			this.change = 1;
		}
	}
	
	//运动
	public int run(int count) {
		this.x += this.change;
		return ++count;
	}
}

public class Main2_2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Ball ball = new Ball();
		int[] start = new int[n];
		int[] end = new int[n];
		int count = 0;
		for(int i = 0; i<2*n; i++) {
			if(i < n) {
				start[i] = scanner.nextInt();
			}else {
				end[i - n] = scanner.nextInt();
			}
		}
		
		//开始进行
		for(int i = 0; i < n; i++) {
			if(start[i] > end[i]) {
				ball.x = i;
				ball.change = -1;
				inner:while(true) {
					count = ball.run(count);
					ball.pWall();
					if(start[ball.x] < end[ball.x]) {
						end[ball.x]++;
						start[ball.x]--;
						break inner;
					}
				}
			}
			System.out.println(ball.x);
		}
		System.out.println(count);
		
		
		
	}

}
