// 两数之和,返回数组下标
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //定义数组，存放结果
        int a[] = new int[2];
        //遍历
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                //两数之和=target
                if (nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return new int [0];
    }
}