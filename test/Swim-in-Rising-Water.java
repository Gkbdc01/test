            if (seen.contains(key)) continue;
            seen.add(key);
            
            if (r == m-1 && c == n-1) return max_d;
            
            String key = r + "," + c;
            int[] curr = pq.poll();
            int max_d = curr[0], r = curr[1], c = curr[2];
            
        pq.offer(new int[]{grid[0][0], 0, 0});
        
        while (!pq.isEmpty()) {
        int m = grid.length, n = grid[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        Set<String> seen = new HashSet<>();
        
class Solution {
    public int swimInWater(int[][] grid) {