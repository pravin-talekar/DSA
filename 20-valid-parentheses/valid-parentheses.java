class Solution {
    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') { //opening
                st.push(ch);
            }else {  // closing
                if(st.size() == 0){
                    return false;
                }
                if(st.peek() == '(' && ch == ')' || st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']') {
                    st.pop();
                }else {  // no match
                    return false;
                }
            }
        }
        return st.size() == 0;
    }
}