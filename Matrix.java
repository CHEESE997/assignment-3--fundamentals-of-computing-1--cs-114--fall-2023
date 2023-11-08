public class Matrix {
  private int[][] matrix;
  private final int lengthOfMatrix;

  public Matrix(int size){
    matrix = new int[size][size];
    lengthOfMatrix = size;

  }

  public void printMatrix(){
    final String YELLOW = "\u001B[33m";
    final String RESET = "\u001B[0m";

    for(int row = 0; row<lengthOfMatrix; row++) {
      for(int column=0; column<lengthOfMatrix; column++) {
      //if else to check for diagonal
      // length-1-i to color the diagonal, first the last input should be colored then nextline is the index-i
        if (column==lengthOfMatrix-1-row) {
          System.out.print(YELLOW + matrix[row][column] + " " + RESET);

        }else{
          System.out.print(matrix[row][column] + " ");

        }
      }
    System.out.println();
    }
  }

  public void populateMatrix(){
    for(int row = 0; row<lengthOfMatrix; row++) {
      for(int column = 0; column<lengthOfMatrix; column++) {
        //need to multiply length by index to count by intervals, then add j for the numbers between the intervals, add 1 as index for arrays starts at 0
         matrix[row][column] = (lengthOfMatrix*row+(1+column));

      }
    }
  }

  public void flipMatrix(){
    //since index of items stat from 0, index of items will always be the length of the array minus 1, therefore use lengthOfMatrix-1 when dealing with index
    //need to run length-1 times to avoid last row
    for(int row=0;row<lengthOfMatrix-1;row++){
    //need to run length-1-i to decrement amount of times by 1 each time a row is completed to avoid the diagonals
      for(int column=0;column<(lengthOfMatrix-1-row);column++){
      swap(row, column, lengthOfMatrix-1-row, lengthOfMatrix-1-column);

      }
    }
  }


 private void swap (int x1,int y1,int x2,int y2) {
    int temparray = matrix[x1][y1];


    matrix[x1][y1]= matrix[x2][y2];
    matrix[x2][y2]= temparray;

  }
}
