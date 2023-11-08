public class Matrix {
private int[][] martix;

    public Matrix(int size){
      matrix = new int[size][size];
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
