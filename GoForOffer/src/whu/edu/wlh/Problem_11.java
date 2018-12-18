package whu.edu.wlh;

/**
 * 功能:旋转数组中的最小数字
 * 		把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 *		例如数组 {3, 4, 5, 1, 2} 为 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小值为 1。
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/20
 */
public class Problem_11 {
	public int minNumberInRotateArray(int[] nums) {
	    if (nums.length == 0)
	        return 0;
	    int l = 0, h = nums.length - 1;
	    while (l < h) {
	        int m = l + (h - l) / 2;
	        if (nums[l] == nums[m] && nums[m] == nums[h])
	            return minNumber(nums, l, h);
	        else if (nums[m] <= nums[h])
	            h = m;
	        else
	            l = m + 1;
	    }
	    return nums[l];
	}
	//特殊情况，l,m,h三个元素相等，如{1,1,1,0,1}。
	//遍历当前范围的数组，若检索到后一个元素比当前元素小，即为所查到的结果
	private int minNumber(int[] nums, int l, int h) {
	    for (int i = l; i < h; i++)
	        if (nums[i] > nums[i + 1])
	            return nums[i + 1];
	    return nums[l];
	}
}
