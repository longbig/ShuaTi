package sword.to.offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @date 2018年8月22日 下午5:17:16
 * @author 龙
 * 类描述：输入n个整数，
 * 找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4,。
 */
public class Main2_09 {
	
	//全排序的方法解
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList();
        if(input.length == 0 || k > input.length)
        	return result;
        
        Arrays.sort(input);
        for(int i = 0; i < k; i++) {
        	result.add(input[i]);
        }
        return result;
    }
}
