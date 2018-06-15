package meituan.codeM.contest;

import java.util.Scanner;

/**
*日期：2018年5月28日 上午10:43:31
*@author 龙
*哦吼吼：Main3
*描述：
*题目描述
世界杯就要开始啦！真真正正的战斗从淘汰赛开始，现在我们给出球队之间的胜负概率，来预测每支球队夺冠的可能性。
在接下来的篇幅中，我们将简单介绍淘汰赛阶段的规则。
淘汰赛阶段的90分钟常规时间内（含补时阶段）进球多的球队取胜，
如果参赛双方在90分钟内（含补时阶段）无法决出胜负，将进行上下半场各15分钟的加时赛。
加时赛阶段，如果两队仍未分出胜负，则通过点球大战决出胜者。也就是说，每场比赛，有且仅有一个队能够晋级到下一轮。
淘汰赛共有16支球队参加（小组赛阶段共分8个小组，每组前两名晋级），对阵安排如下。
1/8决赛
A组第一对阵B组第二=胜者1
B组第一对阵A组第二=胜者2
C组第一对阵D组第二=胜者3
D组第一对阵C组第二=胜者4
E组第一对阵F组第二=胜者5
F组第一对阵E组第二=胜者6
G组第一对阵H组第二=胜者7
H组第一对阵G组第二=胜者8
获胜的8个队进入1/4决赛，即所谓“8强”
1/4决赛
胜者1对阵胜者3=胜者A
胜者2对阵胜者4=胜者B
胜者5对阵胜者7=胜者C
胜者6对阵胜者8=胜者D
1/4决赛的4个获胜队进入“4强”
半决赛
胜者A对阵胜者C
胜者B对阵胜者D
半决赛获胜两队进入决赛，失利的两队争夺三名
决赛获胜的队伍就是最后的冠军！

输入描述:
球队会被以1..16进行标号，其分别表示：
1 A组第一；
2 B组第二；
3 C组第一；
4 D组第二；
5 E组第一；
6 F组第二；
7 G组第一；
8 H组第二；
9 B组第一；
10 A组第二；
11 D组第一；
12 C组第二；
13 F组第一；
14 E组第二；
15 H组第一；
16 G组第二。

数据共有16行，每行16个浮点数，第i行第j列的数Fi,j表示i和j进行比赛时i获胜（
		包括常规时间获胜、加时赛获胜以及点球大战获胜）的概率。
对于1 <= i, j <= 16 且 i != j, 满足0 <= Fi,j <= 1, Fi,j + Fj,i = 1；
对于1 <= i <= 16, 满足 Fi,i = 0。

输出描述:
输出一行16个浮点数，用空格隔开，分别表示每只球队获得世界杯的概率，结尾无空格。
绝对误差或相对误差在1e-5之内的解会被判为正确。

示例1
输入
0.000 0.133 0.210 0.292 0.670 0.270 0.953 0.353 0.328 0.128 0.873 0.082 0.771 0.300 0.405 0.455
0.867 0.000 0.621 0.384 0.934 0.847 0.328 0.488 0.785 0.308 0.158 0.774 0.923 0.261 0.872 0.924
0.790 0.379 0.000 0.335 0.389 0.856 0.344 0.998 0.747 0.895 0.967 0.383 0.576 0.943 0.836 0.537
0.708 0.616 0.665 0.000 0.146 0.362 0.757 0.942 0.596 0.903 0.381 0.281 0.294 0.788 0.804 0.655
0.330 0.066 0.611 0.854 0.000 0.687 0.983 0.217 0.565 0.293 0.256 0.938 0.851 0.487 0.190 0.680
0.730 0.153 0.144 0.638 0.313 0.000 0.832 0.526 0.429 0.707 0.414 0.617 0.925 0.638 0.526 0.545
0.047 0.672 0.656 0.243 0.017 0.168 0.000 0.357 0.125 0.307 0.879 0.551 0.641 0.959 0.981 0.465
0.647 0.512 0.002 0.058 0.783 0.474 0.643 0.000 0.325 0.494 0.893 0.064 0.563 0.429 0.501 0.872
0.672 0.215 0.253 0.404 0.435 0.571 0.875 0.675 0.000 0.940 0.053 0.329 0.232 0.280 0.359 0.474
0.872 0.692 0.105 0.097 0.707 0.293 0.693 0.506 0.060 0.000 0.040 0.776 0.589 0.704 0.018 0.968
0.127 0.842 0.033 0.619 0.744 0.586 0.121 0.107 0.947 0.960 0.000 0.486 0.266 0.662 0.374 0.698
0.918 0.226 0.617 0.719 0.062 0.383 0.449 0.936 0.671 0.224 0.514 0.000 0.821 0.027 0.415 0.227
0.229 0.077 0.424 0.706 0.149 0.075 0.359 0.437 0.768 0.411 0.734 0.179 0.000 0.841 0.409 0.158
0.700 0.739 0.057 0.212 0.513 0.362 0.041 0.571 0.720 0.296 0.338 0.973 0.159 0.000 0.935 0.765
0.595 0.128 0.164 0.196 0.810 0.474 0.019 0.499 0.641 0.982 0.626 0.585 0.591 0.065 0.000 0.761
0.545 0.076 0.463 0.345 0.320 0.455 0.535 0.128 0.526 0.032 0.302 0.773 0.842 0.235 0.239 0.000
输出
0.0080193239 0.1871963989 0.0797523190 0.1233859685 0.0836167329 0.0438390981 
0.0079035829 0.0604644891 0.0237087902 0.0050549016 0.1149551151 0.0679247259 
0.0511307364 0.0395744604 0.0800843771 0.0233889799
说明
注意：输入输出样例在小屏幕页面上可能被自动换行显示了，实际上是严格单行16个数字的
**/

/*
 * 解题思路，逻辑比较简单，就是计算较多，有点复杂罢了
 * 创建A[17],B[17],C[17],D[17]四个数组，分别记录
 * 进   8强，   4强，  2强，  冠军   的每只队伍的概率，
 * 这样在8进4时，1号队伍进4强的概率为：A[1]*(A[3]*f(1,3) + A[4]*f(1,4))后面类似，
 * 当然最简单粗暴地就是把单个队伍夺冠的公式写出来，虽然很长。。。
 */
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Scanner scanner = new Scanner(System.in);
		float[][] team = new float[17][17];
		for(i = 1; i < 17; i++) {
			for(j = 1; j < 17; j++) {
				team[i][j] = scanner.nextFloat();
			}
		}
		
/*		float[][] team = {
				{0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F, 0.000F},
				{0.000F, 0.000F, 0.133F, 0.210F, 0.292F, 0.670F, 0.270F, 0.953F, 0.353F, 0.328F, 0.128F, 0.873F, 0.082F, 0.771F, 0.300F, 0.405F, 0.455F},
				{0.000F, 0.867F, 0.000F, 0.621F, 0.384F, 0.934F, 0.847F, 0.328F, 0.488F, 0.785F, 0.308F, 0.158F, 0.774F, 0.923F, 0.261F, 0.872F, 0.924F},
				{0.000F, 0.790F, 0.379F, 0.000F, 0.335F, 0.389F, 0.856F, 0.344F, 0.998F, 0.747F, 0.895F, 0.967F, 0.383F, 0.576F, 0.943F, 0.836F, 0.537F},
				{0.000F, 0.708F, 0.616F, 0.665F, 0.000F, 0.146F, 0.362F, 0.757F, 0.942F, 0.596F, 0.903F, 0.381F, 0.281F, 0.294F, 0.788F, 0.804F, 0.655F},
				{0.000F, 0.330F, 0.066F, 0.611F, 0.854F, 0.000F, 0.687F, 0.983F, 0.217F, 0.565F, 0.293F, 0.256F, 0.938F, 0.851F, 0.487F, 0.190F, 0.680F},
				{0.000F, 0.730F, 0.153F, 0.144F, 0.638F, 0.313F, 0.000F, 0.832F, 0.526F, 0.429F, 0.707F, 0.414F, 0.617F, 0.925F, 0.638F, 0.526F, 0.545F},
				{0.000F, 0.047F, 0.672F, 0.656F, 0.243F, 0.017F, 0.168F, 0.000F, 0.357F, 0.125F, 0.307F, 0.879F, 0.551F, 0.641F, 0.959F, 0.981F, 0.465F},
				{0.000F, 0.647F, 0.512F, 0.002F, 0.058F, 0.783F, 0.474F, 0.643F, 0.000F, 0.325F, 0.494F, 0.893F, 0.064F, 0.563F, 0.429F, 0.501F, 0.872F},
				{0.000F, 0.672F, 0.215F, 0.253F, 0.404F, 0.435F, 0.571F, 0.875F, 0.675F, 0.000F, 0.940F, 0.053F, 0.329F, 0.232F, 0.280F, 0.359F, 0.474F},
				{0.000F, 0.872F, 0.692F, 0.105F, 0.097F, 0.707F, 0.293F, 0.693F, 0.506F, 0.060F, 0.000F, 0.040F, 0.776F, 0.589F, 0.704F, 0.018F, 0.968F},
				{0.000F, 0.127F, 0.842F, 0.033F, 0.619F, 0.744F, 0.586F, 0.121F, 0.107F, 0.947F, 0.960F, 0.000F, 0.486F, 0.266F, 0.662F, 0.374F, 0.698F},
				{0.000F, 0.918F, 0.226F, 0.617F, 0.719F, 0.062F, 0.383F, 0.449F, 0.936F, 0.671F, 0.224F, 0.514F, 0.000F, 0.821F, 0.027F, 0.415F, 0.227F},
				{0.000F, 0.229F, 0.077F, 0.424F, 0.706F, 0.149F, 0.075F, 0.359F, 0.437F, 0.768F, 0.411F, 0.734F, 0.179F, 0.000F, 0.841F, 0.409F, 0.158F},
				{0.000F, 0.700F, 0.739F, 0.057F, 0.212F, 0.513F, 0.362F, 0.041F, 0.571F, 0.720F, 0.296F, 0.338F, 0.973F, 0.159F, 0.000F, 0.935F, 0.765F},
				{0.000F, 0.595F, 0.128F, 0.164F, 0.196F, 0.810F, 0.474F, 0.019F, 0.499F, 0.641F, 0.982F, 0.626F, 0.585F, 0.591F, 0.065F, 0.000F, 0.761F},
				{0.000F, 0.545F, 0.076F, 0.463F, 0.345F, 0.320F, 0.455F, 0.535F, 0.128F, 0.526F, 0.032F, 0.302F, 0.773F, 0.842F, 0.235F, 0.239F, 0.000F}
		};*/
		
		//创建存放进8，4，2，冠军的16个队伍概率的数组
		float[] A = new float[17];
		float[] B = new float[17];
		float[] C = new float[17];
		float[] D = new float[17];
		
		//进8强的概率
		for(i = 1; i < 17; i++) {
			for(j = 1; j < 17; j++) {
				if(i % 2 == 0) {
					A[i] = team[i][i - 1];
				}else {
					A[i] = team[i][i + 1];
				}
			}
		}
		//进4强的概率
		for(i = 1; i < 17; i++) {
			if(i % 4 == 1) {
				B[i] = A[i] * (A[i+2] * team[i][i+2] + A[i+3] * team[i][i+3]);
			}else if( i % 4 == 2) {
				B[i] = A[i] * (A[i+1] * team[i][i+1] + A[i+2] * team[i][i+2]);
			}else if( i % 4 == 3) {
				B[i] = A[i] * (A[i-2] * team[i][i-2] + A[i-1] * team[i][i-1]);
			}else if(i % 4 == 0){
				B[i] = A[i] * (A[i-3] * team[i][i-3] + A[i-2] * team[i][i-2]);
			}
		}
		
		//进2强的概率
		for(i = 1; i < 17; i++) {
				if(i <= 4 && i >= 1) {
					C[i] = B[i] * (B[5] * team[i][5] + B[6] * team[i][6] 
									+ B[7] * team[i][7] + B[8] * team[i][8]);
				}else if(i >= 5 && i <= 8){
					C[i] = B[i] * (B[1] * team[i][1] + B[2] * team[i][2]
									+ B[3] * team[i][3] + B[4] * team[i][4]);
				}else if(i >= 9 && i <= 12) {
					C[i] = B[i] * (B[13] * team[i][13] + B[14] * team[i][14] 
							+ B[15] * team[i][15] + B[16] * team[i][16]);
				}else if(i >= 13 && i <= 16){
					C[i] = B[i] * (B[9] * team[i][9] + B[10] * team[i][10] 
							+ B[11] * team[i][11] + B[12] * team[i][12]);
				}
			}

		//夺冠的概率
		for(i = 1; i < 17; i++) {
			if(i <= 8 && i >= 1) {
				for(j = 9; j <= 16; j++) {
					D[i] += C[i] * (C[j] * team[i][j]);
				}
			}else {
				for(j = 1; j <= 8; j++) {
					D[i] += C[i] * (C[j] * team[i][j]);
				}
			}
		}
		//输出，测试完全通过
		for (i = 1; i < 17; i++) {
			if(i == 1) {
				System.out.print(D[i]);
			}else {
				System.out.print(" " + D[i]);
			}
		}
	}

}
