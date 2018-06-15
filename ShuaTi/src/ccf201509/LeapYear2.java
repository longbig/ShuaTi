package ccf201509;

import java.util.Scanner;

/**
*日期：2018年3月17日 下午8:14:14
*@author 龙
*哦吼吼：LeapYear2
*描述：
**/
public class LeapYear2 {
	//设置一个函数判断是否为闰年
	private static int isleapyear(int year) {
		return ((year % 4 == 0 && year % 100 !=0)||(year % 400 == 0)) ? 1:0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		int d = scanner.nextInt();
		
		//数组记录平年每月天数
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int day = 0, month = 0, i;
		//闰年时二月天数加1
		days[1] += isleapyear(y);
		
		//使用天数逐月减去1月天数、2月天数...的办法求得月份和日期；
		i = 0;
		while(d > 0) {
			//减到小于当月天数时退出循环；
			if(d <= days[i]) {
				month = i + 1;
				day = d;
				break;
			}else {
				d -= days[i];
				i++;
			}
		}
		
		System.out.println(month);
		System.out.println(day);
	}

}
