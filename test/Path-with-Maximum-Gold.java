    }
        return max;
   public static int search(int[][] grid , int i , int j){
    int temp = grid[i][j];
    grid[i][j] = 0;
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
        return 0;
    }
    int[] row = {1, -1, 0, 0};
    int[] col = {0, 0, 1, -1};
    for(int d = 0; d < 4; d++){
        maxGold = Math.max(maxGold, search(grid, i + row[d], j + col[d]));
    }
        }
    int maxGold = 0;
    grid[i][j] = temp;
    return temp + maxGold;
}
}