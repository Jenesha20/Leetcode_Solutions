class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
int chunks=0,max=0;
for(int i=0;i<n;i++){
max=Math.max(arr[i],max);
if(max==i){
chunks++;
}
}
return chunks;
    }
}