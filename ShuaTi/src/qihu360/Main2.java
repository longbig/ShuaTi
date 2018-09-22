package qihu360;

import java.util.Scanner;

/**
 * @date 2018年9月17日 下午8:33:15
 * @author 龙
 * 类描述：
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		while(q-- != 0) {
			int k = in.nextInt();
			int l = in.nextInt();
			int r = in.nextInt();
			
			int n = 0, sum = 1;
			while((sum - 1) < r) {
				sum *= k;
				n++;
			}
			
			sum /= k;
			System.out.println(sum - 1);
		}
	}

}
