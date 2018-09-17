package gbits2019;

import java.util.Scanner;

/**
 * @date 2018年9月3日 下午6:53:34
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		int minSum = 0,nowSum = 0;
		for(int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		for(int i = 0; i < n; i++) {
			nowSum += array[i];
			if(nowSum < minSum) {
				minSum = nowSum;
			}else if(nowSum > 0){
				nowSum = 0;
			}
		}
		System.out.println(minSum);
	}

}
