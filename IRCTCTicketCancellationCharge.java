import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IRCTCTicketCancellationCharge {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dive in to know more about ticket cancellation charges");
        System.out.println("Please Enter Your Name");
        String Name=sc.nextLine();
        System.out.println("Hey "+Name+"!");        
        System.out.println("Please Enter the date on which you booked your ticket.Enter in the below format dd-MMM-yyyy hh:mm:ss");
        // Date date=new Date();
        // Calendar myNextCalendar=Calendar.getInstance();
        // System.out.println(myNextCalendar.toInstant());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
        String date=sc.next();
        try{
        dateFormat.parse(date);
        System.out.println(date);
        }
        catch (Exception e){
            System.out.println("Please enter a valid date");
            System.exit(0);
        }
        String confirmeddate=sc.next();
        try{
            dateFormat.parse(confirmeddate);
            }
            catch (Exception e){
                System.out.println("Please enter the previous date");
                System.exit(0);
            }
        if(date.equals(confirmeddate)) //if(date==confirmeddate)

        {
        System.out.println("Confirming the ticket booking date "+date);
        }
        else{
            System.out.println("You have entered the wrong date. Please enter the date again");
        }
        sc.close();
    }
}

