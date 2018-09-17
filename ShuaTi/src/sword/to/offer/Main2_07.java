package sword.to.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    	List<String> result = new ArrayList<>();
        //先按照字典序排个序
    	char[] alphaArray = str.toCharArray();
    	int i = 0;
    	if(str != null && str.length() != 0) {
    		helperPlus(alphaArray, i, result);
        	Collections.sort(result);
    	}
    	return (ArrayList<String>)result;
    }
    
	private void helperPlus(char[] alphaArray, int i, List<String> result) {
		// TODO Auto-generated method stub
		if(i == alphaArray.length - 1) {
			String val = String.valueOf(alphaArray);
			if(!result.contains(val)) {
				result.add(val);
			}
			
		}else {
			for(int j = i; j < alphaArray.length; j++) {
				swap(alphaArray, i, j);
				helperPlus(alphaArray, i + 1, result);
				swap(alphaArray, i, j);
			}
		}
		
	}

	private void swap(char[] alphaArray, int i, int j) {
		// TODO Auto-generated method stub
		char temp = alphaArray[i];
		alphaArray[i] = alphaArray[j];
		alphaArray[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
