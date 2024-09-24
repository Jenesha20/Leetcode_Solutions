class Solution {
    public static boolean sum(int[] nums,int k,int valueDiff)
    {
        int j=k,i=0;
        while(j<nums.length)
        {
            if(Math.abs(nums[i]-nums[j])<=valueDiff)
            return true;
            i++;
            j++;
        }
        return false;
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
      if(valueDiff==0)
      {
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i]))
            {
                if(Math.abs(hmap.get(nums[i])-i)<=indexDiff)
                return true;
            }
            hmap.put(nums[i],i);
        }
        return false;
      }
      int j=indexDiff;
      boolean s=false;
      for(int k=1;k<=j;k++)
      {
        s=sum(nums,k,valueDiff);
        if(s)
        return true;
      }
      return false;
    }
}