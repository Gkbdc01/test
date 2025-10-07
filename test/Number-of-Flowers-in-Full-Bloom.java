            int bloomStart = upperBound(starts, time); 
            int bloomEnd = lowerBound(ends, time);     
        
        int[] res = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            int time = people[i];
        
        Arrays.sort(starts);
        Arrays.sort(ends);
            starts[i] = flowers[i][0];
            ends[i] = flowers[i][1];
        }
        int[] ends = new int[n];
        
        for (int i = 0; i < n; i++) {
        int n = flowers.length;
        int[] starts = new int[n];
class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {