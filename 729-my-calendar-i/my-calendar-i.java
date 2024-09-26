class MyCalendar {
    TreeMap<Integer,Integer> l;
    public MyCalendar() {
        l=new TreeMap();
    }
    
    public boolean book(int start, int end) {
         Integer p=l.floorKey(start);
         Integer n=l.ceilingKey(start);
         if((p==null || (l.get(p)<=start)) && (n==null ||(end<=n)))
         {
            l.put(start,end);
            return true;
         }
         return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */