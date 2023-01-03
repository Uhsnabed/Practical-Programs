/* 
  10}  In a management college a project was allotted. The project should be submitted on a fixed date on a given number of days. Write a program to
    input date in dd/mm/yyyy form and the number of days when the project has to be submitted. Print the project submission date in the format dd/mm/yyyy.
    Example-
            Input:-  PROJECT ALLOTMENT DATE 
            Date: 20/10/2007
            NUMBER OF DAYS: 60

            Output:- PROJECT SUBMISSION DATE 
            DATE: 18/12/2007
*/
import java.util.*;
class management
{
    String date;int d,m,y,due;
    public void input()      //method to take input from user
    {
        Scanner sc = new Scanner (System.in);
        System .out.println("Enter date in form--> dd/mm/yyyy ");
        System.out.println();
        System.out.println("PROJECT ALLOTMENT DATE ");
        System.out.print("Date: ");
        date=sc.nextLine();
        System.out.print("NUMBER OF DAYS: ");
        due=sc.nextInt();
        System.out.println();
    }
    public boolean isleap(int year)        //method to check if the year is leap year or not
    {
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                return true;
                else
                return false;
            }
            else 
            return true;
        }
        else
        return false;
    }
    public void convert()            //method to find submission date
    {
      int day[]={0,31,28,31,30,31,30,31,31,30,31,30,31};   //storing number of days in accordance with position number of array
      date=date+" ";
      d=Integer.parseInt(date.substring(0,date.indexOf("/")));           //extracting days
      m=Integer.parseInt(date.substring(date.indexOf("/")+1,date.indexOf("/",3)));       //extracting month
      y=Integer.parseInt(date.substring(date.indexOf("/",3)+1,date.indexOf(" ")));       //extracting year
      due=due-(day[m]-d);
      if(m==12)
      {
          m=1;
          y++;
        }
        else
        m++;
        outer:
        while(true)
        {
            if(isleap(y))          //to check if y is a leap year or not 
            day[2]=29;
            for(int i=m;i<=12;i++)
            {
                due=due-day[m];
                if(due<0)
                {
                    due=due+day[m]-1;
                    d=due;     //setting date
                    m=i;       //setting month number
                    break outer;
                }
            }
            y++;
            m=1;     //month is set to 1
        }
    }
    public void display()      //method to display submission date
    {
        System.out.println("PROJECT SUBMISSION DATE ");
        System.out.print("DATE: ");
        System.out.println(d+"/"+m+"/"+y);
    }
    public static void main()     //main method to call above functions
    {
        management ob = new management();       //creating object of the class
        ob.input();
        ob.convert();
        ob.display();
    }
}
/* OUTPUT
Enter date in form--> dd/mm/yyyy 

PROJECT ALLOTMENT DATE 
Date: 20/12/2007
NUMBER OF DAYS: 40

PROJECT SUBMISSION DATE 
DATE: 28/1/2008
*/
                   
                    
                
            
        
         