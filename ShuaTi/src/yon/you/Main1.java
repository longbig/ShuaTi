package yon.you;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @date 2018年9月10日 下午3:38:47
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		String[] arrays = data.split(" ");
		ArrayList<String> arr = new ArrayList<>();
		String regex = "^[0-9][1-9]([0-9][1-9])*$";
		for (String string : arrays) {
			if(string.matches(regex))
				arr.add(string);
		}
		Collections.sort(arr);
		//remove
		//没有前驱节点就移除
		int[] flag = new int[arr.size()];
		for(int i = 0; i < arr.size(); i++) {
			String temp = arr.get(i);
			if(temp.length() > 2) {
				String pepp = temp.substring(0, temp.length() - 2);
				if(!arr.contains(pepp))
					arr.set(i, "");
			}
		}
		
		//out
		for (String string:arr) {
			
			int count = (string.length() - 2) / 2;
			String dd = "";
			while(count-- != 0) {
				dd += "\t";
			}
			System.out.println(dd + string);
			
		}
	}

}
