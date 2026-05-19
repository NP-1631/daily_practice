class Solution {
    public String reverseVowels(String s) {
       char arr[]=s.toCharArray();
       int left=0;
       int right=arr.length-1;
       while(left<right)
        {
             if(!isvowel(arr[left]))
            {
            left++;
            }
             else if(!isvowel(arr[right]))
            {
            right--;
            }
        else{
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
       
       }
        return new String(arr);
    }
        public boolean isvowel(char ch)
        {
            String vowels="aeiouAEIOU";
        
        return (vowels.indexOf(ch)!=-1);
        }

    
}