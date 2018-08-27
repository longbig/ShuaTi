package sword.to.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
*@date 2018年8月5日 下午4:11:05
*@author 龙
*哦吼吼：Main3_24
*描述：题目描述
请实现一个函数用来找出字符流中第一个只出现一次的字符。
例如，当从字符流中只读出前两个字符"go"时，
第一个只出现一次的字符是"g"。

当从该字符流中读出前六个字符“google"时，
第一个只出现一次的字符是"l"。

如果当前字符流没有存在出现一次的字符，返回#字符。
*/
public class Main3_14 {
/*    //Insert one char from stringstream
    public void Insert(char ch)
    {
    	data[ch - '\0']++;
    	if(data[ch - '\0'] == 1) {
    		charArray.add(ch);
    	}
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	int len = charArray.size();
    	while(!charArray.isEmpty() && data[charArray.peek() - '\0'] > 1) {
    		charArray.remove();
    	}
    	if(!charArray.isEmpty())
    		return charArray.peek();
    	return '#';
    }
    
    private int[] data = new int[255];
    private Queue<Character> charArray = new LinkedList<>();*/
	
	//简单解法
	private String charArray = new String();
	private int[] data = new int[256];
    public void Insert(char ch)
    {
        charArray += ch;
        data[ch]++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	for(int i = 0; i < charArray.length(); i++) {
    		if(data[charArray.charAt(i)] == 1)
    			return charArray.charAt(i);
    	}
    	return '#';
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main3_14 test = new Main3_14();
		test.Insert('a');
		test.Insert('b');
		test.Insert('a');
		test.Insert('b');
		System.out.println(test.FirstAppearingOnce());
	}

}
