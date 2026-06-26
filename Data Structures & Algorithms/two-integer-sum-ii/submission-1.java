class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        while(high>=0){
            int sum=numbers[low]+numbers[high];
            if(sum==target) return new int[]{low+1,high+1};
            else if(sum<target) low=low+1;
            else high=high-1;
        }
        return new int[]{};
        
    }
}
