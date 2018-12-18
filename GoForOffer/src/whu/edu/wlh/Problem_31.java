package whu.edu.wlh;

import java.util.Stack;

/**
 * 功能:栈的压入弹出序列
 * 1.如果下一个弹出的数字刚好是栈顶数字，直接弹出。
 * 2.如果下一个弹出的数字不是栈顶数字，则把压栈序列中还没有入栈的数字压入辅助栈，直到把下一个需要弹出的数字压入栈顶为止。
 * 3.如果所有数字都压入栈后仍然没有找到下一个弹出的数字，则该序列不可能是一个弹出序列。
 * 作者:Wang Lihao from WHU
 * 日期:2018/12/14
 */
public class Problem_31 {
	public boolean IsPopOrder(int[] pushSequence, int[] popSequence) {
	    int n = pushSequence.length;
	    Stack<Integer> stack = new Stack<>();
	    for (int pushIndex = 0, popIndex = 0; pushIndex < n; pushIndex++) {
	    	//把压栈序列中还没有入栈的数字压入辅助栈，直到把下一个需要弹出的数字压入栈顶为止。
	        stack.push(pushSequence[pushIndex]);
	        //如果弹出序列还没弹出全部元素，辅助栈不为空，并且下一个弹出的数字刚好是栈顶数字，直接弹出。
	        //popIndex自加，进行下一个元素的判断。
	        while (popIndex < n && !stack.isEmpty() 
	                && stack.peek() == popSequence[popIndex]) {
	            stack.pop();
	            popIndex++;
	        }
	    }
	    //若辅助栈为空，则表示刚好符合条件。否则，不符合。
	    return stack.isEmpty();
	}
}
