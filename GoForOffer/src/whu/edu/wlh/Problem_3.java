package whu.edu.wlh;

/**
 * 功能:在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，
 * 	        也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/04
 */
public class Problem_3 {
	public boolean duplicate(int[] nums, int length, int[] duplication) {
	    if (nums == null || length <= 0)
	        return false;
	    for (int i = 0; i < length; i++) {
	        while (nums[i] != i) {
	            if (nums[i] == nums[nums[i]]) {
	                duplication[0] = nums[i];
	                return true;
	            }
	            swap(nums, i, nums[i]);
	        }
	    }
	    return false;
	}
	private void swap(int[] nums, int i, int j) {
	    int t = nums[i];
	    nums[i] = nums[j];
	    nums[j] = t;
	}
	public static void main(String[] args) {
		int []a= {2,3,1,0,2,5};
		int []duplication = new int[1];
		int N = a.length;
		Problem_3 problem_3 = new Problem_3();
		problem_3.duplicate(a, N, duplication);
		System.out.println(duplication[0]);	
		}		
}
