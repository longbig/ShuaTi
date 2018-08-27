package sword.to.offer;
/**
*@date 2018年7月11日 上午11:59:07
*@author 龙
*哦吼吼：Main2_13
*描述：把只包含质因子2、3和5的数称作丑数（Ugly Number）。
*例如6、8都是丑数，但14不是，
*因为它包含因子7。 
*习惯上我们把1当做是第一个丑数。
*求按从小到大的顺序的第N个丑数。
*/
public class Main2_13 {
	//计算丑数
	/**
	 * 
	 * @param index
	 * @return
	 * 思路：将其分为3个分别包含2，3，5的乘数数组
	 * i2 代表包含有2的因子的丑数的
	 * i3
	 * i5
	 * 结果数组包含有其中一个，则i(2,3,5)++,
	 */
    public static int GetUglyNumber_Solution(int index) {
    	if(index < 7)
    		return index;
    	int i2 = 0, i3 = 0, i5 = 0;
    	int[] result = new int[index];
    	result[0] = 1;
    	int i = 1;
    	while(i < index) {
    		result[i] = Math.min(result[i2]*2, Math.min(result[i3]*3, result[i5]*5));
    		if(result[i] == result[i2]*2)
    			i2++;
    		if(result[i] == result[i3] * 3)
    			i3++;
    		if(result[i] == result[i5] * 5)
    			i5++;
    		i++;
    	}
    	
        return result[index - 1];
    }
    
    public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(11));
	}
}
