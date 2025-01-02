// class Solution {
//     public int[] vowelStrings(String[] words, int[][] q) {
//        int r= q.length;
//        int[] res=new int[r];
//        int k=0;
//        List<Character> l=Arrays.asList('a','e','i','o','u');
//        for(int i=0;i<r;i++)
//        {
//         int x=q[i][0];
//         int y=q[i][1];
//         int c=0;
//         for(int j=x;j<=y;j++)
//         {
//             char[] ns=words[j].toCharArray();
//             if(l.contains(ns[0]) && l.contains(ns[ns.length-1]))
//            {
//              c++;
//            }
//         }
//         res[k++]=c;
//        }
//        return res;
//     }
// }
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] Prefix = new int[n + 1];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < n; i++) {
            Prefix[i + 1] = Prefix[i];
            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                Prefix[i + 1]++;
            }
        }

        int[] ANS = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ANS[i] = Prefix[queries[i][1] + 1] - Prefix[queries[i][0]];
        }
        return ANS;
    }
}