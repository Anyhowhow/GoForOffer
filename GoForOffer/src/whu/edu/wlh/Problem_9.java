package whu.edu.wlh;

import java.util.Stack;
/**
 * 功能:用两个栈实现一个队列
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/17
 */
public class Problem_9 {
	Stack<Integer> in = new Stack<Integer>();
	Stack<Integer> out = new Stack<Integer>();

	public void push(int node) {
	    in.push(node);
	}

	public int pop() throws Exception {
	    if (out.isEmpty())
	        while (!in.isEmpty())
	            out.push(in.pop());

	    if (out.isEmpty())
	        throw new Exception("queue is empty");

	    return out.pop();
	}
}
