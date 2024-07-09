package Binary_Tree_Qps;
public class Symmetric_TreeLeetcode_101 {
public class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){		
	  }
	TreeNode(int val){
		this.val=val;
	  }
	TreeNode(int val,TreeNode left, TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
    }
class solution{
	public boolean isSymmetric(TreeNode root) {
		return Symmetric(root.left,root.right);		
	}
	public boolean Symmetric(TreeNode root1,TreeNode root2) {
		if(root1==null&&root2==null) {
			return true;
		}
		if(root1==null||root2==null) {
			return false;
		}
		if(root1.val!=root2.val) {
			return false;
		}
		boolean f1=Symmetric(root1.left,root2.right);
		boolean f2=Symmetric(root1.right,root2.left);
		return f1&&f2;
	}
}
 }