class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left=0;
        boolean flag=true;
        for(int right=s.length()-1;right>=0;right--){
            if(s.charAt(left)!=s.charAt(right)) {
                flag=false;
                break;
            }
            left++;
        }
        return flag;
    }
}
