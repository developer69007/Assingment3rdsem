class Solution {
    public String reverseWords(String s) {
        String rev = "",k="";int i;
        for(i = 0 ; i<s.length();i++){
            char x = s.charAt(i);
            if(x!=' '){
            k = k+ x;
            }
             else if(!k.equals("")){
        rev=k+" "+rev;
        k="";
        }
        
        }
        if(!k.equals("")){
        rev=k+" "+rev;
        
        }
        return rev.trim();
    }
}