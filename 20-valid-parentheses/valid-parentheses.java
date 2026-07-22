class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> hmap=new HashMap<>();
        hmap.put(')','(');
        hmap.put(']','[');
        hmap.put('}','{');
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hmap.containsKey(c)){
                if(stack.isEmpty()||stack.pop()!=hmap.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}