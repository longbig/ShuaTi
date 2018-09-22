package xiao.hong.shu;

import java.util.Scanner;

/**
 * @date 2018年9月18日 下午7:43:40
 * @author 龙
 * 类描述：分成多位数，分开计算；
 */
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		//设置一个函数，计算1的个数
		System.out.println(countOne(n));
	}
	
	private static long countOne(long n) {
		long count = 0;
		long factor = 1;
		long lowerNum = 0;
		long currNum = 0;
		long higherNum = 0;
		if(n <= 0)
			return 0;
		
		while(n / factor != 0) {
			lowerNum = n - (n / factor) * factor;
			currNum = (n / factor) % 10;
			higherNum = n / (factor * 10);
			if(currNum == 0) {
				count += higherNum * factor;
			}else if(currNum == 1) {
				count += higherNum * factor + lowerNum + 1;
			}else {
				count += (higherNum + 1) * factor;
			}
			factor *= 10;
		}
		return count;
	}

}
