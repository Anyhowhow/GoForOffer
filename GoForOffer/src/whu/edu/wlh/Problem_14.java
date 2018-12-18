package whu.edu.wlh;

/**
 * 功能:把一根绳子剪成多段，并且使得每段的长度乘积最大。
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/27
 */
public class Problem_14 {
	//贪婪算法的实现方法
	public int integerBreak(int n) {
	    if (n < 2)
	        return 0;
	    if (n == 2)
	        return 1;
	    if (n == 3)
	        return 2;
	    int timesOf3 = n / 3;
	    //表明此时会出现长度为4的一段，4应该剪成2+2，而不是3+1.因此3的数量应该减1，再计算2的数量
	    if (n - timesOf3 * 3 == 1)
	        timesOf3--;
	    int timesOf2 = (n - timesOf3 * 3) / 2;
	    return (int) (Math.pow(3, timesOf3)) * (int) (Math.pow(2, timesOf2));
	}
	//动态规划的实现方法，代码简洁版。将n=2,3的情况综合在代码中，代码更简洁。
	//j*(i-j)是计算6以内，可以拆分成2和3两个数组合的情况，后面是为了计算可以拆分为3个或者3个以上2.3组合的情况
	public int integerBreak1(int n) {
	    int[] dp = new int[n + 1];
	    dp[1] = 1;
	    for (int i = 2; i <= n; i++)
	        for (int j = 1; j < i; j++)
	            dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
	    return dp[n];
	}
	//动态规划的实现方法，直观版。将n=2,3的情况单独列出来，代码更直观。
		public int integerBreak2(int n) {
			if (n<2) {
				return 0;
			}
			if (n==2) {
				return 1;
			}
			if (n==3) {
				return 2;
			}
		    int[] dp = new int[n + 1];
		    dp[0] = 0;
		    dp[1] = 1;
		    dp[2] = 2;
		    dp[3] = 3;
		    for (int i = 4; i <= n; i++)
		        for (int j = 1; j <= i/2; j++)
		            dp[i] = Math.max(dp[i], dp[j] * dp[i - j]);
		    return dp[n];
		}
		public static void main(String[] args) {
			Problem_14 test = new Problem_14();
			System.out.println(test.integerBreak(10));
			System.out.println(test.integerBreak1(10));
			System.out.println(test.integerBreak2(10));
		}
}
