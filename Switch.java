public class Switch {
    //switch is used when it compares an argument/value against other cases
    public static void main(String[] args) {
        int month =5;
        switch(month){
            case 1:System.out.println("Monday"); break;
            case 2:System.out.println("Tuesday"); break;
            case 3:System.out.println("Wednesday"); break;
            case 4:System.out.println("Thursday"); break;
            case 6:System.out.println("Friday"); break;
            case 7:System.out.println("Saturday"); break;
            case 8:System.out.println("Sunday"); break;
            default: System.out.println("Enter a valid day");
        }

    }
}  
