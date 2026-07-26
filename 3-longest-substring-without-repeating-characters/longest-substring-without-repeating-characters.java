class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hset=new HashSet<>();
        int left=0;
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            while(hset.contains(s.charAt(i))){
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(s.charAt(i));
            maxLen=Math.max(maxLen,i-left+1);
        }
        return maxLen;
        
    }
}