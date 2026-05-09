/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "N";
        StringBuilder res = new StringBuilder(); 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();

            if(node==null){
                res.append("N,");
            }else{
                res.append(node.val).append(",");
                q.add(node.left);
                q.add(node.right);
            }
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strs = data.split(",");
        if(strs[0].equals("N")) return null;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
        q.add(root);
        int index=1;

         while (!q.isEmpty() && index < strs.length) {

        TreeNode node = q.poll();

        // left child
        if (index < strs.length && !strs[index].equals("N")) {

            node.left = new TreeNode(Integer.parseInt(strs[index]));

            q.add(node.left);
        }

        index++;

        // right child
        if (index < strs.length && !strs[index].equals("N")) {

            node.right = new TreeNode(Integer.parseInt(strs[index]));

            q.add(node.right);
        }

        index++;
    }

    return root;
    }
}































