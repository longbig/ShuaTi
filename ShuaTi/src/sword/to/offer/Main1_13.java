package sword.to.offer;
/**
*日期：2018年7月5日 下午8:11:25
*@author 龙
*哦吼吼：Main1_13
*描述：
*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
*使得所有的奇数位于数组的前半部分，
*所有的偶数位于位于数组的后半部分，
*并保证奇数和奇数，偶数和偶数之间的相对位置不变。
*
**/
public class Main1_13 {
	/**
	 * 好像挺简单的
	 * @param array
	 */
    public static void reOrderArray(int [] array) {
        int length = array.length;
        int[] newArray = new int[length];
        int n = 0;
        //奇数
        for(int i = 0; i < length; i++) {
        	if(array[i] % 2 != 0) {
        		newArray[n++] = array[i];
        	}
        }
        //偶数
        for(int j = 0; j < length; j++) {
        	if(array[j] % 2 == 0) {
        		newArray[n++] = array[j];
        	}
        }
        for(int k = 0; k < length; k++) {
        	array[k] = newArray[k];
        }
           	
    }
    
	public static void main(String[] args) {
		int[] array = {2,4,7,2,78,98,5,5,2,5,1,6,4};
		reOrderArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
}
