package alghorithm.util;
/**
*日期：2018年3月25日 下午7:58:40
*@author 龙
*哦吼吼：BinarySearch
*描述：二分查找算法，直接作为工具使用
*仅仅适合已经排序好的数组，乱的数组无法使用
**/
public class BinarySearch {
	public static int BinarySearch(int[] arr, int n) {
		int low = 0;
		int high = arr.length;
		while(low < high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] > n) {
				high = mid;
			}else if(arr[mid] < n) {
				low = mid + 1;
			}else {
				return arr[mid];
			}
		}
		System.out.print("No result! return: ");
		return 0;
	}
}
