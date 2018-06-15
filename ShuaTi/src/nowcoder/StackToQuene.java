package nowcoder;

import java.util.Stack;

/**
*日期：2018年3月26日 下午4:15:30
*@author 龙
*哦吼吼：StackToQuene
*描述：使用两个栈来完成一个队列
**/
public class StackToQuene {
	
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack1.isEmpty() && stack2.empty()) {
    		throw new RuntimeException("the stack is empty");
    	}
    	if(stack2.empty()) {
    		while(!stack1.empty()) {
    			stack2.push(stack1.pop());
    		}
    	}
    	return stack2.pop();
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
