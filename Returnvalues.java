//when function calculates value it should return it's value 

// public int functionname{
//     return intValue; since we gave int as return type above
// }

import java.util.Scanner;

public class Returnvalues{
    Scanner sc=new Scanner(System.in);
    public static double measureSquare(double s, double s2){
        double area=s*s;
        return area; 
    
    }
    public static void main(String[] args) {
        double measure1=measureSquare(2.3,2.5);
        double measure2=measureSquare(2,2);
        
    }
}

