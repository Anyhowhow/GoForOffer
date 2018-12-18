package whu.edu.wlh;

/**
 * 功能:地上有一个 m 行和 n 列的方格。一个机器人从坐标 (0, 0) 的格子开始移动，每一次只能向左右上下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于 k 的格子。例如，当 k 为 18 时，机器人能够进入方格 (35,37)，因为 3+5+3+7=18。
 * 但是，它不能进入方格 (35,38)，因为 3+5+3+8=19。请问该机器人能够达到多少个格子？
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/26
 */
public class Problem_13 {
	private static final int[][] next = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
	private int cnt = 0;
	private int rows;
	private int cols;
	private int threshold;
	private int[][] digitSum;

	public int movingCount(int threshold, int rows, int cols) {
	    this.rows = rows;
	    this.cols = cols;
	    this.threshold = threshold;
	    initDigitSum();//根据行列计算各坐标的数位之和
	    boolean[][] marked = new boolean[rows][cols];
	    dfs(marked, 0, 0);
	    return cnt;
	}

	private void dfs(boolean[][] marked, int r, int c) {
		//当访问越界或者已访问过时，返回
	    if (r < 0 || r >= rows || c < 0 || c >= cols || marked[r][c])
	        return;
	    marked[r][c] = true;
	    //当前位置的坐标数位之和大于门限值，返回
	    if (this.digitSum[r][c] > this.threshold)
	        return;
	    //符合要求，cnt++
	    cnt++;
	    //继续往旁边的方格遍历
	    for (int[] n : next)
	        dfs(marked, r + n[0], c + n[1]);
	}
	//计算各个坐标下的数位之和。选取行和列中较大者，依次计算0-行列较大者的数位和并存储在数组中。
	//然后遍历二维数组，相加横坐标数位之和与纵坐标数位之和，避免重复计算。
	private void initDigitSum() {
	    int[] digitSumOne = new int[Math.max(rows, cols)];
	    for (int i = 0; i < digitSumOne.length; i++) {
	        int n = i;
	        while (n > 0) {
	            digitSumOne[i] += n % 10;
	            n /= 10;
	        }
	    }
	    this.digitSum = new int[rows][cols];
	    for (int i = 0; i < this.rows; i++)
	        for (int j = 0; j < this.cols; j++)
	            this.digitSum[i][j] = digitSumOne[i] + digitSumOne[j];
	}
}
