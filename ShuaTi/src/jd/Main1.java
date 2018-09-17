package jd;

import java.util.Scanner;
import java.util.HashMap;

/**
 * @date 2018年9月9日 下午8:01:40
 * @author 龙
 * 类描述：完全多部图
 * 思路：具有相同（度）的节点的个数，是（N-度）的倍数；
 */


public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int _i = 0; _i < T; _i++) {
			int N = in.nextInt();
			int M = in.nextInt();
			int[] du = new int[N + 1];
			for (int i = 0; i < M; i++) {
				int t1 = in.nextInt();
				int t2 = in.nextInt();
				du[t1]++;
				du[t2]++;
			}
			HashMap<Integer, Integer> du2num = new HashMap<>();
			for (int i = 1; i <= N; i++) {
				if (!du2num.containsKey(du[i])) {
					du2num.put(du[i], 1);
				} else {
					du2num.put(du[i], du2num.get(du[i]) + 1);
				}
			}
			boolean flag = true;
			for (int n : du2num.keySet()) {
				if (du2num.get(n) % (N - n) != 0)
					flag = false;
			}
			if (flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
