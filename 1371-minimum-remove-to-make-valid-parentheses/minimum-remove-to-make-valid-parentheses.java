class Solution {
    public String minRemoveToMakeValid(String s) {
       StringBuilder ans=new StringBuilder();
       int open=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                open++;
                ans.append(c);
            }
            else if(c==')'){
                if(open>0){
                    open--;
                    ans.append(c);
                }
            }
            else{
                ans.append(c);
            }
        }
        StringBuilder result=new StringBuilder();
        int open1=open;
        for(int i=ans.length()-1;i>=0;i--){
            char ch=ans.charAt(i);
            if(ch=='(' && open1>0){
                open1--;
                continue;
            }
            else{
                result.append(ch);
            }
        }
        return result.reverse().toString();
        
    }
}