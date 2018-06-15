package alghorithm;

import static alghorithm.util.BinarySearch.*;
/**
*日期：2018年3月25日 下午7:07:08
*@author 龙
*哦吼吼：AscentSquence
*描述：
*题目描述
*对于一个数字序列，请设计一个复杂度为O(nlogn)的算法，
*返回该序列的最长上升子序列的长度，
*这里的子序列定义为这样一个序列U1，U2...，其中Ui < Ui+1，且A[Ui] < A[Ui+1]。
给定一个数字序列A及序列的长度n，请返回最长上升子序列的长度。

测试样例：
[2,1,4,3,1,5,6],7
返回：4
**/
public class AscentSquence {
	
	//返回最长上升子序列的长度
	public static int findLongest(int[] A, int n) {
		int longest[] = new int[n];
		int i = 0, j, max = 0;
		while(i != n) {
			longest[i++] = 1;
		}
		
		for(i = 1; i < n; i++) {
			for(j = 0; j < i; j++) {
				if(A[j] < A[i] && (longest[i] < longest[j] + 1)) {
					longest[i] = longest[j] + 1;
				}
			}
		}
		
		for(i = 0; i < n; i++) {
			if(longest[i] > max)
				max = longest[i];
		}
		return max;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cc = findLongest(new int[] {2,1,4,3,1,5,6}, 7);
		System.out.println("长度：" + cc);
	}

}
