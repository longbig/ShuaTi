package zhao.yin.card;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @date 2018年9月16日 下午8:03:49
 * @author 龙
 * 类描述：
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String children = in.nextLine();
		String candys = in.nextLine();
		String[] array1 = children.split("\\s");
		String[] array2 = candys.split("\\s");
		int[] childs = new int[array1.length];
		int[] candy = new int[array2.length];
		//保存数据
		for(int i = 0; i < array1.length; i++) {
			childs[i] = Integer.parseInt(array1[i]);
		}
		for(int i = 0; i < array2.length; i++) {
			candy[i] = Integer.parseInt(array2[i]);
		}
		
		Arrays.sort(childs);
		Arrays.sort(candy);
		
		int i = 0, j = 0, count = 0;
		while(i != childs.length && j != candy.length) {
			if(candy[j] >= childs[i]) {
				count++;
				j++;
				i++;
			}else {
				j++;
			}
		}
		System.out.println(count);
		
	}

}
