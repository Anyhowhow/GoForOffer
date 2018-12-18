package whu.edu.wlh;

/**
 * 功能: 在 O(1) 时间内删除链表节点
 * 		1.如果该节点不是尾节点，那么可以直接将下一个节点的值赋给该节点，然后令该节点指向下下个节点，再删除下一个节点，时间复杂度为 O(1)
 * 		2.否则，就需要先遍历链表，找到节点的前一个节点，然后让前一个节点指向 null，时间复杂度为 O(N)。
 * 		平均时间复杂度：(n-1)个时间复杂度为O(1)的节点，1个时间复杂度为O(n)的节点，平均时间复杂度为O(1)，符合要求。
 * 作者:Wang Lihao from WHU
 * 日期:2018/10/26
 */
public class Problem_18 {
	public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
	    if (head == null || tobeDelete == null)
	        return null;
	    if (tobeDelete.next != null) {
	        // 要删除的节点不是尾节点：将该节点的下一个节点的值复制给该节点，并使该节点指向下一个节点的下一个节点
	        ListNode next = tobeDelete.next;
	        tobeDelete.val = next.val;
	        tobeDelete.next = next.next;
	    } else {
	    	//要删除的节点是尾节点：从head节点开始，找到该节点的前一个节点，是其前一个节点指向null
	        ListNode cur = head;
	        while (cur.next != tobeDelete)
	            cur = cur.next;
	        cur.next = null;
	    }
	    return head;
	}
}
