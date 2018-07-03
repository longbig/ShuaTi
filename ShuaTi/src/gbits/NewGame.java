package gbits;

import java.util.Scanner;

/**
*日期：2018年7月3日 下午1:44:30
*@author 龙
*哦吼吼：NewGame
*描述：
*棋盘类游戏：
*角色可向下，右移动，移动加上格子上的行动力；动力<=0时游戏结束，
*问初始行动力至少为多少？
*初始时也要加上左上角行动力
*
*2.解题思路: 
求从左上角移动到右上角需要多少个行动力，
可以解释为在走完最后一个房间的时候血量至少要剩下1，
因为最后的状态可以当成是初始状态，
由后往前依次决定在每一个位置至少要有多少行动力, 
这样一个位置的状态是由其下面一个和和左边一个的较小状态决定．
状态方程为： 
dp[i][j] = min(dp[i+1][j], dp[i][j+1]) - dungeon[i, j];
**/
public class NewGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int[][] checkerBoard = new int[M][N];
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				checkerBoard[i][j] = scanner.nextInt();
			}
		}
		
		//最后的右下角为1时，极端状态
		int[][] dp = new int[M][N];
		//边界处理，处理下边和右边
		dp[M-1][N-1] = Math.max(1 - checkerBoard[M-1][N-1], 1);
		for(int j = N-2; j >= 0; j--) {
			int temp = dp[M -1][j+1] - checkerBoard[M-1][j];
			dp[M-1][j] = Math.max(temp, 1);
		}
		for(int i = M - 2; i >= 0; i--) {
			int temp = dp[i+1][N-1] - checkerBoard[i][N-1];
			dp[i][N-1] = Math.max(temp, 1);
		}
		//其他点处理
		for(int i = M-2; i >= 0; i--) {
			for(int j = N-2; j>= 0; j--) {
				int temp = Math.min(dp[i+1][j], dp[i][j+1]) - checkerBoard[i][j];
				dp[i][j] = Math.max(temp, 1);
			}
		}
		
		System.out.println(dp[0][0]);
		
	}

}
