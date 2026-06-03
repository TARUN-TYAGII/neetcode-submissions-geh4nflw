class Solution {
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return list.get(k-1);     
    }

    public void inorder(TreeNode root, int k){
        if(root==null) return ;
        inorder(root.left, k);
        list.add(root.val);
        inorder(root.right,k);
    }
}
