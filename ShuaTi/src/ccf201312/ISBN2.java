package ccf201312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*日期：2018年3月17日 下午8:58:38
*@author 龙
*哦吼吼：ISBN2
*描述：
**/
public class ISBN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bin = new BufferedReader(
				new InputStreamReader(System.in));
		
		try {
			String isbn_0 = bin.readLine();
			//将“-”替换为无
			String isbn = isbn_0.replace("-", "");
			int ii, i, sum = 0;
			char cc='0';
			
			//将字符型数据转为整型数据
			for(i = 0; i < 9; i++) {
				ii = (int)isbn.charAt(i) - 48; //'0'的ASCII码为48
				sum += ii * (i+1);
			}
			
			sum %= 11;
			if(sum == 10) {
				cc = 'X';
			}else {
				cc = (char)(sum + 48);
			}
			
			if(cc==isbn.charAt(9)) {
				System.out.println("Right");
			}else {
				System.out.println(isbn_0.substring(0, 12) + cc);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
