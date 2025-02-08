import java.util.*;

class NumberContainers {
    private Map<Integer, TreeSet<Integer>> map;  
    private Map<Integer, Integer> indexMap;      

    public NumberContainers() {
        map = new HashMap<>();
        indexMap = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexMap.containsKey(index)) {
            int oldNumber = indexMap.get(index);
            if (map.containsKey(oldNumber)) {
                map.get(oldNumber).remove(index);
                if (map.get(oldNumber).isEmpty()) {
                    map.remove(oldNumber);
                }
            }
        }

        indexMap.put(index, number);
        map.putIfAbsent(number, new TreeSet<>());
        map.get(number).add(index);
    }

    public int find(int number) {
        if (map.containsKey(number) && !map.get(number).isEmpty()) {
            return map.get(number).first();
        }
        return -1;
    }
}
