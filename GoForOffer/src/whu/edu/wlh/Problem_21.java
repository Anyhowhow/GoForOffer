package whu.edu.wlh;

/**
 * 功能:调整数组顺序使奇数位于偶数之前。需要保证奇数和奇数，偶数和偶数之间的相对位置不变
 * 		先统计奇数的个数，然后复制到数组中，奇数偶数分别取值。
 * 作者:Wang Lihao from WHU
 * 日期:2018/10/29
 */
public class Problem_21 {
	public void reOrderArray(int[] nums) {
	    // 奇数个数
	    int oddCnt = 0;
	    for (int val : nums)
	        if (val % 2 == 1)
	            oddCnt++;
	    int[] copy = nums.clone();
	    int i = 0, j = oddCnt;
	    for (int num : copy) {
	        if (num % 2 == 1)
	            nums[i++] = num;
	        else
	            nums[j++] = num;
	    }
	}
}
