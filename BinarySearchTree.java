package binarytree;

public class BinarySearchTree {
	
	public TreeNode createNewNode(int val) {
		TreeNode newNode = new TreeNode(val);
		newNode.left = null;
		newNode.right = null;
		
		return newNode;
	}
	
	public TreeNode insert(TreeNode node, int val) {
		
		if (node == null) {
			return createNewNode(val);
		} 
		
		else {
			if (val <= node.data) {
				node.left =  insert(node.left, val);
			}
			
			else {
				node.right = insert(node.right, val);
			}
		}
		
		return node;
	}
	
	public void inOrder(TreeNode root) {	//l n r
			
			if (root == null) return;
			
			inOrder(root.left);
			System.out.print(root.data + "-");
			inOrder(root.right);
	}
	
}
