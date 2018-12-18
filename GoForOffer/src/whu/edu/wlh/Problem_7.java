package whu.edu.wlh;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能:根据二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/12
 */
public class Problem_7 {
	private Map<Integer, Integer> indexForInOrders = new HashMap<>();
	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
	    for (int i = 0; i < in.length; i++)
	        indexForInOrders.put(in[i], i);
	    return reConstructBinaryTree(pre, 0, pre.length - 1, 0);
	}
	/**
	 * 递归算法，通过前序遍历得到根节点，然后再通过中序遍历来分割序列，分别得到左子树和右子树。再递归分割左子树和右子树完成重建。
	 * @param pre  前序遍历序列的数组
	 * @param preL 子树的根节点在前序遍历中的位置
	 * @param preR 子树在前序遍历中的范围
	 * @param inL  子树开始的位置（方便计算左子树的大小）	
	 * @return root 根节点（根节点下面所有的子节点已经写入完成）
	 */
	private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
	    if (preL > preR)
	        return null;
	    TreeNode root = new TreeNode(pre[preL]);//前序遍历的首元素为根节点
	    int inIndex = indexForInOrders.get(root.val);//根据根节点的值得到其在中序遍历的位置
	    int leftTreeSize = inIndex - inL;//左子节点树的大小
	    root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL);
	    root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
	    return root;
	}
}
