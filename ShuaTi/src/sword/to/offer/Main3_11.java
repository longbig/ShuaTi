package sword.to.offer;

import com.sun.javafx.image.IntPixelAccessor;

/**
*日期：2018年7月3日 下午8:09:21
*@author 龙
*哦吼吼：Main3_11
*描述：
*给定一个数组A[0,1,...,n-1],
*请构建一个数组B[0,1,...,n-1],
*其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
*不能使用除法
**/
public class Main3_11 {
	//自己的方法
    public static int[] multiply(int[] A) {
    	int length = A.length;
    	int[] B = new int[length];
    	for(int i = 0; i <length; i++) {
    		B[i] = 1;
    	}
    	for(int i = 0; i < length; i++) {
    		for(int j = 0; j < length; j++) {
    			if(j != i) 
    				B[i] *= A[j]; 
    		}
    	}
    	return B;
    }
    
    //简直offer上的解法，分为上三角形和下三角形
    public static int[] multiply1(int[] A) {
    	int length = A.length;
    	int[] B = new int[length];
    	//先计算下三角形
    	B[0] = 1;
    	for(int i = 1; i < length; i++) {
    		B[i] = B[i - 1] * A[i - 1];
    	}
    	//计算上三角形，从倒数第2行往上计算
    	int temp = 1;
    	for(int j = length -2; j >= 0; j--) {
    		temp *= A[j+1];
    		B[j] *= temp;
    	}
    	
    	return B;
    		
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,4,2};
		int[] B = multiply1(A);
		for (int i : B) {
			System.out.println(i);
		}
	}

}
