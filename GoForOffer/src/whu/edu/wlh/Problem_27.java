package whu.edu.wlh;

/**
 * 功能:二叉树的镜像
 * 1.通过画图来理解二叉树的镜像是如何实现的
 * 2.用递归来交换节点的左右子节点
 * 作者:Wang Lihao from WHU
 * 日期:2018/12/13
 */
public class Problem_27 {
	public void Mirror(TreeNode root) {
	    if (root == null)
	        return;
	    swap(root);
	    Mirror(root.left);
	    Mirror(root.right);
	}

	private void swap(TreeNode root) {
	    TreeNode t = root.left;
	    root.left = root.right;
	    root.right = t;
	}
}
