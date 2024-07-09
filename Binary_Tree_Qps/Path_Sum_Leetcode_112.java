package Binary_Tree_Qps;
public class Path_Sum_Leetcode_112 {
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
		public boolean hasPathsum(TreeNode root,int targetsum) {
			if(root==null) {
				return false;
			}
			if(root.left==null&&root.right==null) {
				return targetsum-root.val==0;
			}
			boolean left=hasPathsum(root.left,targetsum-root.val);
			boolean right=hasPathsum(root.right,targetsum-root.val);
			return left||right;
		}
	}
}