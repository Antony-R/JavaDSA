package binarytree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		
		BinaryTree t = new BinaryTree();
		TreeNode root = t.createBinaryTree();
		
		t.preOrder(root);
		System.out.println();
		
		t.postOrder(root);
		System.out.println();
		
		t.inOrder(root);
	}

}
