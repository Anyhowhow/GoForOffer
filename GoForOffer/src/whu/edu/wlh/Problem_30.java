package whu.edu.wlh;

import java.util.Stack;

/**
 * 功能:包含 min函数的栈
 * 1.使用辅助栈来存储最小值。
 * 2.入栈过程。压入栈的时候，比较新入栈的元素和辅助栈内的元素。若大于等于辅助栈元素，则再次压入辅助栈内相同的元素，否则压入新入栈的元素。
 * 3.出栈过程。同时弹出主栈和辅助栈的元素，让辅助栈的栈顶实时保存栈内最小元素。
 * 4.获取栈内最小元素。直接弹出辅助栈的栈顶元素。
 * 作者:Wang Lihao from WHU
 * 日期:2018/12/13
 */
public class Problem_30 {
	private Stack<Integer> dataStack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();

	public void push(int node) {
	    dataStack.push(node);
	    minStack.push(minStack.isEmpty() ? node : Math.min(minStack.peek(), node));
	}

	public void pop() {
	    dataStack.pop();
	    minStack.pop();
	}

	public int top() {
	    return dataStack.peek();
	}
	
	public int min() {
	    return minStack.peek();
	}
}
