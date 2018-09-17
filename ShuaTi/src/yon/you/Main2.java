package yon.you;

import java.util.Scanner;

/**
 * @date 2018年9月10日 下午3:39:02
 * @author 龙
 * 类描述：最大连续数字个数及起始数字
 */
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		String[] arrays = data.split(" ");
		int[] numbers = new int[arrays.length];
		for(int i = 0; i < arrays.length; i++) {
			numbers[i] = Integer.parseInt(arrays[i]);
		}
		//out
		int max = 0;
		int current = 0;
		int current2 = 0;
		int count = 1;
		boolean flag = true;
		for(int i = 0; i < numbers.length - 1; i++) {
			if(numbers[i] + 1 == numbers[i + 1]) {
				//记录起点
				if(flag) {
					current = i;
					flag = false;
				}
				count++;
				if(count > max) {
					current2 = current;
					max = count;
				}
				
			}else {
				//不是连续的话
				count = 1;
				flag = true;
			}
		}
		//out
		System.out.println("[" + numbers[current2] + "," + max + "]");
	}

}
