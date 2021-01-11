package leetcode104;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		
		// 1,3,4,6,7,8,10,13,14
		
		tree.addTreeNode(8);
		tree.addTreeNode(3);
		tree.addTreeNode(6);
		tree.addTreeNode(10);
		tree.addTreeNode(4);
		tree.addTreeNode(7);
		tree.addTreeNode(1);
		tree.addTreeNode(14);
		tree.addTreeNode(13);
		
		tree.traverse();
		
		FindMaximumDepthofBinaryTreeFunction solution = new FindMaximumDepthofBinaryTreeFunction();
		
		System.out.println("Solution: " + solution.maxDepth(tree.root));
		
	}
}
