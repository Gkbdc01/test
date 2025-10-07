                j++;
            }
            return true;
        }
        if(dp[i][j] != -1){
            return dp[i][j] == 1;
        }
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
                }
                    return false;
                if(p.charAt(j) != '*'){
            while(j<p.length()){
            dp[i][j] = match(s,p,i+1,j+1,dp) ? 1 : 0;
        }else if(p.charAt(j) == '*'){
                dp[i][j] = (match(s,p,i,j+1,dp) || match(s,p,i+1,j,dp) ? 1 : 0);
        }else{
            return false;
            return dp[i][j] == 1;
        }
    }
                return dp[i][j] == 1;