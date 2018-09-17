package sword.to.offer;
/**
 * @date 2018年9月2日 下午4:27:44
 * @author 龙
 * 类描述：机器人的运动范围问题。
 */
public class Main4_06 {

	
    public int movingCount(int threshold, int rows, int cols)
    {
    	int[][] array = new int[rows][cols];
    	int i = 0;
    	int j = 0;
    	int count = helperFunc(threshold, rows, cols, i, j, array);
  
    	return count;
    }
    
	private int helperFunc(int threshold, int rows, int cols, int i, int j, int[][] array) {
		// TODO Auto-generated method stub
		if(i<0 || i>rows-1 || j<0 || j>cols-1 || (sumOfAllNumber(i)+sumOfAllNumber(j) > threshold)
				|| array[i][j] == 1) {
			return 0;
		}
		array[i][j] = 1;
		return  helperFunc(threshold, rows, cols, i + 1, j, array) 
				+ helperFunc(threshold, rows, cols, i, j + 1, array)
				+ helperFunc(threshold, rows, cols, i - 1, j, array)
				+ helperFunc(threshold, rows, cols, i, j - 1, array)
				+ 1;
		
		
	}

	private int sumOfAllNumber(int data) {
		// TODO Auto-generated method stub
		int sum = 0;
		while(data != 0) {
			sum += (data % 10);
			data /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main4_06 test = new Main4_06();
		int count = test.movingCount(5, 5, 5);
		System.out.println(count);
		
		
	}

}
