package maximumdepth;

public class BinaryTree {

	TreeNode root;

	public void traverse() {
		if (root != null) {
			TreeNode nodeToTraverse = root;

			if (nodeToTraverse.left != null) {
				inorder(nodeToTraverse.left);
			}
			
			// We need this since it will be done with the left side, we have to print out the root
			System.out.print(nodeToTraverse.val + " ");
			
			if (nodeToTraverse.right != null) {
				inorder(nodeToTraverse.right);
			}

		}
	}

	private void inorder(TreeNode node) {
		
		if (node.left != null) {
			inorder(node.left);
		}

		System.out.print(node.val + " ");

		if (node.right != null) {
			inorder(node.right);
		}
	}

	public void addTreeNode(int value) {

		TreeNode nodeToAdd = new TreeNode(value);

		if (root == null) {
			root = nodeToAdd;
		}

		traverseAndAddNode(root, nodeToAdd);
	}

	private void traverseAndAddNode(TreeNode node, TreeNode nodeToAdd) {
		if (nodeToAdd.val < node.val) {
			if (node.left == null) {
				node.left = nodeToAdd;
			} else {
				traverseAndAddNode(node.left, nodeToAdd);
			}
		} else if (nodeToAdd.val > node.val) {
			if (node.right == null) {
				node.right = nodeToAdd;
			} else {
				traverseAndAddNode(node.right, nodeToAdd);
			}
		}
	}
}
