package nowcoder;

import java.util.ArrayList;
import java.util.concurrent.*;
/**
*日期：2018年3月26日 下午4:47:16
*@author 龙
*哦吼吼：minNumberInRotateArray
*题目：旋转数组的最小数字
*描述：找出旋转数组中最小元素，要求用到ArrayList;
*解题思路：直接找到左边数比右边数大的情况，输出右边的数，测试通过。。。。。
*时间复杂度： < O(n)
**/
public class minNumberInRotateArray {
	
	public static int minNumberInRotateArray(int [] array) {
		for(int i = 0;i < array.length; i++) {
			if(array[i] > array[i + 1]) {
				return array[i + 1];
			}
		}
		return array[0];
    }
	
	//牛客上的解法：二分查找的使用，注意相同时最小元素可左可右，只能将high-1一一尝试
	//时间复杂度：O(log(n));
	public static int minNumberInRotateArray1(int[] array) {
		int low = 0;
		int high = array.length - 1;
		while(low < high) {
			int mid = low + (high - low) / 2;
			if(array[mid] > array[high]) {
				low = mid + 1;
			}else if(array[mid] == array[high]) {
				high--;
			}else {
				high = mid;
			}
		}
		return array[low];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,7,8,9,3,4,5};
		System.out.println(minNumberInRotateArray(array));
		System.out.println(minNumberInRotateArray1(array));
	}

}
