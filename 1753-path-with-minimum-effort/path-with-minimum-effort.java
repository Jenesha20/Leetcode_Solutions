class Solution {
    class Pair
    {
        int r,c;
        int e;
        Pair(int r,int c,int e)
        {
            this.r=r;
            this.c=c;
            this.e=e;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int[] dr={0,1,0,-1};
        int[] dc={1,0,-1,0};
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] vis=new boolean[m][n]; 
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> a.e-b.e);
        pq.add(new Pair(0,0,0));
        vis[0][0]=true;
        while(!pq.isEmpty())
        {
            Pair cur=pq.poll();
            int row=cur.r;
            int col=cur.c;
            int effort=cur.e;
            // if(vis[row][col])
            // continue;
            vis[row][col]=true;
            if(row==m-1 && col==n-1)
            return effort;
            for(int i=0;i<4;i++)
            {
                int nr=row+dr[i];
                int nc=col+dc[i];
                if(nr>=0 && nr<m && nc>=0 && nc<n && !vis[nr][nc])
                {
                    int diff=Math.abs(heights[row][col] -heights[nr][nc]);
                    int ne = Math.max(effort, diff);
                    pq.add(new Pair(nr,nc,ne));
                }

            }
        }
        return 0;
    }
}