import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your score");
        int score=sc.nextInt();
        System.out.println("Enter your grade");
        sc.nextLine();//When string sc.nextLine() is written after the int value  
        String grade=sc.nextLine();
        if(score>=90 && score<=100 && grade.equals("Ten")){
            System.out.println("Congratualtions! You are topper of grade 10");
        }
        else if(score>=90 &&score<=100 || !grade.equals("Eight"))
       {
        System.out.println("Congratualtions! You are topper of grade 9"); 
       }
       else{
        System.out.println("Your results are not announced yet!");
       }
    }
}

