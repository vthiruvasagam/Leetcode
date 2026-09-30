class Solution {
    public int addDigits(int num) {
        while(num>=10)
        {
        int sum=0;
        while(num>0)
        {
            int z=num%10;
            num=num/10;
            sum=sum+z;
            
        }
        num=sum;
        }

        return num;
    }
}