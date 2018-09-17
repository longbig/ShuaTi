package zhao.yin.card;

import java.util.Scanner;

/**
 * @date 2018年9月16日 下午7:51:27
 * @author 龙
 * 类描述：
 */
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		//正则表达式
		String regex = "[0|1|8]*[2|5|6|9]*[0|1|8]*[2|5|6|9]+[0|1|8]*[2|5|6|9]*";
		int count = 0;
		for(int i = 1; i <= N; i++) {
			String aa = String.valueOf(i);
			if(aa.matches(regex))
				count++;
		}
		System.out.println(count);
	}

}
