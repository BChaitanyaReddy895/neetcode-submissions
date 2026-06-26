class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLen=0;
        HashSet<Character> hs=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left=left+1;
                
            }
            hs.add(s.charAt(right));
            if(maxLen<right-left+1) maxLen=right-left+1;
        }
        return maxLen;
        
        
    }
}
