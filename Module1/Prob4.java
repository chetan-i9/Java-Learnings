import java.util.*;
class Prob4 {
    public static void main(String[] args) {
        
            // Fill your code here
            Scanner myobj=new Scanner(System.in);
            System.out.println("Enter the name of the event");
            String event=myobj.nextLine();
            System.out.println("Enter the type of the event");
            String event_type=myobj.nextLine();
            System.out.println("Enter the number of people expected");
            int num=myobj.nextInt();
            System.out.println("Is it a paid entry? (Type Y or N)");
            char entry = myobj.next().charAt(0);
            System.out.println("Enter the projected expenses (in lakhs) for this event");
            double exp=myobj.nextDouble();

            System.out.println("Event Name : "+event);
            System.out.println("Event Type : "+event_type);
            System.out.println("Expected Count : "+num);
            System.out.println("Paid Entry : "+ entry);
            System.out.println("Projected Expense : "+exp+"L");
     }
}
