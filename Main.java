import java.util.Scanner;
/**
 *
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user to enter a positive number
    System.out.println("Please eneter a positive integer");
     int choice = input.nextInt();
     
     // determine number chosen
    switch(choice){
      case 1:
       System.out.println("One");
       break;
      case 2:
       System.out.println("Two");
       break;
      case 3:
       System.out.println("Three");
       break;
      case 4:
       System.out.println("Four");
       break;
      case 5:
       System.out.println("Five");
       break; 
      case 6:
       System.out.println("Six");
       break;
      case 7:
       System.out.println("Seven");
       break;
      case 8:
       System.out.println("Eight");
       break;
      case 9:
       System.out.println("Nine");
       break;
      case 10:
       System.out.println("Ten");
       break;
      default:
       System.out.println("Not in the range"); 
    }
    
  }
}
