package sword.to.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*日期：2018年7月6日 下午4:03:36
*@author 龙
*哦吼吼：Main2_08
*描述：
*题目描述
数组中有一个数字出现的次数超过数组长度的一半，
请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，
因此输出2。
如果不存在则输出0。
**/
public class Main2_08 {
	/**
	 * 思路：去掉两个不同的数，最后剩下的数为所求
	 * @param array
	 * @return
	 */
    public static int MoreThanHalfNum_Solution(int [] array) {

        //数组值作为下标的方法不可行，因为可能有负数，故使用去两个不同
    	int length = array.length;
    	if(length == 0)
    		return 0;
    	
    	int aimNum = array[0], count = 1;
    	for(int i = 1; i < length; i++) {
    		if(array[i] == aimNum)
    			count++;
    		else
    			count--;
    		if(count == 0) {
    			aimNum = array[i];
    			count = 1;
    		}
    	}
    	//可能不足1/2length
    	count = 0;
    	for(int i = 0; i < length; i++) {
    		if(array[i] == aimNum)
    			count++;
    	}
    	if(count * 2 > length)
    		return aimNum;
    	return 0;
    }
    
    //新思路：对数组排序，如果存在大于1/2l的值，则中点值是目标
    //计算中点值的个数，大于1/2L为所求
    public static int MoreThanHalfNum_Solution1(int [] array) {
    	Arrays.sort(array);
    	int count = 0, length = array.length;
    	for(int i = 0; i < length; i++) {
    		if(array[i] == array[length / 2]) {
    			count++;
    		}
    	}
    	if(count * 2 > length)
    		return array[length / 2];
    	return 0;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-1,-2,-3,-2,-2,-2,-5,-4,-2};
		System.out.println(MoreThanHalfNum_Solution1(array));
	}

}
