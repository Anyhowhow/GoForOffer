package whu.edu.wlh;

/**
 * 功能:矩阵中的路径
 * 		请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 		路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 		如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/20
 */
public class Problem_12 {
	private final static int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
	private int rows;
	private int cols;
	public boolean hasPath(char[] array, int rows, int cols, char[] str) {
	    if (rows == 0 || cols == 0)
	        return false;
	    this.rows = rows;
	    this.cols = cols;
	    boolean[][] marked = new boolean[rows][cols];
	    char[][] matrix = buildMatrix(array);
	    for (int i = 0; i < rows; i++)
	        for (int j = 0; j < cols; j++)
	            if (backtracking(matrix, str, marked, 0, i, j))
	                return true;
	    return false;
	}
	//实现回溯算法的函数，递归实现。
	private boolean backtracking(char[][] matrix, char[] str, boolean[][] marked, int pathLen, int r, int c) {
	    //已找到str对应长度的路径字符串，完成查找
		if (pathLen == str.length)
	        return true;
		//以下情况，表示当前查找不对，返回false
	    if (r < 0 || r >= rows || c < 0 || c >= cols || matrix[r][c] != str[pathLen] || marked[r][c])
	        return false;
	    //当前位置的元素匹配str中的元素。标记当前位置，已来过。
	    marked[r][c] = true;
	    //遍历当前位置的四周位置，是否能找到下一个字符
	    for (int[] n : next)
	        if (backtracking(matrix, str, marked, pathLen + 1, r + n[0], c + n[1]))
	            return true;
	    //当前元素的四周元素不匹配下一个元素，则返回到上一个位置。
	    marked[r][c] = false;
	    return false;//表示当前元素为起点无法找到符合条件的路径
	}
	//根据传入的一维参数矩阵构建二维矩阵
	private char[][] buildMatrix(char[] array) {
	    char[][] matrix = new char[rows][cols];
	    for (int i = 0, idx = 0; i < rows; i++)
	        for (int j = 0; j < cols; j++)
	            matrix[i][j] = array[idx++];
	    return matrix;
	}
}
