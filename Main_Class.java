/*
12) 
 WAP to create a ticketing system :
Class : Theatre_Stack
member functions / variables :
viewer _code[Max_Size] : array of cinema viewers
Max_Size : max storage capacity of the array
first : bottom of the stack
last : top of the stack
boolean checkStackIfEmpty() : to check whether any ticket has been sold or not
boolean checkStackIfFull() : to check whether all seats have been taken
void pushBuyTicket( int viewer_code ) : to push a viewer code into the stack
void popViewer() : remove the users from the last place
Class : Ticket_Queue
member functions / variables :
Cons_code [Max_Size] : array of cinema viewers
Max_Size : max storage capacity of the array
front : bottom of the stack
rear : top of the stack
boolean checkQueueIfEmpty() : to check whther any ticket has been sold or not
boolean checkQueueIfFull() : to check whether all seats have been taken
void pushViewer(int viewer_code) : to push a viewer into Ticketing queue
void popViewer() : remove the users from the last place
Ask the user to input the viewer code one by one and print the total number of people watching a
movie at the end .
 */
import java.util.*;
class Main_Class
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String arg[])
    {
        //creation of objects
        Ticket_Queue ob1=new Ticket_Queue(9999);
        Theatre_Stack ob2=new Theatre_Stack(9999);
        
        int ch1,n,i,vc,x;
        while(true)
        {         
            System.out.println("Options available :");    //displaying the options avaiable
            System.out.println("1. Enter viewer codes of customers");
            System.out.println("2. Display current list of viewers in queue");
            System.out.println("3. Pop viewers whose booking has been confirmed");
            System.out.println("4. Pop viewers who did not buy ticket");
            System.out.println("5. Generate the total number of people watching the movie");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            ch1=sc.nextInt();    //taking input the choice from user
            switch(ch1)
            {
                case 1:
                System.out.println("Enter the number of codes you want to provide");
                n=sc.nextInt();   //taking input the no. of codes
                System.out.println("Enter the codes");
                for(i=0;i<n;i++)       // taking input the codes
                {
                    vc=sc.nextInt();
                    ob1.pushViewer(vc);
                }
                break;
                case 2:
                if(ob1.checkQueueIfEmpty())
                System.out.println("Queue is empty");       
                else
                {
                    for(i=ob1.front;i<=ob1.rear;i++)
                    System.out.println(ob1.Cons_code[i]);
                }
                break;
                case 3:
                if(ob1.checkQueueIfEmpty())
                System.out.println("Queue is empty");
                else
                {
                    System.out.println("Enter the number of viewers");
                    n=sc.nextInt();       // taking input the number of viewers
                    for(i=0;i<n;i++)
                    {
                        x=ob1.popViewer();
                        ob2.pushBuyTicket(x);
                    }
                }
                break;
                case 4:
                if(ob1.checkQueueIfEmpty())
                System.out.println("Queue is empty");
                else
                {
                    System.out.println("Enter the number of viewers");
                    n=sc.nextInt();           // taking input the number of viewers
                    ob1.front+=n;
                }
                break;
                case 5:
                if(ob2.checkStackIfEmpty())
                System.out.println("No bookings yet");
                else
                System.out.println("Total number of people = "+(ob2.last+1));
                break;
                case 6:
                System.exit(0);
                default:
                System.out.println("Invalid Choice!!!");
            }
        }
    }  // end of main method
}  // end of class

/*
 OUTPUT
 
 Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
3
Queue is empty
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
4
Queue is empty
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
5
No bookings yet
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
1
Enter the number of codes you want to provide
5
Enter the codes
1241
2145
8475
1032
1414
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
2
1241
2145
8475
1032
1414
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
3
Enter the number of viewers
2
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
2
8475
1032
1414
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
1
Enter the number of codes you want to provide
3
Enter the codes
5545
7414
2150
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
2
8475
1032
1414
5545
7414
2150
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
4
Enter the number of viewers
2
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
2
1414
5545
7414
2150
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
3
Enter the number of viewers
3
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
2
2150
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
5
Total number of people = 5
Options available :
1. Enter viewer codes of customers
2. Display current list of viewers in queue
3. Pop viewers whose booking has been confirmed
4. Pop viewers who did not buy ticket
5. Generate the total number of people watching the movie
6. Exit
Enter your choice
6

*/