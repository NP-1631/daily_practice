class Solution {
    public boolean isAnagram(String s, String t) {
        char c[]=s.toCharArray();
        char ch[]=t.toCharArray();
        if(s.length()!=t.length())
        {
            return false;
        }
       Arrays.sort(c);
       Arrays.sort(ch);
       if(Arrays.equals(c,ch))
       {
        return true;
       }
        return false;
    }
}