package whu.edu.wlh;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 功能:输入链表的第一个节点，从尾到头反过来打印出每个结点的值。基于栈实现。
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/05
 */
public class Problem_6 {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	    Stack<Integer> stack = new Stack<>();
	    //将链表的节点压入栈
	    while (listNode != null) {
	        stack.add(listNode.val);
	        listNode = listNode.next;
	    }
	    //出栈
	    ArrayList<Integer> ret = new ArrayList<>();
	    while (!stack.isEmpty())
	        ret.add(stack.pop());
	    return ret;
	}
	public static void main(String[] args) {
			ListNode listNode1 = new ListNode(1);
			ListNode listNode2 = new ListNode(2);
			ListNode listNode3 = new ListNode(3);
			listNode1.next = listNode2;
			listNode2.next = listNode3;
			ArrayList<Integer> theReverseLinkList = new ArrayList<>();
			Problem_6 problem_6 = new Problem_6();
			theReverseLinkList=problem_6.printListFromTailToHead(listNode1);
			System.out.println(theReverseLinkList);
	}
}
