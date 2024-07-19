public class Main {

  public static int minSteps(int k){
    int[] dp=new int[k+1];
    dp[0]=0;
    dp[1]=1;
    for(int i=2;i<dp.length;i++){
      if(i%2==0){
        dp[i]=dp[i/2]+1;
      }
      else{
        dp[i]=dp[i-1]+1;
      }
    }
    return dp[k];
  }
  
  public static void main(String[] args) {
    System.out.println(minSteps(4));
  }
}