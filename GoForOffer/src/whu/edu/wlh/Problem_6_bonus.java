package whu.edu.wlh;

import java.util.ArrayList;
/**
 * 功能:输入链表的第一个节点，从尾到头反过来打印出每个结点的值。基于递归实现的。
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/14
 */
public class Problem_6_bonus {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	    ArrayList<Integer> ret = new ArrayList<>();
	    if (listNode != null) {
	        //addAll方法将collection中所有元素添加到ret(不同层次的递归有不同的ret)中，递归终止条件为listNode == null，
	    	//此时addAll参数为一个空ArrayList,将会添加尾节点的值添加到ret中
	        ret.addAll(printListFromTailToHead(listNode.next));
	        ret.add(listNode.val);
	    }
	    return ret;
	}
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		ArrayList<Integer> theReverseLinkList = new ArrayList<>();
		Problem_6_bonus problem_6_bonus = new Problem_6_bonus();
		theReverseLinkList=problem_6_bonus.printListFromTailToHead(listNode1);
		System.out.println(theReverseLinkList);
	}
}
