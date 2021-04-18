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
		System.out.println();
		
		System.out.println(t.levelOrder(root));
		
		t.invertTree(root);
		
		System.out.println(t.levelOrder(root));
		
		System.out.println("Max-Depth: " + t.maxDepth(root));
		System.out.println("Min-Depth: " + t.minDepth(root));
	}

}
