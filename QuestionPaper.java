import java.util.Scanner;

public class QuestionPaper {
    public static void main(String[] args){
        int score=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("What is the rarest blood type?");
        System.out.println("a) "    +"A");
        System.out.println("b) "    +"B");
        System.out.println("c) "    +"AB Negative");
        System.out.println("d) "    +"O");
        String option=sc.nextLine();
        if (option.equals("c")){
            score+=10;
        }
        else{
            score=0;
        }
        System.out.println("Your Score is "+score);
        // int option=1;
        // switch(option)
        // {
        //     case 1:System.out.println("a) "    +"A");
        //     case 2:System.out.println("b) "    +"B");
        //     case 3:System.out.println("c) "    +"AB Negative");
        //     case 4:System.out.println("d) "    +"O");
            
        // }
        
    }
}
