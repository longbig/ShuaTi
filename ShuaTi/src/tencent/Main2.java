package tencent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @date 2018年9月16日 上午11:27:25
 * @author 龙
 * 类描述：连通性，并查集方法
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(input.hasNextInt()) {
		int n = input.nextInt();
		int m = input.nextInt();
		int[][] g = new int[n][n];
		boolean[] using = new boolean[n];
		boolean[] use1 = new boolean[n];
		for(int i = 0; i < m; i++) {
			int u = input.nextInt()-1;
			int v = input.nextInt()-1;
			if(u != v && g[u][v] != 1) {
				g[u][v] = 1;
			}
		}
			int x = 0;
			int y = 0;
			int ans = 0;
			
			for(int i = 0; i < n; i++) {
				Arrays.fill(using, false);
				DFS(g, i, using);
				x = count(using);
				for(int k = 0; k < n; k++) {
					Arrays.fill(use1, false);
					if(k != i && hasPath(g, k, i, use1))
						y++;
				}
				if(y > x) {
					ans++;
				}
				x = 0;
				y = 0;
			}
			System.out.println(ans);
		}
	}
	
	public static void DFS(int[][] g, int index, boolean[] using) {
		for(int i = 0; i < g.length; i++) {
			if(g[index][i] == 1 && !using[i]) {
				using[i] = true;
				DFS(g, i, using);
			}
		}
	}

	public static int count(boolean[] using) {
		int count = 0;
		for(boolean b : using) {
			if(b)
				count++;
		}
		return count;
	}
	
	public static boolean hasPath(int[][] g, int x, int y, boolean[] using) {
		using[x] = true;
		if(x == y) {
			return true;
		}
		for(int i = 0; i < g.length; i++) {
			if(g[x][i] == 1 && !using[i]) {
				if(hasPath(g, i, y, using))
					return true;
			}
		}
		return false;
	}
}
