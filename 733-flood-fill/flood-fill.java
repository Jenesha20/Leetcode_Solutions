class Node
{
    int r,c;
    Node(int r,int c)
    {
        this.r=r;
        this.c=c;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Node> q=new LinkedList<>();
        int x=image[sr][sc];
        if(x==color)
        return image;
        q.add(new Node(sr,sc));
        image[sr][sc]=color;
        int[] dr={1,0,-1,0};
        int[] dc={0,1,0,-1};
        while(!q.isEmpty())
        {
           int r=q.peek().r;
           int c=q.peek().c;
           q.poll();
           for(int i=0;i<4;i++)
           {
            int nrow=r+dr[i];
            int ncol=c+dc[i];
            if((nrow>=0 && nrow<image.length && ncol>=0 && ncol<image[0].length) && image[nrow][ncol]==x)
            {
                q.add(new Node(nrow,ncol));
                image[nrow][ncol]=color;
            }
           }
        }
        return image;
    }
}