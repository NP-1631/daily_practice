class Solution {
    public boolean isHappy(int n) {
        int count=0;
        while(count<100)
        {
            int sum=0;
            while(n>0)
            {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if(sum==1) return true;
            n=sum;
            count++;
        }
        return false;
    }
}