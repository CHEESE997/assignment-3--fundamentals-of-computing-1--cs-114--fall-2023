import java.util.Scanner;

public class RunMatrix {

  public static void printMatrix(){

  }

  public static void populateMatrix(){

  }
  public static void flipMatrix(){

  }

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
      printMatrix();
      }


    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Input was not a integer " + e);

    }
  scan.close();

  }
}
