// The delimiter for userinput is white space by default
//scan.nextInt() reads the next integer input by skipping the white space and other characters by just taking next coming integer

//scan.next() for next string value

//When given integer before string the integer input is accepted where as the string value gets discarded since java disregards the new Line in that case we need to give another new lin e in order for that string to be printed

import java.util.Scanner;


public class Delimiters {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Integer");
    int num=sc.nextInt();
    sc.nextLine();//For the coming string needs to be printed
    System.out.println("Enter string");
    String a=sc.nextLine();
    System.out.println("Enter Integer");
    
    int num2=sc.nextInt();
    System.out.println(num2 + a+num);
        sc.close();


    }
}
