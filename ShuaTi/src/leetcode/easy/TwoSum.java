package leetcode.easy;
/**
*日期：2018年3月26日 下午3:26:03
*@author 龙
*哦吼吼：TwoSum
*描述：
*Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]
**/
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	        for(int i = 0; i < nums.length - 1; i++) {
	        	for(int j = i + 1; j < nums.length; j++) {
	        		if((nums[i] + nums[j]) == target) {
	        			result[0] = i;
	        			result[1] = j;
	        			break;
	        		}
	        			
	        	}
	        }
	        return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum tt = new TwoSum();
		int[] num = {2,7,11,15};
		int[] ss = tt.twoSum(num, 9);
		for (int i : ss) {
			System.out.println(i);
			
		}
	}

}
