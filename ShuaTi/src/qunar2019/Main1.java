package qunar2019;

import java.util.Scanner;

/**
 * @date 2018年9月17日 上午9:54:04
 * @author 龙
 * 类描述：数组的最大连续子数组
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] arrays = line.split("\\s");
		int[] datas = new int[arrays.length];
		for(int i = 0; i < arrays.length; i++) {
			datas[i] = Integer.parseInt(arrays[i]);
		}
		//动态规划
		int current = datas[0], max = datas[0];
		for(int i = 1; i < datas.length; i++) {
			current = Math.max(datas[i] + current, datas[i]);
			if(current > max)
				max = current;
		}
		System.out.println(max);
	}

}
