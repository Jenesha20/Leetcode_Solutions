class Solution {
    public int trap(int[] height) {
    //   int[] l=new int[height.length];
    //   int[] r=new int[height.length];
    //   int t=0;
    //   l[0]=height[0];
    //   r[height.length-1]=height[height.length-1];
    //   for(int i=1;i<height.length;i++)
    //   {
    //     l[i]=Math.max(l[i-1],height[i]);
    //   }
    //   for(int i=height.length-2;i>=0;i--)
    //   {
    //     r[i]=Math.max(r[i+1],height[i]);
    //   }
    //   for(int i=0;i<height.length;i++)
    //   {
    //     t+=Math.min(l[i],r[i])-height[i];
    //   }
    //   return t;
    int l=0,r=height.length-1,w=0;
    int lm=height[l],rm=height[r];
    while(l<r)
    {
        if(lm<rm)
        {
            l++;
            lm=Math.max(lm,height[l]);
            w+=lm-height[l];
        }
        else
        {
            r--;
            rm=Math.max(rm,height[r]);
            w+=rm-height[r];
        }
    }
    return w;
    }
}