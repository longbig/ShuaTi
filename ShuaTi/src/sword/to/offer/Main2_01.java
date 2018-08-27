package sword.to.offer;

import java.util.ArrayList;
import java.util.Stack;
/**
*@date 2018年8月20日 下午4:19:54
*@author 龙
*哦吼吼：Main2_01
*描述：栈的压入，弹出序列；
*/
public class Main2_01 {
	
	  //该种方法不可取，测试数据报错
/*    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int head = popA[0];
        int point = 0;
        for(int i = 0; i < pushA.length; i++) {
        	if(head == pushA[i])
        		point = i;
        }
        System.out.println(point);
        //计算
        for(int j = 0; j < popA.length; j++) {
        	if(popA[j] == pushA[point]) {
        		point--;
        	}
        }
        System.out.println(point);
        if(point == -1)
        	return true;
        return false;
    }*/
    
    //借助辅助栈实现即可；
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	if(pushA.length == 0 || popA.length == 0)
    		return false;
    	//弹出队列指针
    	int popIndex = 0;
    	//辅助栈
    	Stack<Integer> stack = new Stack<>();
    	//压入辅助栈
    	for(int i = 0; i < pushA.length; i++) {
    		stack.push(pushA[i]);
    		//如果栈顶元素与弹出序列队首一样，则可弹出,同时指针后移
    		while(!stack.empty() && stack.peek() == popA[popIndex]) {
    			stack.pop();
    			popIndex++;
    		}
    	}
    	return stack.empty();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2_01 test = new Main2_01();
		int[] pushA = {1,2,3,4,5,6,7,8};
		int[] popA = {4,5,3,2,1,8,7,6};
		boolean rs = test.IsPopOrder(pushA, popA);
		System.out.println(rs);
	}

}
