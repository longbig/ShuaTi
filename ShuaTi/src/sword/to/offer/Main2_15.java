package sword.to.offer;

import java.util.Arrays;

/**
 * @date 2018年8月22日 下午6:04:02
 * @author 龙
 * 类描述：数组中的逆序对
 * 在数组中的两个数字，
 * 如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 
 * 题目保证输入的数组中没有的相同的数字

数据范围：

	对于%50的数据,size<=10^4

	对于%75的数据,size<=10^5

	对于%100的数据,size<=2*10^5
	
示例：
	输入：1,2,3,4,5,6,7,0
	输出：7
 */
public class Main2_15 {
	
    public int InversePairs(int [] array) {
    	if(array.length == 0)
    		return 0;
    	int[] copy = Arrays.copyOf(array, array.length);
    	int count = mergeSort(array, copy, 0, array.length - 1);
    	return count;
    }
    
    //归并排序算法的修改版
	private int mergeSort(int[] array, int[] copy, int low, int high) {
		// TODO Auto-generated method stub
		if(low == high) {
			return 0;
		}
		//归并排序的操作
		int mid = (low + high) / 2;
		int i = mid;
		int j = high;
		int copyPointer = high;
		int leftCount = mergeSort(array, copy, low, mid) % 1000000007;
		int rightCount = mergeSort(array, copy, mid + 1, high) % 1000000007;
		//再就是左右两部分合并前的比较计数
		int count = 0;
		while(i >= low && j > mid) {
			if(array[i] > array[j]) {
				count += j - mid;
				copy[copyPointer--] = array[i--];
			}else {
				copy[copyPointer--] = array[j--];
			}
			
			if(count >= 1000000007) {
				count %= 1000000007;
			}
		}
		//两个数组长度可能不一样，有剩余的直接复制过来
		for(; i >= low; i--) {
			copy[copyPointer--] = array[i];
		}
		for(; j > mid; j--) {
			copy[copyPointer--] = array[j];
		}
		//数组拷贝过去
		for(int k = low; k <= high; k++) {
			array[k] = copy[k];
		}
		
		return (leftCount + rightCount + count) % 1000000007;
	}
}
