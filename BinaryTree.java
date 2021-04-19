package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
	
	TreeNode root;
	
	public TreeNode createBinaryTree() {
		
		TreeNode root = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		
		root.left = n2;
		root.right = n3;
		root.left.left = n4;
		root.left.right = n6;
		root.right.left = n7;
		root.right.right = n5;
		
		return root;
		
		/*        1
		 * 		/	\
		 * 	   2	 3
		 * 	  /	\	/ \
		 *   4	 6 7   5
		*/
		
	}
	
	public void preOrder(TreeNode root) {	//n l r
		
		if (root == null) return;
		
		System.out.print(root.data + "-");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void postOrder(TreeNode root) {	//l r n
			
			if (root == null) return;
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + "-");
	}
	
	public void inOrder(TreeNode root) {	//l n r
			
			if (root == null) return;
			
			inOrder(root.left);
			System.out.print(root.data + "-");
			inOrder(root.right);
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		if (root == null) return result;
		
		Queue<TreeNode> q = new java.util.LinkedList<>();
		q.add(root);
		
		while (! q.isEmpty()) {
			int size = q.size();
			List<Integer> currentLevel = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode current = q.poll();
				currentLevel.add(current.data);
				
				if (current.left != null) q.add(current.left);
				if (current.right != null) q.add(current.right);
			}
			
			result.add(currentLevel);
		}
		
		return result;
	
	}
	
	public TreeNode invertTree (TreeNode root) {
		
		if (root == null) return root;
		
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
	}
	
	public int maxDepth (TreeNode root) {
		
		if (root == null) return 0; // To find the no of edges return -1
		
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		
		return Math.max(left, right) + 1;
	}
	
	 public int minDepth(TreeNode root) {
	        
	        if (root == null) return 0;
	        
	        int leftHeight = minDepth(root.left);
	        int rightHeight = minDepth(root.right);
	        
	        if (leftHeight == 0 || rightHeight == 0) return 1 + leftHeight + rightHeight;
	        else return Math.min(leftHeight, rightHeight) + 1;
	        
	    }
	 
	 public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
	        
	        if (root == null) return root;
	        if (root.data == p || root.data == q) return root;
	        
	        TreeNode leftSearchResult = lowestCommonAncestor(root.left, p, q);
	        TreeNode rightSearchResult = lowestCommonAncestor(root.right, p, q);
	        
	        if (leftSearchResult == null) return rightSearchResult;
	        if (rightSearchResult == null) return leftSearchResult;
	        
	        return root;
	    }
	
	
	
}
