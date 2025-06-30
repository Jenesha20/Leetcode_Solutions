class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        adj.add(new ArrayList<>());
        for(int[] x:prerequisites)
        {
            int u=x[0];
            int v=x[1];
            adj.get(u).add(v);
        }
        boolean[] vis=new boolean[numCourses];
        boolean[] cur=new boolean[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(!vis[i])
            {
                if(dfs(adj,vis,cur,i))
                return false;
            }
        }
        return true;
    }
    public static boolean dfs(List<List<Integer>> adj,boolean[] vis,boolean[] cur,int i)
    {
        vis[i]=true;
        cur[i]=true;
        for(int neigh:adj.get(i))
        {
            if(!vis[neigh])
            {
                if(dfs(adj,vis,cur,neigh))
                return true;
            }
            else if(cur[neigh])
            return true;
        }
        cur[i]=false;
        return false;
    }
}