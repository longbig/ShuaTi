package sword.to.offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @date 2018年9月1日 下午9:00:32
 * @author 龙
 * 类描述：滑动窗口的最大值
 */
public class Main4_04 {

/*    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
    	ArrayList<Integer> list = new ArrayList<>();
    	if(num == null || num.length == 0 || size < 1)
    		return list;
    	
        int start = 0;
        int end = size;
        for(; start <= num.length - size; start++, end++) {
        	int max = num[start];
        	for(int i = start; i < end; i++) {
        		if(num[i] > max)
        			max = num[i];
        	}
        	list.add(max);
        }
        
        return list;
    }*/
	
	//使用双端队列的方法，时间复杂度O(n)
	public ArrayList<Integer> maxInWindows(int [] num, int size){
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		ArrayList<Integer> result = new ArrayList<>();
		if(num == null || size < 1)
			return result;
		
		int begin;
		for(int i = 0; i < num.length; i++) {
			begin = i - size + 1;
			if(deque.isEmpty()) {
				deque.add(i);
			}else if(begin > deque.peekFirst()) {
				deque.pollFirst();
			}
			
			while(!deque.isEmpty() && num[i] >= num[deque.peekLast()]) {
				deque.pollLast();
			}
			deque.add(i);
			
			if(begin >= 0) {
				result.add(num[deque.peekFirst()]);
			}
		}
		return result;
		
		
	}
    
}
