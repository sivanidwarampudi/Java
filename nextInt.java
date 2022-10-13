import java.util.Scanner;

public class nextInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val1=sc.nextInt();
        int val2=sc.nextInt();
        int val3=sc.nextInt();
        int val4=sc.nextInt();
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        sc.close();
    //Integer value when given in same line nextInt() ignores whitespaces and consider the coming integer same for other methods except nextLine()

    }
}
