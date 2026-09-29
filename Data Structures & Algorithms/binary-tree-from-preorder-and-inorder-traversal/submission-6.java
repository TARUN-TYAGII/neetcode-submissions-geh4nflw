class Solution {
    int preidx=0;
    Map<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i], i);
        }
        return dfs(preorder, 0, n-1);
    }

    public TreeNode dfs(int[] pre, int l, int r){
        if(l>r) return null;

        int rootval = pre[preidx++];
        TreeNode root = new TreeNode(rootval);
        int mid = map.get(rootval);
        root.left= dfs(pre, l, mid-1);
        root.right= dfs(pre, mid+1,r);
        return root;
    }
}
