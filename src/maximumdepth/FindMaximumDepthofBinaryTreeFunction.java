package maximumdepth;

public class FindMaximumDepthofBinaryTreeFunction {
    public int maxDepth(TreeNode root) {
        // If node is null, return 0 since we don't count them
        if(root == null){
            return 0;
        }
        
        // always return 1 + because we are counting the current root as 1 level
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
