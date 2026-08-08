class Solution {
    public int largestAltitude(int[] gain) {
        int n=0;
        int s=0;
        for(int i=0;i<gain.length;i++)
        {
            s=s+gain[i];
            n=Math.max(n,s);

        }
        return n;
        
    }
}