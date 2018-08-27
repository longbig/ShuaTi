package sword.to.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
*日期：2018年4月27日 上午11:39:51
*@author 龙
*哦吼吼：Main3_3
*
*描述：汇编语言中有一种移位指令叫做循环左移（ROL），
*现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
*对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
*例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
*即“XYZdefabc”。
*是不是很简单？OK，搞定它！
**/
public class Main3_03 {
	
	//定义左移一位的函数
	public static String LeftOneString(String str) {
		Queue<Character> qq = new LinkedList();
		int length = str.length();
		for(int i = 0; i < length; i++) {
			qq.offer(str.charAt(i));
		}
		char temp = qq.poll();
		qq.offer(temp);
		
		char[] bb = new char[length];
		for(int i = 0; i < length; i++) {
			bb[i] = qq.poll();
		}
		String ss = new String(bb);
		
		return ss;
	}
	
    public static String LeftRotateString(String str,int n) {
    	if(str!=null) {
        	while(n-- > 0) {
        		str = LeftOneString(str);
        	}
            return str;
    	}else {
    		return "";
    	}
    }
    
    //牛科上超简单的解法
    public static String LeftRotateString1(String str, int n) {
    	int length = str.length();
    	if(length == 0)
    		return str;
    	n = n % length;
    	str += str;
    	/**
    	 * 错误点，注意长度要 + n，结尾地址为n+length;
    	 */
    	str = str.substring(n, length+n);
    	return str;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = new String();
		String s1 = LeftRotateString1(ss, -3);
		System.out.println(s1);
	}

}
