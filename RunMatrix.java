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
      System.out.print("\nYour matrix is:" + (input) + " x ");
      // need to spit print statement inorder to assing type to print
      System.out.print((input) + "\n\nPrinting matrix with default matrix values\n");
      array.printMatrix();
      System.out.println("\nPopulating matrix... matrix populated" + "\n\nPrinting matrix");
      array.populateMatrix();
      array.printMatrix();
      System.out.println("\nFlipping matrix...   matrix flipped" + "\n\nPrinting matrix");
      array.flipMatrix();
      array.printMatrix();

      }
    } catch (Exception e) {
      System.out.println("Input was not a integer " + e);

    }
  scan.close();

  }
}
