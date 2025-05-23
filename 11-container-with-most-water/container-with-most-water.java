class Solution {
    public int maxArea(int[] height) {
      int l=0,r=height.length-1;
      int max=0;
      while(l<r)
      {
        int h=Math.min(height[l],height[r]);
        int dis=h*(r-l);
        max=Math.max(max,dis);
        if(height[l]<height[r])
        l++;
        else
        r--;
      }
      return max;
    }
}