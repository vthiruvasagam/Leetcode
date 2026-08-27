class Solution {
    public int maximumDifference(int[] nums) {
       // int min=0;
       // int max=0;
        int ans=-1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i<j  && nums[j]>nums[i])
                {
                   ans = Math.max(ans, nums[j] - nums[i]);
                }
            }
        }
        return ans;
        
    }
}