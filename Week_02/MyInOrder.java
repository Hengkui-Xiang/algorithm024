// 二叉中序遍历  左-> 根 -> 右
// 方式1 递归
class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        inorder(root,list);
        return list;
    }
    //定义中序遍历
    public void inorder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        //左子树
        inorder(root.left,list);
        //根
        list.add(root.val);
        //右子树
        inorder(root.right,list);
    }
}
// 方式2： 栈
class Solution2 {
    //递归方式
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inOrder(root, list);
        return list;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}