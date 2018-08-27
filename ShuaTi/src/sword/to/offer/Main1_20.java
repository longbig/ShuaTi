package sword.to.offer;

import java.util.Stack;
/**
*日期：2018年7月10日 下午3:53:21
*@author 龙
*哦吼吼：Main1_20
*描述：定义栈的数据结构，
*请在该类型中实现一个能够得到栈中所含最小元素的min函数。

*/

/**
 * 
 * @author 龙
 *思路：

思路：用一个栈data保存数据，用另外一个栈min保存依次入栈最小的数
比如，data中依次入栈，5,  4,  3, 8, 10, 11, 12, 1
       则min依次入栈，5,  4,  3，no,no, no, no, 1
 
no代表此次不如栈
每次入栈的时候，如果入栈的元素比min中的栈顶元素小或等于则入栈，否则不如栈。
这样在min的栈顶元素为最小元素；省去了遍历的麻烦；
 */
public class Main1_20 {
	Stack<Integer> data = new Stack<>();
	Stack<Integer> min = new Stack<>();
	Integer temp = null;
	
    public void push(int node) {
       if(temp != null) {
    	   if(node <= temp) {
    		   temp = node;
    		   min.push(node);
    	   }
    	   data.push(node);
       }else {
    	   temp = node;
    	   data.push(node);
    	   min.push(node);
       }
    }
    
    public void pop() {
        int number1 = data.pop();
        int number2 = min.pop();
        if(number1 != number2) {
        	min.push(number2);
        }
    }
    
    public int top() {
    	return min.peek();
    }
    
    public int min() {
        return min.peek();
    }
	
	//上述方法的缺点是用了Java里的栈，没什么意义，自己写个栈吧
/*    public void push(int node) {
        
    }
    
    public void pop() {
        
    }
    
    public int top() {
        
    }
    
    public int min() {
        
    }*/
    
    
	
	
	
	
}
