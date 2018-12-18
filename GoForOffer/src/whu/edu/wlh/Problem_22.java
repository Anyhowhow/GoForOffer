package whu.edu.wlh;

/**
 * 功能:链表中倒数第 K 个结点。
 * 设链表的长度为 N。设两个指针 P1 和 P2，先让 P1 移动 K 个节点，则还有 N - K 个节点可以移动。
 * 此时让 P1 和 P2 同时移动，可以知道当 P1 移动到链表结尾时，P2 移动到 N - K 个节点处，该位置就是倒数第 K 个节点。
 * 作者:Wang Lihao from WHU
 * 日期:2018/11/02
 */
public class Problem_22 {
	public ListNode FindKthToTail(ListNode head, int k) {
	    if (head == null)
	        return null;
	    ListNode P1 = head;	    
	    while (P1 != null && k-- > 0)
	        P1 = P1.next;
	    //P1指针已经走到尾端，但k仍然大于0.说明k大于链表长度，因此无法找到倒数第k个结点
	    if (k > 0)
	        return null;
	    ListNode P2 = head;
	    //此时P1指针从head向尾端已经走了k步，即P1领先P2 k个结点
	    while (P1 != null) {
	        P1 = P1.next;
	        P2 = P2.next;
	    }
	    return P2;
	}
}
