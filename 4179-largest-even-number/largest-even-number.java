class Solution {
    public String largestEven(String s) {
        int ind=-1;
       if(s.contains("2"))
       {
        ind=s.lastIndexOf("2");
       }
       if(ind>=0)
       {
        return s.substring(0,ind+1);
       }
       else{
        return "";
       }
    }
}