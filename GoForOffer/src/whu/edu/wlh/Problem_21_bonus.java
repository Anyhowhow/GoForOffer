package whu.edu.wlh;


/**
 * 功能:调整数组顺序使奇数位于偶数之前。
 * 作者:Wang Lihao from WHU
 * 日期:2018/10/29
 */
public class Problem_21_bonus {
	public void reOrderArray(int[] nums) {
		int i=-1;
		int j=nums.length;
		while (i<j) {
			while (nums[++i]%2==1 && i<j);
			while (nums[--j]%2==0 && i<j);
			if (i>=j) {
				break;
			}
			exch(nums,i,j);
		}
	}
	private void exch(int[] a,int i,int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void show(int []a) {
		for(int num:a) {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		int []test = {10,9,9,8,6,1,5,5,1};
		Problem_21_bonus problem_21_bonus = new Problem_21_bonus();
		problem_21_bonus.reOrderArray(test);
		show(test);
		
	}
}
