package wangyi;

import java.util.Scanner;

/**
 * @date 2018年9月8日 下午3:48:57
 * @author 龙
 * 类描述：买房，互联网职位
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		long[][] data = new long[t][2];
		long[][] result = new long[t][2];
		int index = 0;
		
		for (int i = 0; i < t; i++) {
			data[i][0] = input.nextInt();
			data[i][1] = input.nextInt();
		}
		
		for(int i = 0; i < t; i++) {
			long n = data[i][0];
			long k = data[i][1];
			if(n < 3 || k == n) {
				result[i][1] = 0;
			}else {
				long rest = n - k;
				long temp = k - 1;
				result[i][1] = Math.min(rest, temp);
			}
			
		}

		for(int i = 0; i < t; i++) {
			System.out.println(result[i][0] + " " + result[i][1]);
		}
	}

}
