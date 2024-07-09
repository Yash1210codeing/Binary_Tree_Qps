package Binary_Tree_Qps;
public class Sum_Root_To_Leaf_Numbers_Leet_Code_129 {
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
		public int sumNumber(TreeNode root) {
			return sum(root,0);
		}
		public int sum(TreeNode root,int num) {
			if(root==null) {
				return 0;
			}
			if(root.left==null&&root.right==null) {
				return num*10+root.val;
			}
			int left=sum(root.left,num*10+root.val);
			int right=sum(root.right,num*10+root.val);
			return left+right;
		}
	}
}