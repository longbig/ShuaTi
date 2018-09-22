package qihu360;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @date 2018年9月17日 下午8:03:45
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		int count = minStick(array);
		System.out.println(count);
	}

	private static int minStick(int[] array) {
		// TODO Auto-generated method stub
		int len = array.length;
		if(len < 3)
			return -1;
		
		int count = -1;
		for(int i = 2; i < len; i++) {
			int[] newArray = new int[i + 1];
			for(int j = 0; j <= i; j++) {
				newArray[j] = array[j];
			}
			Arrays.sort(newArray);
			int sum = 0;
			for(int k = 0; k < newArray.length - 1; k++) {
				sum += newArray[k];
			}
			System.out.println("sum " + sum);
			System.out.println("newA " + newArray[i]);
			if(newArray[i] < sum) {
				count = i + 1;
				break;
			}
		}
		return count;
	}

}
