package leetcode104;

public class FindMaximumDepthofBinaryTreeFunction {
    public int maxDepth(TreeNode root) {
        // If node is null, return 0 since we don't count them
        if(root == null){
            return 0;
        }
        
        // always return 1 + because we are counting the current root as 1 level
        // Math.max since we don't know which child have the deeper depth
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    
    
    // Another way to do it
    int maxLevel = 0;
    
    public int maxDepth1(TreeNode root){
    	if(root == null){
    		return 0;
    	}
    	
    	// Since there should be at least one level if root exist
    	dfs(root, 1);
    	
    	return maxLevel;
    }
    
    public void dfs(TreeNode root, int level){
    	// Do nothing when root is null
    	if(root == null){
    		return;
    	}
    	
    	// Keep comparing 
    	maxLevel = Math.max(maxLevel, level);
    	
    	// Increase the level everytime
    	dfs(root.left, level + 1);
    	
    	dfs(root.right, level + 1);
    }
    
}
