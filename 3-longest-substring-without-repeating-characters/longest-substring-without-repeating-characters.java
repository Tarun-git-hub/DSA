class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = Integer.MIN_VALUE;
        while(end<n){
            char ch = s.charAt(end);
            if(map.containsKey(ch) && map.get(ch)>=start){
                start=map.get(ch)+1;
            }
            map.put(ch,end);
            maxLen = Math.max(maxLen,end-start+1);
            end++;
        }
        return (maxLen==Integer.MIN_VALUE)? 0 : maxLen;
    }
}