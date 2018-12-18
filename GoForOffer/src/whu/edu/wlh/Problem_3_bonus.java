package whu.edu.wlh;

/**
 * 功能:在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，
 * 	        也不知道每个数字重复几次。请找出数组中任意一个重复的数字。但不能修改输入的数组。
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/13
 */
public class Problem_3_bonus {
	private int getDuplication(int []nums) {
		if (nums == null) {
			return -1;
		}
		int lo=0,hi = nums.length-1;
		while (hi>=lo) {
			int mid = (hi-lo)/2+lo;
			int count = count(nums, lo, mid);
			if (hi==lo) {
				if (count>1) {
					return lo;
				}
				else {
					break;
				}
			}
			if (count>(mid-lo+1)) {
				hi=mid;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
	}
	private int count(int []nums,int lo,int hi) {
		if (nums == null) {
			return -1;
		}
		int count=0;
		for (int i : nums) {
			if (i>=lo&&i<=hi) {
				++count;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int []a= {2,3,1,0,2,5};
		Problem_3_bonus problem_3_bonus = new Problem_3_bonus();
		System.out.println(problem_3_bonus.getDuplication(a));
		}	
}
