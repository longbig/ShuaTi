package gbits2018;

import java.util.Scanner;

/**
 * @date 2018年9月3日 下午4:55:28
 * @author 龙
 * 类描述：
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int num = a ^ b;
		int count = 0;
		while(num != 0) {
			count++;
			num = (num - 1) & num;
		}
		
		System.out.println(count);
	}

}
