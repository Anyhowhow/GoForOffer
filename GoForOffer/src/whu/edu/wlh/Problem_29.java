package whu.edu.wlh;

import java.util.ArrayList;

/**
 * 功能:顺时针打印矩阵
 * 作者:Wang Lihao from WHU
 * 日期:2018/12/13
 */
public class Problem_29 {
	public ArrayList<Integer> printMatrix(int[][] matrix) {
	    ArrayList<Integer> ret = new ArrayList<>();
	    int r1 = 0, r2 = matrix.length - 1, c1 = 0, c2 = matrix[0].length - 1;
	    //只要行和列还在范围内，就可以继续打印
	    while (r1 <= r2 && c1 <= c2) {
	    	//从左往右打印行
	        for (int i = c1; i <= c2; i++)
	            ret.add(matrix[r1][i]);
	        //从上往下打印列
	        for (int i = r1 + 1; i <= r2; i++)
	            ret.add(matrix[i][c2]);
	        //若矩阵不止一行，从右往左打印行
	        if (r1 != r2)
	            for (int i = c2 - 1; i >= c1; i--)
	                ret.add(matrix[r2][i]);
	        //若矩阵不止一列，从下往上打印列
	        if (c1 != c2)
	            for (int i = r2 - 1; i > r1; i--)
	                ret.add(matrix[i][c1]);
	        //进行下一圈的打印，起始行、起始列加1，终止行、终止列减1
	        r1++; r2--; c1++; c2--;
	    }
	    return ret;
	}
}
