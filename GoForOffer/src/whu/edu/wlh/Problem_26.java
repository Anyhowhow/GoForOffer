package whu.edu.wlh;

/**
 * 功能:树的子结构
 * 作者:Wang Lihao from WHU
 * 日期:2018/12/12
 */
public class Problem_26 {
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
	    if (root1 == null || root2 == null)
	        return false;
	    //需要遍历第一个树的所有节点，来与第二个树的根节点做比较
	    return isSubtreeWithRoot(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
	}

	private boolean isSubtreeWithRoot(TreeNode root1, TreeNode root2) {
		//此时第二个树的值都已经找到相等的值的，即满足子树
	    if (root2 == null)
	        return true;
	    //第一个树比第二个树先到达null，因此不符合子树
	    if (root1 == null)
	        return false;
	    //两个树的值不等，因此返回false
	    if (root1.val != root2.val)
	        return false;
	    //需同时满足左右子节点相等
	    return isSubtreeWithRoot(root1.left, root2.left) && isSubtreeWithRoot(root1.right, root2.right);
	}
}
