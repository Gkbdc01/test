    public boolean predictTheWinner(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        return p1>=0;
    }
    public static int win(int[] arr,int i , int j,int[][] dp){
        if(i>=j){
            return arr[i];
        }
        return dp[i][j] = Math.max(arr[i]-win(arr,i+1,j,dp),arr[j]-win(arr,i,j-1,dp));
        for(int[] m : dp){
            Arrays.fill(m,-1);
        }
        int p1 = win(nums,0,nums.length-1,dp);
        if(dp[i][j] != -1){
            return dp[i][j];
        }
    }
}