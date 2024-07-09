package Binary_Tree_Qps;
public class Lowest_Common_Ancestor_Of_a_Binary_Tree_Leet_Code_236 {
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
	class solution {
		public TreeNode lowestCommonancestor(TreeNode root,TreeNode p,TreeNode q) {		
			return Commonancestor(root,p,q);
		}
	public TreeNode Commonancestor(TreeNode root,TreeNode p,TreeNode q) {
		if(root==null) {
			return null;
		}
		if(root==p||root==q) {
			return root;
		}
		TreeNode left=Commonancestor(root.left,p,q);
		TreeNode right=Commonancestor(root.right,p,q);
		if(left!=null&&right!=null) {
			return root;
		}else if(left==null) {
			return right;
		}else {
			return left;
		}
	}
		
	}
}