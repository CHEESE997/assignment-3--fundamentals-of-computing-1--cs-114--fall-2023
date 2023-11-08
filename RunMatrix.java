import java.util.Scanner;

public class RunMatrix {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Matrix array;

    System.out.print("Please enter a Nummber:");


    try {
      int input = Integer.parseInt(scan.nextLine());
      if (input<0){
        System.out.println("Cannot accept negative numbers");
        scan.close();
        return;

      }else{
      array = new Matrix (input);
      array.printMatrix();
      System.out.println();
      array.populateMatrix();
      array.printMatrix();
      System.out.println();
      array.flipMatrix();
      array.printMatrix();

      }


    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Input was not a integer " + e);

    }
  scan.close();

  }
}
