package whu.edu.wlh;

/**
 * 功能:对称的二叉树
 * 1.理解对称二叉树的特点
 * 2.用递归来同时查看一个子树和它对称的子树
 * 3.查看对称子树的关键是，同时往下层遍历。
 * 作者:Wang Lihao from WHU
 * 日期:2018/12/13
 */
public class Problem_28 {
	boolean isSymmetrical(TreeNode pRoot) {
	    if (pRoot == null)
	        return true;
	    return isSymmetrical(pRoot.left, pRoot.right);
	}

	boolean isSymmetrical(TreeNode t1, TreeNode t2) {
	    if (t1 == null && t2 == null)
	        return true;
	    if (t1 == null || t2 == null)
	        return false;
	    if (t1.val != t2.val)
	        return false;
	    return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
	}
}
