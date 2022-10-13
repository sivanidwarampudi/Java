import java.util.Scanner;


public class ChatBot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey what's your name?");
        String name=sc.nextLine();
        System.out.println("\nHi "+name+" You are talking to a bot."+"Can you tell me where are you from?");
        String place=sc.nextLine();
        System.out.println("\nI hear it's beautiful at "+place+" How old are you?");
        int age=sc.nextInt();
        System.out.println("\nNice to meet you, you are "+(9000/age)+"years younger than me");        
        System.out.println("\nBubye");
        sc.close();
        // int compareval=1;
        // int compareval2=2;
        // if(compareval<compareval2){
        // System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // } 
    }  
}
