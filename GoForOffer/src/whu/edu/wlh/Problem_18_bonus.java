package whu.edu.wlh;
/**
 * 功能:删除链表中重复的结点
 * 作者:Wang Lihao from WHU
 * 日期:2018/10/26
 */
public class Problem_18_bonus {
	public ListNode deleteDuplication(ListNode pHead) {
	    if (pHead == null || pHead.next == null)
	        return pHead;
	    ListNode next = pHead.next;
	    if (pHead.val == next.val) {
	        while (next != null && pHead.val == next.val)//若有重复节点，则继续next，直到不重复，并指向下一个不重复节点
	            next = next.next;
	        return deleteDuplication(next);
	    } else {
	        pHead.next = deleteDuplication(pHead.next);//不是重复节点，则让当前节点指向下一个非重复节点
	        return pHead;
	    }
	}
}
