class Solution {
    public String frequencySort(String s) {
       StringBuilder sb=new StringBuilder();
       TreeMap<Character,Integer> hmap=new TreeMap<>();
       for(char x:s.toCharArray())
       hmap.put(x,hmap.getOrDefault(x,0)+1);
       PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>(
        (a,b) -> b.getValue()-a.getValue()
       );
       pq.addAll(hmap.entrySet());
       while(!pq.isEmpty())
       {
        Map.Entry<Character,Integer> e=pq.poll();
        sb.append(String.valueOf(e.getKey()).repeat(e.getValue()));
       }
       return sb.toString();
    }
}