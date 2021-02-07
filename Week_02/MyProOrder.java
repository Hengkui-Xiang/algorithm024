// 二叉树前序遍历  根-> 左-> 右
// 方式1 递归
class Solution1 {
    public List<Integer> preorderTraversal(TreeNode root) {
           List<Integer> list =new ArrayList<Integer>();
           preorder(root,list);
           return list;
    }
    public void preorder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        //根
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
}
// 方式2： 栈
class Solution2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        Deque<TreeNode> stk=new LinkedList<TreeNode>();
        // Stack<TreeNode> stk=new Stack<TreeNode>();
        while(root!=null||!stk.isEmpty()){
            while(root!=null){
                list.add(root.val);
                stk.push(root);
                root=root.left;
            }
            root=stk.pop();
            root=root.right;
        }
        return list;
    }
}