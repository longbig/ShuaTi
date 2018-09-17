package zhao.yin.card;

import java.util.Scanner;

/**
 * @date 2018年9月16日 下午7:46:37
 * @author 龙
 * 类描述：跳格子游戏
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(allNum(n));
	}

	private static int allNum(int n) {
		// TODO Auto-generated method stub
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		return (allNum(n-1) + allNum(n-2));
	}

}
