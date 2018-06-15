package leetcode.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
*日期：2018年4月17日 下午3:04:57
*@author 龙
*哦吼吼：ThreeSum_15
*描述：
**/
public class ThreeSum_15 {
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> LL = new ArrayList<>();
		List<Integer> l1 = new ArrayList();
		Set<List<Integer>> ss = new HashSet();
		Iterator<List<Integer>> ii;
		int i,j,k, len = nums.length;
		Arrays.sort(nums);
		for(i = 0; i < len - 2; i++) {
			for(j = i + 1; j < len - 1; j++) {
				for(k = j + 1; k < len; k++) {
					if(nums[i] + nums[j] + nums[k] == 0) {
						l1.add(nums[i]);
						l1.add(nums[j]);
						l1.add(nums[k]);
						ss.add(l1);
						l1 = new ArrayList<Integer>();
						
					}
				}
			}
		}
		ii = ss.iterator();
		while(ii.hasNext()) {
			LL.add(ii.next());
		}
		return LL;    
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, 0, 1,2, -1, -4};
		List<List<Integer>> llList = threeSum(nums);
		for (List<Integer> list : llList) {
			System.out.println(list);
		}
		
	}

}
