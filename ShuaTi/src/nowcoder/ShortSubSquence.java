package nowcoder;
/**
*日期：2018年3月28日 上午9:57:43
*@author 龙
*哦吼吼：ShortSubSquence
*描述：
*题目描述
对于一个无序数组A，请设计一个算法，求出需要排序的最短子数组的长度。

给定一个整数数组A及它的大小n，请返回最短子数组的长度。

测试样例：
[1,5,3,4,2,6,7],7
返回：4
*我的思路：先排序好，再与原来的数组对比，取首不同位和尾不同位之间的距离；
*
**/
public class ShortSubSquence {
	
	public static int findShortest(int[] A, int n) {
        // write code here
		/**
		 * 特别注意这里如果直接B = A，
		 * B传递的是A的句柄，A发生改变时，B也会发生改变；
		 * 所以使用for循环拷贝过来
		 */
		int[] B = new int[n];
		for(int i = 0; i < n; i++) {
			B[i] = A[i];
		}
		paixu(A);
		
		/**
		 * 注意这里start和end初始化为0，因为会出现不用排序的情况
		 */
		int i, start =0, end = 0;
		for (i = 0; i < n; i++) {
			if(A[i] != B[i]) {
				start = i;
				break;
			}
		}
		for(i = n-1; i >= 0; i--) {
			if(A[i] == B[i]) {
				continue;
			}else {
				end = i+1;
				break;
			}
		}
		return (end - start);
    }
	
	//设置冒泡排序
	public static void paixu(int[] A) {
		int n = A.length;
		int i, j;
		for(i = 0; i < n-1; i++) {
			for(j = i+1; j < n; j++) {
				if(A[i] > A[j]) {
					int tmp = A[i];
					A[i] = A[j];
					A[j] = tmp;
				}else {
					continue;
				}
			}
		}
	}
	
	//牛客上较好的思路，从前往后遍历，遇到下降趋势的点记录位置，
	//max为下降趋势最后的点；
	//再从后往前遍历，遇到上升趋势的点记录位置，记到最后一个上升点
	//两者之间的距离为结果；
	 public static int findShortest1(int[] A, int n) {
		 int i, k=-1, m=-1;
		 int max = A[0];
		 for(i = 1; i < n; i++) {
			 //下降趋势最后的点
			 if(max > A[i]) {
				 k = i;
			 }else {
				 max = A[i];
			 }
		 }
		 if(k == -1) return 0;
	
		 int min = A[n-1];
		 for(i = n-2; i >= 0; i--) {
			 if(A[i] > min) {
				 m = i;
			 }else {
				 min = A[i];
			 }
		 }
		 return (k - m + 1);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,5,3,4,2,6,7};
		int n = 7;
//		System.out.println(findShortest(A, n));
		System.out.println(findShortest1(A, n));

	}

}
