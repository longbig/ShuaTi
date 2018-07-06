package sword.to.offer;
/**
*日期：2018年7月4日 下午8:28:39
*@author 龙
*哦吼吼：Main3_7
*描述：求1+2+3+...+n，
*要求不能使用乘除法、for、while、if、else、switch、case等
*关键字及条件判断语句（A?B:C）。
**/
public class Main3_7 {
	
	//使用递归，分治的方法解决
    public static int Sum_Solution(int n) {
        if(n == 1)
        	return 1;
        n += Sum_Solution(--n);
        return n;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = Sum_Solution(100);
		System.out.println(sum);
	}

}
