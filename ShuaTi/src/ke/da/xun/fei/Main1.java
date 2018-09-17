package ke.da.xun.fei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @date 2018年9月7日 下午4:22:03
 * @author 龙
 * 类描述：修改成绩
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//计算需要多少分补到总分，再从最小的数开始加，上限加到100，
		//简而言之，从小到大排序，每个直接加到100，什么时候大于总分数，停止
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int[] result = new int[T];
		int index = 0;
		//有多组输入数据
		while(T-- != 0) {
			int n = input.nextInt();
			int x = input.nextInt();
			int[] grades = new int[n];
			int sumTwo = 0;
			for(int i = 0; i < n; i++) {
				grades[i] = input.nextInt();
				sumTwo += grades[i];
			}
			//排序
			Arrays.sort(grades);
			int sumOne = n * x;
			int count = 0;
			int indexOne = 0;
			while(sumTwo < sumOne && indexOne < n) {
				sumTwo += (100 - grades[indexOne++]);
				count++;
			}
			result[index++] = count;
		}
		//输出
		for (int i : result) {
			System.out.println(i);
		}
	}

}
