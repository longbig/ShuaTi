package sword.to.offer;
/**
 * @date 2018年9月1日 下午4:17:02
 * @author 龙
 * 类描述：数据流中的中位数
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main4_03 {
/*
	List<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
    	int size = list.size();
    	if(size == 0) {
    		return 0d;
    	}
    	double result = 0d;
        int[] array = list.stream().mapToInt(p -> p.intValue()).toArray();
        Arrays.sort(array);
        if(size % 2 != 0) {
        	result = array[size / 2];
        }else {
        	result = ((double)array[size / 2] + (double)array[size/2 - 1]) / 2;
        }
        return result;
    }*/
	
	//好的解法，利用大小堆的性质，小堆中放大数，大堆中放小数，这样顶部元素就是中位数
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	@SuppressWarnings("unchecked")
	PriorityQueue<Integer> maxHeap = new PriorityQueue(new Comparator<Integer>() {
		@Override
		public int compare(Integer a, Integer b) {
			// TODO Auto-generated method stub
			return b - a;
		}
	});
	private int count = 0;
	
    public void Insert(Integer num) {
    	//奇偶是为了存放大小堆数目一样
        if(count % 2 == 0) {
        	minHeap.offer(num);
        	int minNumber = minHeap.poll();
        	maxHeap.offer(minNumber);
        }else {
        	maxHeap.offer(num);
        	int maxNumber = maxHeap.poll();
        	minHeap.offer(maxNumber);
        }
        count++;
    }

    public Double GetMedian() {
    	if(count % 2 == 0)
    		return new Double(minHeap.poll() + maxHeap.poll()) / 2;
    	else
    		return new Double(minHeap.poll());
    }
    
}
