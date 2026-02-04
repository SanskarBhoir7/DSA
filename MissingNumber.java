class Solution {
    public int missingNumber(int[] nums) {
        int sum=0,sumz=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            sumz+=i;
        }
        return sumz-sum;
    }
}
