package bilibili;

import java.util.Scanner;
import java.util.Stack;

/**
 * @date 2018年9月21日 下午4:38:54
 * @author 龙
 * 类描述：扭蛋机
 * 贪心策略
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Stack<Integer> out = new Stack<>();
		
		//倒过来计算
		while(N > 0) {
			if(N % 2 == 1) {
				N = (N - 1) / 2;
				out.push(2);
			}
			if(N % 2 == 0 && N != 0) {
				N = (N - 2) / 2;
				out.push(3);
			}
		}
		//out
		while(!out.isEmpty()) {
			System.out.print(out.pop());
		}
	}

}
