package gbits2018;

import java.util.Scanner;

/**
 * @date 2018年9月3日 下午4:12:18
 * @author 龙
 * 类描述：字符排序
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char[] array = str.toCharArray();
		//冒泡排序
		for(int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if((array[i] <='9' && array[j] >= 'a')
						|| (array[i] > array[j] && array[i] <= '9')
						|| (array[i] > array[j] && array[j] >= 'a')) {
					swap(array, i, j);
				}
			}
		}
		
		for (char c : array) {
			System.out.print(c);
		}
	}

	private static void swap(char[] array, int i, int j) {
		// TODO Auto-generated method stub
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
