class Solution {
    public int mergesort(int[] nums,int l,int r)
    {
        if(l>=r)
        return 0;
        int mid=l+(r-l)/2;
        int c=mergesort(nums,l,mid)+mergesort(nums,mid+1,r);
        int j=mid+1;
        for(int i=l;i<=mid;i++)
        {
            while(j<=r && nums[i]>2L*nums[j])
            {
                j++;
            }
            c+=j-(mid+1);
        }
        merge(nums,l,mid,r);
        return c;
    }
    void merge(int[] nums,int l,int mid,int r)
    {
        int[] temp=new int[r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=r)
        {
            if(nums[i]<=nums[j])
            {
                temp[k++]=nums[i++];
            }
            else
            {
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=nums[i++];
        }
        while(j<=r)
        {
            temp[k++]=nums[j++];
        }
        System.arraycopy(temp,0,nums,l,temp.length);
    }
    public int reversePairs(int[] nums) {
      if(nums==null || nums.length==0)
      return 0;
      return mergesort(nums,0,nums.length-1);
    }
}