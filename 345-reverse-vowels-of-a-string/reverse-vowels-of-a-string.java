class Solution {
    public String reverseVowels(String s) {
    String str="aeiouAEIOU";
    String res="";
    for(int i=s.length()-1;i>=0;i--)
    {
        if(str.contains(String.valueOf(s.charAt(i))))
        {
            res+=s.charAt(i);
        }
    }
    String ans="";
    int j=0;
    for(int i=0;i<s.length();i++)
    {
        if(str.contains(String.valueOf(s.charAt(i))))
        {
            ans+=res.charAt(j);
            j++;
        }
        else{
            ans+=s.charAt(i);
        }
    }
    return ans;
    }  
}