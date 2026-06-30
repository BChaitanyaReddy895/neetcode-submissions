class Solution {
    public int hammingWeight(int n) {
        Stack<Integer> st=new Stack<>();
       while(n>0){
        st.add(n%2);
        n/=2;
       }
       int count=0;
       for(int num:st){
        if(num==1) count++;
       }
       return count;
    }
}
