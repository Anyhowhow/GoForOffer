package whu.edu.wlh;

/**
 * 功能:合并两个排序的链表
 * 作者:Wang Lihao from WHU
 * 日期:2018/12/12
 */
public class Problem_25 {
	public ListNode Merge(ListNode list1, ListNode list2) {
	    if (list1 == null)
	        return list2;
	    if (list2 == null)
	        return list1;
	    if (list1.val <= list2.val) {
	        list1.next = Merge(list1.next, list2);
	        return list1;
	    } else {
	        list2.next = Merge(list1, list2.next);
	        return list2;
	    }
	}
}
