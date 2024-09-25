class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] a={-1,-1};
       int l=bi(nums,target,true);
       int r=bi(nums,target,false);
       a[0]=l;
       a[1]=r;
       return a;
    }
    public int bi(int[] nums,int target,boolean is)
    {
        int l=0,r=nums.length-1;
        int i=-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>target)
            r=mid-1;
            else if(nums[mid]<target)
            l=mid+1;
            else
            {
                i=mid;
                if(is)
                r=mid-1;
                else
                l=mid+1;
            }
        }
        return i;
    }
}