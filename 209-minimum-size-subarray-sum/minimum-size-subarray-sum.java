    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int mi=Integer.MAX_VALUE;
            int left=0;
                  int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                  sum += nums[i];
                while(sum>=target)
                   {
                     mi=Math.min(mi,i-left+1);
                     sum -= nums[left];
                     left++;
                   }
                }    
            
             if(mi==Integer.MAX_VALUE)
                 return 0;
        return mi; 
        }
    }