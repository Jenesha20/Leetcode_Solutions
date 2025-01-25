class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(max<=candies[i])
            {
                max=candies[i];
            }
        }
        int s=max-extraCandies;
        for(int i=0;i<candies.length;i++)
        {
            if(s>candies[i])
            {
                l.add(false);
            }
            else
            l.add(true);
        }
        return l;
    }
}