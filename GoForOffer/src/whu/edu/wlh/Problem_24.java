package whu.edu.wlh;

/**
 * 功能:反转链表
 * 作者:Wang Lihao from WHU
 * 日期:2018/12/11
 */
public class Problem_24 {
	public ListNode ReverseList_recursion(ListNode head) {
		//最后一个节点时，会返回该节点，作为newHead节点
	    if (head == null || head.next == null)
	        return head;
	    ListNode next = head.next;
	    head.next = null;//清除当前节点的next信息
	    ListNode newHead = ReverseList_recursion(next);//只有到最后一个节点的时候才会停止递归
	    next.next = head;//反转链表的next信息
	    return newHead;
	}
	
	public ListNode ReverseList_iteration(ListNode head) {
	    ListNode newList = new ListNode(-1);
	    while (head != null) {
	        ListNode next = head.next;
	        head.next = newList.next;
	        newList.next = head;
	        head = next;
	    }
	    return newList.next;
	}
}
