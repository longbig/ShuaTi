package ccf201712;

import java.util.Scanner;
/**
*日期：2018年3月5日 下午8:18:14
*@author 龙
*哦吼吼：MinValue1
*描述：输出最小差值的绝对值
**/
public class MinValue1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个数，和数组");
		Scanner s1 = new Scanner(System.in);
		int i, j, result, tmp;
		int n = s1.nextInt();
		int[] squence = new int[n+1];
		for(i = 0; i < n; i++) {
			squence[i] = s1.nextInt();
		}
		
		result = Math.abs(squence[1] - squence[0]);
		for(i = 0; i < n-1; i++) {
			for(j = i+1; j < n; j++) {
				tmp = Math.abs(squence[j] - squence[i]);
				if(tmp < result)
					result = tmp;
			}
		}
		
		System.out.println(result);
		s1.close();
	}

}
