public class T1302 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int max = -1;
    int ans = 0;

    public void dfs(TreeNode root, int deep) {
        if (root == null) {
            return;
        }
        if (deep > max) {
            max = deep;
            ans = root.val;
        } else if (deep == max) {
            ans += root.val;
        }
        dfs(root.left, deep + 1);
        dfs(root.right, deep + 1);
    }

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
}
