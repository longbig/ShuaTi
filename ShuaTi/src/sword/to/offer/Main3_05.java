package sword.to.offer;

import java.util.Arrays;

/**
 * @date 2018年8月27日 下午4:50:02
 * @author 龙
 * 类描述：扑克牌顺序,确定了5张
 */
public class Main3_05 {

    public static boolean isContinuous(int [] numbers) {
    	if(numbers.length != 5)
    		return false;
    	//不用排序的方法
    	int max = -1;
    	int min = 14;
    	
    	for(int i = 0; i < 5; i++) {
    		int number = numbers[i];
    		if(number < 0 || number > 13)
    			return false;
    		if(number == 0)
    			continue;
    		if(max < number)
    			max = number;
    		if(min > number)
    			min = number;
    		if(max - min > 4)
    			return false;
    	}
    	
    	//是否有重复非0元素
    	for(int i = 0; i < 4; i++) {
    		for(int j = i+1; j < 5; j++) {
    			if(numbers[i] == numbers[j] && numbers[i] != 0)
    				return false;
    		}
    	}
    	//zhen
    	return true;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,5,3,0};
		System.out.println(isContinuous(numbers));
	}

}
