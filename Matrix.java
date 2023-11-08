public class Matrix {
private int[][] matrix;
private final int lengthOfMatrix;
    public Matrix(int size){
      matrix = new int[size][size];
      lengthOfMatrix = size;
    }

    public class RunMatrix {

      public void printMatrix(){
        //row
        for(int i = 0; i<lengthOfMatrix; i++) {
          //column
          for(int j = 0; i<lengthOfMatrix; i++) {
            System.out.print(matrix[i][j] + " ");
          }
          System.out.println();

        }
      }
    }
      public void populateMatrix(){

      }
      public void flipMatrix(){

      }

     private void swap (int x1,int x2,int y1,int y2) {
      int tempx = x1;
      int tempy = y1;
      x1 = x2;
      y1 = y2;
      x2 = tempx;
      y2 = tempy;
    }
}
