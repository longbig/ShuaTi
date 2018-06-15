package sword.to.offer;
/**
*日期：2018年5月8日 下午5:03:24
*@author 龙
*哦吼吼：Main2_20
*描述：
*一个整型数组里除了两个数字之外，其他的数字都出现了两次。
*请写程序找出这两个只出现一次的数字。
**/
public class Main2_20 {
	
	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int len = array.length;
        int i,j = 0;
        int[] array1 = new int[10000000];
        int[] zz = new int[2];
        
        for(i = 0; i < len; i++) {
        	array1[array[i]]++;
        }
        for(i = 0; i < array1.length; i++) {
        	if(array1[i] == 1) {
        		zz[j++] = i;
        	}
        }
        num1[0] = zz[0];
        num2[0] = zz[1];
        System.out.println(num1[0] + " " + num2[0]);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,9,2,2,3,3,4,4,5,424,9,5};
		int num1[] = new int[1];
		int num2[] = new int[1];
		FindNumsAppearOnce(array, num1, num2);
	}

}
