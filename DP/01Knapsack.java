class Solution 
{ 
    //Memoization
    static int sol(int index,int w, int wt[], int val[],int n,int[][] dp){
        if(index==0){
            if(wt[0]<=w) return val[0];
            return 0;
        }
        if(dp[index][w]!=-1) return dp[index][w];
        int notPick=sol(index-1,w,wt,val,n,dp);
        int pick=Integer.MIN_VALUE;
        if(wt[index]<=w) pick=val[index]+sol(index-1,w-wt[index],wt,val,n,dp);
        dp[index][w]= Math.max(notPick,pick);
        return dp[index][w];
    }
    //Function to return max value that can be put in knapsack of capacity W.
    //Tabulation method
    static int knapSack(int W, int wt[], int val[], int n) {
        int[][] dp = new int[n + 1][W + 1];
        for(int w=wt[0];w<=W;w++) dp[0][w]=val[0];
        for(int ind=1;ind<n;ind++){
            for(int w=0;w<=W;w++){
                int notPick=dp[ind-1][w];
                int pick=Integer.MIN_VALUE;
                if(wt[ind]<=w) pick=val[ind]+dp[ind-1][w-wt[ind]];
                dp[ind][w]=Math.max(pick,notPick);
            }
        }

    return dp[n-1][W];
}


}
