class Solution {
    public String reverseVowels(String s) {
       Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
       StringBuilder sb=new StringBuilder();
       List<Character> y=new ArrayList<>();
       int i=0;
       for(char x:s.toCharArray())
       {
        if(set.contains(x))
        {
            y.add(x);
        }
       }
       Collections.reverse(y);
       StringBuilder res=new StringBuilder();
       for(char x:s.toCharArray())
       {
        if(set.contains(x))
        {
            res.append(y.get(i++));
        }
        else
        {
            res.append(x);
        }
       }
       return res.toString();
    }
}