public class Main {
  static int c=0,d=0;
  static int e=0;

  static int [][]matrix;
  public static int cuttingRod(int[] prices, int n, int index,int finalPrice){
    c++;
    if(index>=prices.length){
      return 0;
    }
    if(n<0){
      return 0;
    }
    if(n==0){
      return finalPrice;
    }

    return max(cuttingRod(prices, n, index+1, finalPrice), cuttingRod(prices, n-index-1, index, finalPrice+prices[index])); 
  }

  static int max(int a, int b){
    if(a<b){
      return b;
    }
    return a;
  }

  public static int cuttingRodUsingMemoization(int[] prices, int n, int index,int finalPrice){
    d++;
    if(matrix==null){
      matrix=new int[n+2][prices.length+1];
    }
    if(index>=prices.length){
      return 0;
    }
    if(n<0){
      return 0;
    }
    if(n==0){
      matrix[index][n]=finalPrice;
      return matrix[index][n];
    }
    if(matrix[index][n]!=0){
      return matrix[index][n];
    }
    matrix[index][n]=max(cuttingRodUsingMemoization(prices, n, index+1,finalPrice), cuttingRodUsingMemoization(prices, n-index-1, index,finalPrice+prices[index]));
    return matrix[index][n];
  }

  public static void displayMatrix(int matrix[][]){
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        System.out.print(matrix[i][j]+"   ");
      }
      System.out.println();
    }
  }

  public static int cuttingRodUsingTabulation(int[] prices, int n){
    int matrix[][]=new int[prices.length+1][n+1];
    for(int i=1;i<matrix.length;i++){
      for(int j=1;j<matrix[0].length;j++){
        if(j<i){
          matrix[i][j]=max(matrix[i-1][j],matrix[i][j-1]);
        }
        else{
          matrix[i][j]=max(matrix[i][j-1],max(matrix[i-1][j],matrix[i-1][j-i]+prices[i-1]));
          if(j%i==0){
            matrix[i][j]=max(matrix[i][j],matrix[i][j-i]+prices[i-1]);
          }
        }
      }
    }
    displayMatrix(matrix);
    return matrix[prices.length][n];
  }

  
  public static void main(String[] args) {
    System.out.println(cuttingRod(new int[]{3,5,8,9,10,17,17,20,24,30}, 8, 0, 0)+" "+c);
    System.out.println(cuttingRodUsingMemoization(new int[]{3,5,8,9,10,17,17,20,24,30}, 8, 0, 0)+" "+d);
    System.out.println(cuttingRodUsingTabulation(new int[]{3,5,8,9,10,17,17,20,24,30}, 8));
    // displayMatrix();
  }
}