package binarytree;

public class BinarySearchTest {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		TreeNode root = null;
		
		root = bst.insert(root, 8);
		TreeNode mainRoot = root;
		root = bst.insert(root, 3);
		root = bst.insert(root, 6);
		root = bst.insert(root, 10);
		root = bst.insert(root, 4);
		root = bst.insert(root, 7);
		root = bst.insert(root, 1);
		root = bst.insert(root, 14);
		root = bst.insert(root, 13);
		
		bst.inOrder(mainRoot);
	}

}
