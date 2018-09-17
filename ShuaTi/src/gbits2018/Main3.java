package gbits2018;

import java.util.Scanner;

/**
 * @date 2018年9月3日 下午6:09:31
 * @author 龙
 * 类描述：
 */
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int M = input.nextInt();
		int N = input.nextInt();
		int[][] grid = new int[M][N];
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				grid[i][j] = input.nextInt();
			}
		}
		//从右下角开始
		int[][] sss = new int[M][N];
		//右下角
		sss[M - 1][N - 1] = Math.max(1, 1 - grid[M - 1][N - 1]);
		//右边界
		for(int i = M - 2; i >= 0; i--) {
			sss[i][N - 1] = Math.max(1, sss[i + 1][N - 1] - grid[i][N - 1]);
		}
		//下边界
		for(int j = N - 2; j >= 0; j--) {
			sss[M-1][j] = Math.max(1, sss[M-1][j+1] - grid[M-1][j]);
		}
		//其他
		for(int i = M - 2; i >= 0; i--) {
			for(int j = N - 2; j >= 0; j--) {
				sss[i][j] = Math.max(1, Math.min(sss[i+1][j], sss[i][j+1]) - grid[i][j]);
			}
		}
		//结果
		System.out.println(sss[0][0]);
		
		
	}



}
