package sword.to.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
*日期：2018年4月27日 上午10:47:00
*@author 龙
*哦吼吼：Main2_9
*
*描述：输入n个整数，找出其中最小的K个数。
*例如输入4,5,1,6,2,7,3,8这8个数字，
*则最小的4个数字是1,2,3,4,。
**/
public class Main2_9 {
	
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> result = new ArrayList<>();
        /**
         * 错误点，没有考虑到k > 数组长度，和k=0的情况；
         */
        if(k > input.length || k == 0) {
        	return result;
        }else {
        	for(int i = 0; i < k; i++) {
        		result.add(input[i]);
        	}
        }
        return result;
    }
    
    
    //牛客上的解法，使用了优先队列；
    public static ArrayList<Integer> GetLeastNumbers_Solution1(int [] input, int k) {
    	ArrayList<Integer> result = new ArrayList();
    	int len = input.length;
    	if(k > len || k == 0) {
    		return result;
    	}
    	
    	@SuppressWarnings("unchecked")
		PriorityQueue<Integer> maxHeap = new PriorityQueue(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
    	
    	for(int i = 0; i < len; i++) {
    		if(maxHeap.size() != k) {
    			maxHeap.offer(input[i]);
    		}else if(maxHeap.peek() > input[i]) {
    			Integer temp = maxHeap.poll();
    			maxHeap.offer(input[i]);
    		}
    	}
    	for (Integer integer : maxHeap) {
			result.add(integer);
		}
    	return result;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,5,1,6,2,7,3,8};
		ArrayList<Integer> rIntegers  = GetLeastNumbers_Solution1(input, 5);
		for (Integer integer : rIntegers) {
			System.out.println(integer);
		}
	}

}
