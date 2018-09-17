package xie.cheng;

import java.util.Scanner;

/**
 * @date 2018年9月6日 下午8:38:44
 * @author 龙
 * 类描述：N个甲级队员，M个乙级队员，每个球队分配3个人，至少要有1个甲，1个乙；问最多可以有多少个球队？
 * 思路：多的一方减去少的一方，判断结果比min大还是小，即可
 *     M：-----
 *     N：------------
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int min = Math.min(N, M);
		int max = Math.max(M, N);
		
		int count = 0;
		//减去
		int sub = max - min;
		//多出的人比min大
		if(sub > min) {
			count = min;
		}else {
			//多出的人比min小
			int restLenght = N + M - 3 * sub;
			restLenght /= 3;
			count = sub + restLenght;
		}
		System.out.println(count);
	}

}
