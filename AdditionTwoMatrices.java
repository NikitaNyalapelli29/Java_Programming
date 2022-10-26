public class AdditionTwoMatrices{
  public static void main(String[] args) {
    // create a java program to add two matrices 2*3
        int[][] firstMatrix = {{1, 1, 1},{ 1, 1, 1}};
        int[][] secondMatrix = {{2,2,2},{2,2,2}};
        int[][] add={{0,0,0},{0,0,0}};

        for(int i=0; i<firstMatrix.length; i++){
            for(int k=0;k< firstMatrix[i].length; k++){
                add[i][k] = firstMatrix[i][k]+secondMatrix[i][k];
                System.out.print(add[i][k]+" ");
            }
            System.out.println();
        }

  }
}
