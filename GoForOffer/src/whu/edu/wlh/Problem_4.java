package whu.edu.wlh;

/**
 * 功能:从右上角开始查找。矩阵中的一个数，它左边的数都比它小，下边的数都比它大。因此，从右上角开始查找，就可以根据 target 和当前元素的大小关系来缩小查找区间。
		复杂度：O(M + N) + O(1)
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/04
 */
public class Problem_4 {
	public boolean Find(int target, int[][] matrix) {
	    if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
	        return false;
	    int rows = matrix.length, cols = matrix[0].length;//获取矩阵行数和列数的方法
	    int r = 0, c = cols - 1; // 从右上角开始
	    while (r <= rows - 1 && c >= 0) {
	        if (target == matrix[r][c])
	            return true;
	        else if (target > matrix[r][c])
	            r++;//若target大于右上角元素，则增加行号
	        else
	            c--;//若target小于右上角元素，则减小列号
	    }
	    return false;
	}
}
