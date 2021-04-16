package binarytree;

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
	
	
	
}
