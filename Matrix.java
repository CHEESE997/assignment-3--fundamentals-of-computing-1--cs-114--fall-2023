public class Matrix {
  private int[][] matrix;
  private final int lengthOfMatrix;


  public Matrix(int size){
    matrix = new int[size][size];
    lengthOfMatrix = size;
  }

  public void printMatrix(){
    //row
      for(int i = 0; i<lengthOfMatrix; i++) {
        //column
       for(int j = 0; j<lengthOfMatrix; j++) {
        System.out.print(matrix[i][j] + " ");

        }
      System.out.println();

      }
    }
  public void populateMatrix(){
    //row
    for(int i = 0; i<lengthOfMatrix; i++) {
      //column
      for(int j = 0; j<lengthOfMatrix; j++) {
         matrix[i][j] = (lengthOfMatrix*i+j);
      }
    }
  }

  public void flipMatrix(){
    for(int i=0;i<lengthOfMatrix-1;i++){
      for(int j=0;j<(lengthOfMatrix-1-i);j++){
      swap(i, j, lengthOfMatrix-1-j, lengthOfMatrix-1-i);
      }
    }
  }


 private void swap (int x1,int y1,int x2,int y2) {
    int[][] temparray = new int[1][1];
    temparray[0][0] = matrix[x1][y1];

    matrix[x1][y1]= matrix[x2][y2];
    matrix[x2][y2]= temparray[0][0];
  }
}
