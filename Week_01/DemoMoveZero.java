// 移动零
class Solution {
    public void moveZeroes(int[] nums) {
        //多开一个index
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            //不为0则前移
            if (nums[i] != 0) {
                nums[j] = nums[i];
                //剩余的赋值为0
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}