package ping2.duo.duo;

import java.util.Scanner;

/**
 * @date 2018年8月31日 上午8:49:40
 * @author 龙
 * 类描述：给个HP，给个正常攻击，和蓄力攻击(2回合攻击一次)
 * 	问打完HP最少的回合数；
 * 
 * 注意最后剩一丝血的时候判断是否普通攻击解决
 */
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int hp = input.nextInt();
		int normalAttack = input.nextInt();
		int buffedAttack = input.nextInt();
		int count = 0;
		//判断
		if(2 * normalAttack < buffedAttack) {
			count = hp / buffedAttack;
			hp = hp - count * buffedAttack;
			count *= 2;
			if(hp != 0) {
				//普通攻击一击可以打完HP时
				if(hp <= normalAttack)
					count++;
				else
					count += 2;
			}
		}
		//一直用正常攻击的情况
		else {
			count = hp / normalAttack;
			hp = hp % normalAttack;
			if(hp != 0)
				count++;
		}
		
		System.out.println(count);
	}

}
