package whu.edu.wlh;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 功能:从上往下打印二叉树
 * 作者:Wang Lihao from WHU
 * 日期:2018/12/14
 */
public class Problem_32 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	    Queue<TreeNode> queue = new LinkedList<>();
	    ArrayList<Integer> ret = new ArrayList<>();
	    queue.add(root);
	    while (!queue.isEmpty()) {
	        int cnt = queue.size();
	        while (cnt-- > 0) {
	            TreeNode t = queue.poll();
	            //queue是可以添加null值的，因此遇到null需要continue，不能break。这表明左子树为空，但右子树不一定为空。通过cnt来跳出循环。
	            if (t == null)
	                continue;
	            ret.add(t.val);//保存root节点的值到最终的列表中
	            queue.add(t.left);//添加左子节点到队列
	            queue.add(t.right);//添加右子节点到队列
	        }
	    }
	    return ret;
	}
}
