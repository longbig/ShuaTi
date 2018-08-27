package sword.to.offer;

import java.util.ArrayList;

/**
 * @date 2018年8月24日 上午11:06:14
 * @author 龙
 * 类描述：
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 
 * 输出描述：对应每个测试案例，输出两个数，小的先输出。
 */
public class Main3_02 {
	
	//解题思路：从S/2的位置开始找，设置两个指针
	//保存输出即可
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> twoNumber = new ArrayList();
       //设置头尾两个指针解决
        if(array == null || array.length < 2)
        	return twoNumber;
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
        	if(array[left] + array[right] == sum) {
            	twoNumber.add(array[left]);
            	twoNumber.add(array[right]);
            	break;
            }
            while(array[left] + array[right] > sum && left < right)
            	right--;
            while(array[left] + array[right] < sum && left < right)
            	left++;
        }
        
        return twoNumber;
    }
    
    public static void main(String[] args) {
    	
		int[] array = {1,2,4,7,11,15};
		int sum = 15;
		ArrayList<Integer> result = FindNumbersWithSum(array, sum);
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}
}
