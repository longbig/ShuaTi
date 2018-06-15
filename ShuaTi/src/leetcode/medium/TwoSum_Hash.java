package leetcode.medium;

import java.util.HashMap;

/**
*日期：2018年5月25日 下午9:22:02
*@author 龙
*哦吼吼：TwoSum_Hash
*描述：Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, 
where index1 must be less than index2. 
Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2


**/
public class TwoSum_Hash {
	
	//用到的函数，输出结果放在这个函数里
/*    public static int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        for(int i = 0; i < numbers.length - 1; i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		if(numbers[i] + numbers[j] == target) {
        			index[0] = i + 1;
        			index[1] = j + 1;
        		}
        	}
        }
        return index;
    }*/
    
	//使用HashMap,因为学了hash map就要用嘛，上述方法放弃
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		/*
		 * 注意是将差值放入Map中。。。
		 * 每次都检查后面的序列是否存在和前面组成target的差值，
		 * 将数组里的值作为K，将下标作为V
		 */
		int[] result = new int[2];
		for(int i = 0; i < numbers.length; i++) {
			if(map.containsKey(numbers[i])) {
				result[0] = map.get(numbers[i]) + 1;
				result[1] = i + 1;
			}else {
				map.put(target - numbers[i], i);
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2, 7, 11, 15,23, -12, 0, 34, 4, 4};
		int target = 8;
		int[] result = twoSum(numbers, target);
		for (int i : result) {
			System.out.println(i);
		}
	}

}
