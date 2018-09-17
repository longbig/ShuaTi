package yi.xin;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @date 2018年9月11日 下午5:32:49
 * @author 龙
 * 类描述：最长递增子序列的变形
 * 
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		String[] datas = data.split("\\s");
		for (String string : datas) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		int[][] dd = new int[datas.length / 2 + 1][2];
		for(int i = 1; i < dd.length;i++) {
			dd[i][0] = Integer.parseInt(datas[2 * i]);
			dd[i][1] = Integer.parseInt(datas[2 * i + 1]);
		}
		//计算
		for (int[] is : dd) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}
