import java.util.Timer;  
import java.util.TimerTask; 
import java.util.Scanner;

public class Pomodoro  
{  
Timer timer = new Timer();  
Scanner sc=new Scanner(System.in);
Pomodoro(int seconds)   
{  
seconds=sc.nextInt();
//schedule the task  
timer.schedule(new RemindTask(), seconds*1000);
System.out.println(seconds*10);   
}  
class RemindTask extends TimerTask   
{  
public void run()   
{  
System.out.println("You have a notification!");  
//terminate the timer thread  
timer.cancel();   
}  
}  
//driver code  
public static void main(String args[])   
{  
//function calling      
// new Pomodoro(); 
}
}  