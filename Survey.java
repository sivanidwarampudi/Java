import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Knock Knock!");
    System.out.println("\nYour name?");
    String a=sc.nextLine();
    System.out.println("\nYou Age");
    int b=sc.nextInt();
    System.out.println("\n");
    System.out.println("Hey "+a);
    System.out.println("Your age is "+b);
    System.out.println("\nThankyou, Bubye!");
  //double d=sc.nextDouble();
  //close scan ner to reduce memory consumption
  sc.close();
}
}
