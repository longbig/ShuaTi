package ccf201712;

import java.util.Scanner;

/**
*日期：2018年3月9日 下午7:18:36
*@author 龙
*哦吼吼：Game2
*描述：
**/
public class Game2 {
	
	//设置一个函数，判断数组里是否只剩一个小孩了
	private static boolean judge(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == 0) {
				sum++;
			}
		}
		if(sum==1) {
			return false;
		}else
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int[] boy = new int[n];
		int i = 0, sum = 0;
		while(judge(boy)){
			if(boy[i] == 0) {
				sum++;
				if((sum % k == 0) || (sum % 10 == k)) {
					boy[i] = 1;
				}
			}
			i++;
			if(i == n) {
				i = 0;
			}
		}
		for(i = 0; i < n; i++) {
			if(boy[i] == 0)
				System.out.println(i+1);
		}
	}

}
