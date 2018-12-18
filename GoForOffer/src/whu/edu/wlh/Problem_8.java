package whu.edu.wlh;
/**
 * 功能:给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * 作者:Wang Lihao from WHU
 * 日期:2018/09/12
 */
public class Problem_8 {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		//若右子树不为空，则下一个节点为右子树的最左子节点
	    if (pNode.right != null) {
	        TreeLinkNode node = pNode.right;
	        while (node.left != null)
	            node = node.left;
	        return node;
	    } 
	    //若右子树为空，则向上找第一个左链接指向的树包含该节点的祖先节点。注意：next为指向父节点的指针。
	    else 
	    {
	    	//向上找父节点，直到父节点的左子节点为当前节点，return父节点即为要找的下一个节点
	        while (pNode.next != null) {
	            TreeLinkNode parent = pNode.next;
	            if (parent.left == pNode)
	                return parent;
	            pNode = pNode.next;
	        }
	    }
	    return null;
	}
}
