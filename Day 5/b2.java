class Solution {
    public boolean isboolean(int []nums,int m,int k,int d){
        int took=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=d){
                took+=1;
            }
            else{
                took=0;
            }
            if(took==k){
                m=m-1;
                took=0;
            }
            if(m==0){
                return true;
            }
            
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isboolean(bloomDay,m,k,mid)){
                r=mid-1;
            }
            else{
               l= mid+1;
            }

        }
        if(l==(int)Math.pow(10,9)+1){
            return -1;
        }
        return l;
    }
}