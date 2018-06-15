package zhao.gong.zuo;

import org.junit.Before;
import org.junit.Test;

/**
*日期：2018年3月18日 下午7:49:44
*@author 龙
*哦吼吼：Replace
*描述：将字符串中所有的空格替换20%
**/
public class Replace {
	
	 public String replaceSpace(StringBuffer str) {
	        StringBuffer b = new StringBuffer();
	        for(int i = 0; i < str.length(); i++){
	            char ch = str.charAt(i);
	            if(String.valueOf(ch).equals(' ')){
	                b.append("20%");
	            }else{
	                b.append(ch);
	            }
	        }
	        return b.toString();
	    }
}
	
	
