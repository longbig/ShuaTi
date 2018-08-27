package sword.to.offer;


/**
 * @date 2018年8月22日 下午5:27:20
 * @author 龙
 * 类描述：
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)
 * 中找到第一个只出现一次的字符,并返回它的位置, 
 * 如果没有则返回 -1（需要区分大小写）.
 */
public class Main2_14 {

    public int FirstNotRepeatingChar(String str) {
    	char[] alphaArray = str.toCharArray();
    	int[] result = new int[150];
    	
    	for(int i = 0; i < str.length(); i++) {
    		result[alphaArray[i]]++;
    	}
    	
    	for(int i = 0; i < str.length(); i++) {
    		if(result[alphaArray[i]] == 1)
    			return i;
    	}
    	
        return -1;
    }
    
}
