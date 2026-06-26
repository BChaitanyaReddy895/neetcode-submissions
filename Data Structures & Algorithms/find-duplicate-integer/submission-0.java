class Solution {
    public int findDuplicate(int[] nums) {
        int ele=0;
        int xor=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                xor=nums[i]^nums[j];
                if(xor==0){
                    ele=nums[j];
                    break;
                }
            }
        }
        return ele;
    }
}
