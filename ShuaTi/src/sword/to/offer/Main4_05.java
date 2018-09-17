package sword.to.offer;
/**
 * @date 2018年9月2日 上午10:58:39
 * @author 龙
 * 类描述：矩阵中的路径
 */
public class Main4_05 {
	
	//回溯法的思想，使用递归，剪枝
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
    	if(matrix == null || rows < 1 || cols < 1)
    		return false;
    	boolean[] flag = new boolean[matrix.length];
    	int k = 0;
    	for(int i = 0; i < rows; i++) {
    		for(int j = 0; j < cols; j++) {
    			if(allPathHasOneRoute(matrix, rows, cols, i, j, str, k, flag))
    				return true;
    		}
    	}
    	return false;
    }
    
	private boolean allPathHasOneRoute(char[] matrix, int rows, int cols, int i, int j, char[] str, int k, boolean[] flag) {
		// TODO Auto-generated method stub
		int index = i * cols + j;
		if(i<0 || i>rows-1 || j<0 || j>cols-1 || matrix[index] != str[k] || flag[index])
			return false;
		if(k == str.length - 1)
			return true;
		flag[index] = true;
		
		//上，下，左，右，有一条路能走通就返回true
		if(allPathHasOneRoute(matrix, rows, cols, i - 1, j, str, k + 1, flag)
			|| allPathHasOneRoute(matrix, rows, cols, i + 1, j, str, k + 1, flag)
			|| allPathHasOneRoute(matrix, rows, cols, i, j - 1, str, k + 1, flag)
			|| allPathHasOneRoute(matrix, rows, cols, i, j + 1, str, k + 1, flag)){
			return true;
		}
		//如果4条路走不通，就回退
		flag[index] = false;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
