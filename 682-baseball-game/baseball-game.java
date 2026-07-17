class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> s=new Stack<>();
        for(String o:operations)
        {
            if(o.equals("C"))
            {
                s.pop();
            }
            else if( o.equals("D"))
            {
                s.push(2*s.peek());
            }
            else if (o.equals("+"))
            {
                int f=s.pop();
                int se=s.peek();
                s.push(f);
                s.push(se+f);
            }
            else{
                s.push(Integer.parseInt(o));
            }
        }
        int sum=0;

        while(!s.isEmpty())
        {
            sum+=s.pop();
        }
        return sum;
    }
}