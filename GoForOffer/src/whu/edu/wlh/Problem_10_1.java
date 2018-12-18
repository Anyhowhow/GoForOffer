package whu.edu.wlh;

/**
 * 功能:三种计算斐波那契数列的方法：
 * 		1.动态规划
 * 		2.循环实现递归
 * 		3.构造函数中递归计算
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/19
 */
public class Problem_10_1 {
	//动态规划求解
	public int Fibonacci_1(int n) {
	    if (n <= 1)
	        return n;
	    int[] fib = new int[n + 1];
	    fib[1] = 1;
	    for (int i = 2; i <= n; i++)
	        fib[i] = fib[i - 1] + fib[i - 2];
	    return fib[n];
	}
	//用循环实现递归
	public int Fibonacci_2(int n) {
	    if (n <= 1)
	        return n;
	    int pre2 = 0, pre1 = 1;
	    int fib = 0;
	    for (int i = 2; i <= n; i++) {
	        fib = pre2 + pre1;
	        pre2 = pre1;
	        pre1 = fib;
	    }
	    return fib;
	}
	//构造函数中计算并保存，函数中直接返回对应元素
	private int[] fib = new int[40];
    public Problem_10_1() {
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 2; i < fib.length; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
    }
    public int Fibonacci_3(int n) {
        return fib[n];
    }
}
