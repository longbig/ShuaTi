package meituan.contest;
import java.util.Scanner;

/**
*日期：2018年6月23日 下午2:15:32
*@author 龙
*哦吼吼：MainB_1
*描述：b轮第一题
**/

class Status{
	int x;
	int y;
	int z;
	String time;
}


public class MainB_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		Status[] statuss = new Status[k];
		for(int i = 0; i < k; i++) {
			statuss[i] = new Status();
			statuss[i].x = scanner.nextInt()-1;
			statuss[i].y = scanner.nextInt()-1;
			statuss[i].z = scanner.nextInt();
			statuss[i].time = scanner.next();
		}
		//排序
		Status temp = new Status();
		for(int i = 0; i < k-1; i++) {
			for(int j = i+1; j < k; j++) {
				if(statuss[i].time.compareTo(statuss[j].time) > 0) {
					temp = statuss[i];
					statuss[i] = statuss[j];
					statuss[j] = temp;
				}
			}
		}
		for (Status status : statuss) {
			System.out.println(status.time);
		}
		
		//矩阵
		int[][] light = new int[n][m];
		int[][] light1 = new int[n][m];
		int max = 0;
		//执行,只要有人进入，+1， 有人出 -1
		for(int i = 0; i < k; i++) {
			if(statuss[i].z == 0) {
				light[statuss[i].x][statuss[i].y]++;
			}else {
				light[statuss[i].x][statuss[i].y]--;
			}
			//计数
			int count = 0;
			for(int j = 0; j < n; j++) {
				for(int q = 0; q < m; q++) {
					if(light[j][q] != 0)
						count++;
				}
			}
			
			if(count >= max) {
				max = count;
				light1 = light;
			}
		}

		
		//输出
        for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(light1[i][j] != 0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
	}

}
