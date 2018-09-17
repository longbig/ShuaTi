package zi.jie.tiao.dong;

import java.util.Scanner;

/**
 * @date 2018年9月9日 上午11:13:23
 * @author 龙
 * 类描述：
 */
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		//判断
		boolean flag = true;
		
		if(n == 1) {
			int binaryData = array[0] >>> 7;
			if((0 & binaryData) != 0)
				flag = false;
		}else if(n >= 2 && n <= 4) {
			int move = 7 - n;
			
				array[0] = array[0] >>> move;
			if((array[0] & 6) == 6 || (array[0] & 14) == 14 || (array[0] & 30) == 30) {
				for(int i = 1; i < n; i++) {
					array[i] = array[i] >>> 6;
					System.out.println("array[i]:" + array[i]);
					if((array[i] & 2) != 2) {
						flag = false;
						break;
					}
				}
			}
		}else {
			flag = false;
		}
		
		for(int i = 0; i < n; i++) {
			if(array[i] > 255 || array[i] < -256)
				flag = false;
		}
		
		
		if(flag == true)
			System.out.println(1);
		else
			System.out.println(0);
	}

}
