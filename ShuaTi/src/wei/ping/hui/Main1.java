package wei.ping.hui;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @date 2018年9月15日 下午8:29:36
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		int n = input.nextInt();
		int[] array = new int[n * n];
		for(int i = 0; i < n * n; i++) {
			array[i] = input.nextInt();
		}
		//计算
		Arrays.sort(array);
		System.out.println(array[k - 1]);
	}

}
