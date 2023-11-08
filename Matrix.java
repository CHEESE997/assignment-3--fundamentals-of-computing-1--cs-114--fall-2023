public class Matrix {
  private int[][] matrix;
  private final int lengthOfMatrix;


  public Matrix(int size){
    matrix = new int[size][size];
    lengthOfMatrix = size;
  }

  public void printMatrix(){
    //colors
    String YELLOW = "\u001B[33m";
    String RESET = "\u001B[0m";
    //row
      for(int i = 0; i<lengthOfMatrix; i++) {
        //column
       for(int j=0; j<lengthOfMatrix; j++) {
        //if else to check for diagonal
        // length-1-i to color the diagonal, first the last input should be colored then nextline is the index-i
        if (j==lengthOfMatrix-1-i) {
          System.out.print(YELLOW + matrix[i][j] + " " + RESET);
        }else{
          System.out.print(matrix[i][j] + " ");

        }
        }
      System.out.println();
      }
    }

  public void populateMatrix(){
    //row
    for(int i = 0; i<lengthOfMatrix; i++) {
      //column
      for(int j = 0; j<lengthOfMatrix; j++) {
        //need to multiply length by index to count by intervals, the intervals being the length of the array, then add j for the numbers between the intervals, add 1 as index for arrays starts at 0
         matrix[i][j] = (lengthOfMatrix*i+(1+j));

      }
    }
  }

  public void flipMatrix(){
    //since index of items stat from 0, index of items will always be the length of the array minus 1, therefore when I need the index of an item i use lengthOfMatrix-1
    //need to run length-1 times to avoid last row
    for(int i=0;i<lengthOfMatrix-1;i++){
    //need to run length-1-i to decrement amount of times by 1 each time a row is completed to avoid the diagonals
      for(int j=0;j<(lengthOfMatrix-1-i);j++){
    //relationship between swapping on the diagonal is that the index of the desired number is the index of the last number minus the reversed index of number being swapped, I.E target index -> 2,1 is 2,2-0,1 which is on the opposite of the diagonal
      swap(i, j, lengthOfMatrix-1-i, lengthOfMatrix-1-j);
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
