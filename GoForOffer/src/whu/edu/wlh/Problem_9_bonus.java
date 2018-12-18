package whu.edu.wlh;

import java.util.ArrayDeque;
import java.util.Queue;
/**
 * 功能:用两个队列实现栈
 * 作者:Wang Lihao from WHU
 * 日期:2018/11/06
 */
public class Problem_9_bonus {
	Queue<Integer> in = new ArrayDeque<Integer>();
	Queue<Integer> out = new ArrayDeque<Integer>();

	public void push(int node) {
	    in.add(node);
	}

	public int pop() throws Exception {
		if (in.isEmpty()&&out.isEmpty()) {
			throw new Exception("stack is empty");
		}
	    if (out.isEmpty()) {
	    	while (in.size()>1)
	            out.add(in.poll());	
	        return in.poll();
	    }
	    if (in.isEmpty()) {
	    	while (out.size()>1)
	            in.add(out.poll());	
	        return out.poll();
	    }
	    return 0;
	    		     
	}
	public static void main(String[] args) {
		Problem_9_bonus problem_9_bonus = new Problem_9_bonus();
		int []array = {1,3,5,7,9};
		for(int ele:array) {
			problem_9_bonus.push(ele);
		}
		try{
			System.out.println(problem_9_bonus.pop());
			System.out.println(problem_9_bonus.pop());
			System.out.println(problem_9_bonus.pop());
			System.out.println(problem_9_bonus.pop());
			System.out.println(problem_9_bonus.pop());
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
