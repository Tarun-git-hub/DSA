class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque<>();

        for(char ch: num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        // if k is pending
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        ans.reverse();
         // if any leading 0s
        int idx = 0;
        while(idx<ans.length() && ans.charAt(idx)=='0'){
            idx++;
        }
        String result = ans.substring(idx);
        if(result.length()==0){
            return "0";
        }
        else{
            return result;
        }
    }
}