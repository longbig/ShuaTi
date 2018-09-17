package ping2.duo.duo;

import java.util.Scanner;

/**
 * @date 2018年8月30日 下午7:29:48
 * @author 龙 类描述：棋盘竖起来之后的状态问题
 * 			. 空白
 * 			o 可滑动块
 * 			x 障碍物，不可动
 * 
 * 示例：
 * 3 4
..ox
oo..
..x.

output:
...x
..o.
..x.
 */
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bb = sc.nextLine();
		String[] cc = bb.split(" ");
		int n = Integer.parseInt(cc[0]);
		int m = Integer.parseInt(cc[1]);
		char[][] arr = new char[n][m];
		String[] all = new String[n];
		for (int i = 0; i < n; i++) {
			all[i] = sc.next();
			
			arr[i] = all[i].toCharArray();
		}
		
		//遍历，交换，如果o到达底部的话，底部就变为.
		for(int j = 0; j < m; j++) {
			for(int i = n - 1; i >= 0; i--) {
				if(arr[i][j] == 'x') continue;
				if(arr[i][j] == '.') continue;
				//为o的情况
				int k = i + 1;
				int now = i;
				while(k < n) {
					if(arr[k][j] == 'x' || arr[k][j] == 'o') 
						break;
					//交换位置
					arr[now][j] = '.';
					arr[k][j] = 'o';
					now++;
					k++;
				}
				
				if(k == n) {
					arr[now][j] = '.';
				}
				
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
