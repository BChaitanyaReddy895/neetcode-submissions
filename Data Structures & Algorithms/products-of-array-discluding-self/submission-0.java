class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int res[]=new int[nums.length];
        int pref[]=new int[nums.length];
        int suff[]=new int[nums.length];
        pref[0]=1;
        suff[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pref[i]=nums[i-1]*pref[i-1];
        }
        for(int j=n-2;j>=0;j--){
            suff[j]=nums[j+1]*suff[j+1];
        }
        for(int i=0;i<n;i++) res[i]=pref[i]*suff[i];
        return res;
    }
}  
