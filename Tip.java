import java.util.Scanner;

import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        tipCalculation();
    }
    public static void tipCalculation(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Bill Please?");
    float bill=sc.nextInt();
    float tip=((float)(15.0f/100.0f))*bill; //.f should be mentioned or else the o/p will be zero since it considers as integer division
    System.out.println("the tip is "+tip);
    }
}
