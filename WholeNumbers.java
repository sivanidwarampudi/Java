public class WholeNumbers {
    public static void main(String[] args) {
      //  int population=7000000000; too large to store, int can store upto 2 billion range
      long pop=7000000000000000000L;
      System.out.println(pop);
      //System.out.println(population);
      //To store decimal values we use double
      double d=99.5;
      double d1=99;
      System.out.println(d1);
      System.out.println("The value is " +d);
      //operations needs to be put into brackets 
      System.out.println("Combined operation "+(pop+d)+" here it is!");
    //modulus operator returns reminder whereas division operator returns quotient
    
    //increment operator
    int counter=0;
    counter++;
    counter--;
    System.out.println("counter" +counter);
    counter--;
    --counter;
    System.out.println("counter" +counter);
    }
}
