import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    System.out.print("Please enter a Nummber:");
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a number");

    try {
      int input = Integer.parseInt(scan.nextLine());
      if (input<0);{
        System.out.println("Cannot accept negative numbers");
        break;

      } else{
        Matrix()

      }


    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Input was not a number" + e);

    }
  }
}
