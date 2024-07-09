package Binary_Tree_Qps;
import java.util.*;
public class Binary_Tree_Right_Side_View_Leet_Code_199 {
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
		int visited=-1;
		public List<Integer>rightsideview(TreeNode root){
			List<Integer>ll=new ArrayList<>();
			view(root,0,ll);
			return ll;
		}
		public void view(TreeNode root,int curr,List<Integer>ll) {
			if(root==null) {
				return ;
			}
			if(curr>visited) {
				ll.add(root.val);
				visited=curr;
			}
			view(root.left,curr+1,ll);
			view(root.right,curr+1,ll);
		}
	}
}