package sword.to.offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @date 2018年8月22日 下午4:31:07
 * @author 龙
 * 类描述：输入一个字符串,
 * 按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母
 */
public class Main2_07 {

    public ArrayList<String> Permutation(String str) {
        //先按照字典序排个序
    	char[] alphaArray = str.toCharArray();
    	int length = str.length();
    	Arrays.sort(alphaArray);
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
