package lowlevel;

public class leet_226 {

    public static void main(String[] args) {

//    solution([4,2,7,1,3,6,9])
    }

    public static class TreeNode {
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

    public static TreeNode solution(TreeNode root) {

        if(root==null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        solution(root.left);
        solution(root.right);

        return root;
    }
}
