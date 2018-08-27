package sword.to.offer;

import java.util.ArrayList;

/**
*@date 2018年7月10日 下午9:11:09
*@author 龙
*哦吼吼：Main1_19
*描述：
*题目描述
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，
如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
*/
public class Main1_19 {
	/**
	 * 解题思路：
	 * 1.计算需要循环的圈数，一圈包含2行或是2列；
	 * 2.每圈中有4种遍历方向，依次计算；
	 * 3.考虑从下往上，从右往左时是否只有一行或是一列了！
	 * @param matrix
	 * @return
	 */
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        //行数和列数
        int row = matrix.length;
        if(row == 0)
        	return list;
        int cols = matrix[0].length;
        //圈数,考虑1行的情况
        int circle = (Math.min(row, cols) - 1) / 2 + 1;
        int colLeftToRight,rowUpToDown, colRightToLeft, rowDownToUp;
        //循环遍历
        for(int i = 0; i < circle; i++) {
        	//从左往右的遍历
        	for(colLeftToRight = i; colLeftToRight < (cols - i - 1); colLeftToRight++) 
        		list.add(matrix[i][colLeftToRight]);
        	//从上往下的遍历
        	for(rowUpToDown = i; rowUpToDown < (row - 2*i - 1); rowUpToDown++)
        		list.add(matrix[rowUpToDown][cols - 1 - i]);
        	//从右往左的遍历，判断情况
        	for(colRightToLeft = cols - 1 - i; row - 1 - i != i && colRightToLeft > i; colRightToLeft--)
        		list.add(matrix[rowUpToDown][colRightToLeft]);
        	//从下往上的遍历，判断是否是一列
        	for(rowDownToUp = row - 1 - i; cols - 1 - i != i && rowDownToUp > i; rowDownToUp--)
        		list.add(matrix[rowDownToUp][i]);
        	
        }
        return list;
        
    }
    
    //因为自己写的for循环有问题，所以对比看看牛客上的
    public static ArrayList<Integer> printMatrix1(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        //行数和列数
        int row = matrix.length;
        if(row == 0)
        	return list;
        int cols = matrix[0].length;
        //圈数,考虑1行的情况
        int circle = (Math.min(row, cols) - 1) / 2 + 1;
        int colLeftToRight,rowUpToDown, colRightToLeft, rowDownToUp;
        //循环遍历
        for(int i = 0; i < circle; i++) {
        	//从左往右的遍历
        	for(colLeftToRight = i; colLeftToRight < (cols - i); colLeftToRight++) 
        		list.add(matrix[i][colLeftToRight]);
        	//从上往下的遍历
        	for(rowUpToDown = i+1; rowUpToDown < (row - i); rowUpToDown++)
        		list.add(matrix[rowUpToDown][cols - 1 - i]);
        	//从右往左的遍历，判断情况
        	for(colRightToLeft = cols - 2 - i; row - 1 - i != i && colRightToLeft >= i; colRightToLeft--)
        		list.add(matrix[row - 1 -i][colRightToLeft]);
        	//从下往上的遍历，判断是否是一列
        	for(rowDownToUp = row - 2 - i; cols - 1 - i != i && rowDownToUp > i; rowDownToUp--)
        		list.add(matrix[rowDownToUp][i]);
        	
        }
        return list;
        
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrays = {
				{1,2},
				{3,4}
		};
		
		ArrayList<Integer> list = new ArrayList();
		list = printMatrix1(arrays);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
	}

}
