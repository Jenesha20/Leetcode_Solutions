// class Solution {
//     public boolean exist(char[][] board, String word) {
//         int m=board.length;
//         int n=board[0].length;
//         boolean[][] vis=new boolean[m][n];
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 vis[i][j]=false;
//             }
//         }
//         char[] w=word.toCharArray();
//         List<Character> l=new ArrayList<>();
//         for(char x:w)
//         l.add(x);
//         int[] dr={1,0,-1,0};
//         int[] dc={0,1,0,-1};
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(l.contains(board[i][j]) && !vis[i][j])
//                 {
//                     int in=l.indexOf(board[i][j]);
//                     l.remove(in);
//                     vis[i][j]=true;
//                     for(int k=0;k<4;k++)
//                     {
//                         int nr=i+dr[k];
//                         int nc=j+dr[k];
//                         if(nr>=0 && nr<m && nc>=0 && nc<n && !vis[nr][nc] && l.contains(board[nr][nc]))
//                         {
//                             vis[nr][nc]=true;
//                             int inn=l.indexOf(board[nr][nc]);
//                             l.remove(inn);
//                         }
//                     }   
//                 }
//             }
//         }
//         return l.size()==0;
//     }
// }

class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int row, int col) {
        if (index == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
            || board[row][col] != word.charAt(index)) {
            return false;
        }
        
        char temp = board[row][col];
        board[row][col] = '#'; // Mark as visited

        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};

        for (int k = 0; k < 4; k++) {
            if (dfs(board, word, index + 1, row + dr[k], col + dc[k])) {
                return true;
            }
        }
        board[row][col] = temp; // Backtrack
        return false;
    }
}
