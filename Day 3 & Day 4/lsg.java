class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int took=1;
        int max=1;
        if (nums == null || nums.length == 0) {
            return 0;
        }

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if((nums[i-1]+1)==nums[i]){
                took+=1;
                
            }
            else{
                max=Math.max(took,max);
                took=1;
            }
        
        }
        return Math.max(max,took);
    }
}