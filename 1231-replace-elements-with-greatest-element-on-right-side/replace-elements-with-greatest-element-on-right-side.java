class Solution {
    public int[] replaceElements(int[] arr) {
      
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
              int amx=-1;
            for(int j=i+1;j<arr.length;j++)
            {
                amx=Math.max(amx,arr[j]);
            }
            res[i]=amx;
        }

       return res;
        
    }
}