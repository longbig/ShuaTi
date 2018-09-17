package wangyi;

import java.util.Scanner;

/**
 * @date 2018年9月8日 下午4:27:35
 * @author 龙
 * 类描述：使用糖果投票
 */
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[] arrayRen = new int[3001];
		int[] arrayPiao = new int[n];
		int[][] toupiao = new int[n][2];
		
		//输入
		for(int i = 0; i < n; i++) {
			toupiao[i][0] = input.nextInt();
			toupiao[i][1] = input.nextInt();
		}
		//不是投目标的就记录
		for(int i = 0; i < n; i++) {
			
		}
	}

}
