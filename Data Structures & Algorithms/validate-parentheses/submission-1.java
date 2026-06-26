class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') st.push(s.charAt(i));
            else{
                if(st.isEmpty()){
                    flag=false;
                    break;
                }
                char top=st.pop();
                if(s.charAt(i)==')' && top!='('){
                    flag=false;
                    break;
                }
                else if(s.charAt(i)=='}' && top!='{'){
                    flag=false;
                    break;
                }
                else if(s.charAt(i)==']' && top!='['){
                    flag=false;
                    break;
                }
            }
        }
        return flag && st.isEmpty();
        
    }
}
