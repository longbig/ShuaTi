package nowcoder.contest;

import java.util.Scanner;

/**
*日期：2018年5月18日 下午7:33:48
*@author 龙
*哦吼吼：Train1_2
*描述：输入多边形的顶点坐标,判断是顺时针还是逆时针?
*

输入描述:
输入包含N + 1行。
第一行包含一个整数N，表示简单多边形的顶点数。
在下面的N行中，第i行包含两个整数xi，yi，表示简单多边形中的第i个顶点的坐标。
输出描述:
如果简单多边形按顺时针顺序给出，则在一行中输出“clockwise”（不带引号）。 
否则，打印"counterclockwise''（不带引号）。

关于如何判定多边形是顺时针还是逆时针对于凸多边形而言，
只需对某一个点计算cross product = ((xi - xi-1),(yi - yi-1)) x ((xi+1 - xi),(yi+1 - yi)) 
   = (xi - xi-1) * (yi+1 - yi) - (yi - yi-1) * (xi+1 - xi)

如果上式的值为正，逆时针；为负则是顺时针

而对于一般的简单多边形，则需对于多边形的每一个点计算上述值，如果正值比较多，是逆时针；负值较多则为顺时针。

输入
3
0 0
1 0
0 1
输出
counterclockwise


**/
public class Train1_2 {
	
	//判断某一点的计算值是否为负;
	public static boolean isClock(int x0,int y0, int x1, int y1, int x2, int y2) {
		int cross = (x1 - x0) * (y2 - y1) - (y1 - y0) * (x2 - x1);
		if(cross < 0) 
			return true;
		else
			return false;
	}
	
/**
	 * 其他方法
d=0;
for(int i=0;i<n-1;i++)
{
    d+= －0.5*(y[i+1]+y[i])*(x[i+1]-x[i]);
}
if(d>0)
    std::cout<<"counter clockwise"<<std::endl;
else
    std::cout<<"clockwise"<<std::endl;
* @param args
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] location = new int[n][2];
		for(int i = 0; i < n; i++) {
			location[i][0] = scanner.nextInt();
			location[i][1] = scanner.nextInt();
		}
/*		
		int clock = 0, counter = 0;
		for(int i = 1; i < n-1; i++) {
			if(isClock(location[i-1][0], location[i-1][1], location[i][0], location[i][1], location[i+1][0], location[i+1][1])) {
				clock++;
			}else {
				counter++;
			}
		}
		if(clock > counter)
			System.out.println("clockwise");
		else 
			System.out.println("counterclockwise");*/
		
		//方法二
		float d = 0;
		for(int i = 0; i < n-1; i++) {
			d += -(location[i+1][1] + location[i][1]) * (location[i+1][0] - location[i][0]) / 2;
		}
		if(d > 0)
			System.out.println(d + "counterclockwise");
		else 
			System.out.println(d + "clockwise");
	}

}
