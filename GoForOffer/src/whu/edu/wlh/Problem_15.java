package whu.edu.wlh;

/**
 * 功能:二进制中1的个数
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/27
 */
public class Problem_15 {
	public int NumberOf1(int n) {
	    int cnt = 0;
	    while (n != 0) {
	        cnt++;
	        n &= (n - 1);
	    }
	    return cnt;
	}
}
