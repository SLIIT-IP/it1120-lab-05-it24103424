import java.util.Scanner;

public class IT24103424Lab5Q2 {

  public static void main(String[] args){

    int numberOfMembers;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of new members introduced: ");
    numberOfMembers = input.nextInt();

    System.out.println("");

    if (numberOfMembers>=0) {
      switch (numberOfMembers) {
        case 0: System.out.println("No Prize");          
          break;
        case 1: System.out.println("Prize is a : Pen");
          break;
        case 2: System.out.println("Prize is a : Umbrella");
          break;
        case 3: System.out.println("Prize is a : Bag");
          break;
        case 4: System.out.println("Prize is a : Travelling Chair");
          break;
        default: System.out.println("Prize is a : Headphone");
          break;
      }
    }
    else{
      System.out.println("Input must be a number 0 or greater");
    }

  }
}