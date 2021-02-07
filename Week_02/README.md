学习笔记

### 二叉树
节点数据结构
```
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }
```
  
1. 二叉树的中序遍历
- 解决1 递归方式：
```
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //定义ArrayList存放遍历后的结果
        List<Integer> list=new ArrayList<Integer>();
        //定义遍历方法
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
        //根加入list
        list.add(root.val);
        //右子树
        inorder(root.right,list);
    }
}
```


- 解决2 Stack，迭代算法
递归的时候隐式地维护了一个栈，而我们在迭代的时候需要显式地将这个栈模拟出来
<br>输入：
```
        1
      /   \
     2      3
   /  \    /
  4    5  6
```
中序遍历  左-> 根->右
思路：
每到一个节点 A，因为根的访问在中间，将 A 入栈。然后遍历左子树，接着访问 A，最后遍历右子树。
在访问完 A 后，A 就可以出栈了。因为 A 和其左子树都已经访问完成。
```
stack: 
push:[1,2,4]   []
4 左子树为null，最左节点,出栈左+根
pop:[4]        [4]
pop:[2]        [4,2]
右节点5入栈
push:[1,5]
右节点5无左右节点，5出栈
pop:[5]        [4,2,5]
左子树遍历完毕，根节点1出栈
pop:[1]        [4,2,5,1]
push:[3]
push:[6]
6左子树为null,右子树的最左节点，出栈
pop:[6]        [4,2,5,1,6]
pop:[3]        [4,2,5,1,6,3]
输出:[4,2,5,1,6,3]
```
算法：
```
l;
s;
while(p!=null||!s.isEmpty){
    while(p){
        s.push(p);
        p=p.left;
    }
    p=s.pop();
    list.add(p.val);
    p=p.right;
}
return l;
```

2.二叉树前序遍历<br>
- 解决1 递归
```
class Solution {
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
           //左
           preorder(root.left,list);
           //右
           preorder(root.right,list);
       }
   }

```


- 方式2：栈<br>
根->左->右<br>
算法：
```
l;
s;
while(p!=null||!s.isEmpty){
    while(p){
        list.add(p.val);
        s.push(p);
        p=p.left;
    }
    p=s.pop();
    p=p.right;
}
return l;
```
3.二叉树后续遍历

- 解决1 递归
```
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<Integer>();
        postorder(root,list);
        return list;
    }
    public void postorder(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        //左
        postorder(root.left,list);
        //右
        postorder(root.right,list);
        //根
        list.add(root.val);
    }
}
```
- 方式2 stack，左-> 右-> 根<br>
算法：
```
;l;
s;
pre=null;
while(p!=null||!s.isEmpty){
    while(p){
        s.push(p);
        p=p.left;
    }
    //找到最左
    p=s.pop();
    if(p.right==null||p.right==pre){
        //加入
        l.add(p.val);
        pre=p;
        p=null;
    }else{
        s.push(p);
        p=p.right;
    }
}
return l
```


