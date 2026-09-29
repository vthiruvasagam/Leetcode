class Solution {
    public int subtractProductAndSum(int n) {
        int result=0;
        int prod=1;
        int sum=0;
        while(n>0)
        {
           int z=n%10;
            n=n/10;
            prod=prod*z;
            sum=sum+z;
            
            
            
        }
        result=prod-sum;
        
        
        return result;

        
    }
}