class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();

        for(int[] interval :intervals){
            if(merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]){
                merged.add(interval); //No overlap
            }else{ //overlap
                merged.get(merged.size() -1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }

        }

        return merged.toArray(new int[merged.size()][]);
       
        
    }
}