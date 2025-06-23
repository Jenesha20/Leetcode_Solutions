class Solution {
    public int maxConsecutiveAnswers(String a, int k) {
        int[] c=new int[2];
        int l=0,m=0;
        for(int r=0;r<a.length();r++)
        {
            if(a.charAt(r)=='T')
            c[0]++;
            else
            c[1]++;
            m=Math.max(m,Math.max(c[0],c[1]));
            if((r-l+1)-m >k)
            {
                c[a.charAt(l) == 'T' ? 0 : 1]--;
                l++;
            }
        }
        return a.length()-l;
    }
}