import java.util.Scanner;
public class Input {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    int due;
    String task;
    
    System.out.println("==== My task today ====");
    System.out.println("=======================");

    // Input 
    System.out.println("Task : ");
    task = input.nextLine();
    System.out.println("Due  : ");
    due = input.nextInt();

    //Output 
    System.out.println("=======================");
    System.out.println("So your task today is:");
    System.out.println(task + " that due on " + due);
  }
}
