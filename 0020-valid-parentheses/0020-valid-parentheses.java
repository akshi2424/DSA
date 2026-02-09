class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.isEmpty() || ch=='[' || ch=='{' || ch=='('){
                st.push(ch);
            }
            else{
                char temp=st.peek();
                if((temp=='[' && ch==']') || (temp=='(' && ch==')') || (temp=='{' && ch=='}'))st.pop();
                else return false;
            }
        }
        if(!st.isEmpty())return false;
        return true; 
    }
}