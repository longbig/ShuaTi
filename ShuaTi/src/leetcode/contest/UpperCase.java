package leetcode.contest;

import javax.swing.JFrame;

/**
*日期：2018年4月2日 下午3:38:54
*@author 龙
*哦吼吼：UpperCase
*描述：判断一个字符串是否全部为大写
*/
public class UpperCase extends JFrame{
	
	public boolean detectCapitalUse(String word) {
		int count1 = 0,count2 = 0;
		if(word.length() == 1) {
			return true;
		}else {
			for(int i = 0; i < word.length(); i++) {
				if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(i))) {
					count1++;
				}else if(Character.isLowerCase(word.charAt(i))) {
					count2++;
				}
				
			}
			
			if(count1 == word.length() || count2 == word.length() || count1 == 1) {
				return true;
			}else {
				return false;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = new UpperCase().detectCapitalUse("Ueee");
		System.out.println(a);
	}

}
