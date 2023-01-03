/* 
  8} Input a positive integer n>=5 digits, the computer should reject if less than five digits and asks to re-enter.Eg-2003[invalid], eg-152004[valid].
  The last four digits will be taken as year(starting from 1st January) and rest number will be considered as number of days. extracted from in the following format.
  Output the exact date on the basis of number of days extracted from n thr following format.
  Input : n=152007       Output: 15th January 2007
  Input : n=2004         Output: Invalid Entry, Please re-enter
  
 */
import java.util.*;
class numdate
{
    int n,d,y,l;String no;
    public void input()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number greater than or equal to 5 digits");           //accepting the number from the user
        n=sc.nextInt();
        no=Integer.toString(n);                  //converting the input number to String
        l=no.length();
        while(l<5)               //loop to keep asking user to enter correct value until they enter it
        {
        System.out.println("Invalid entry, Please re-enter");
        System.out.println(); 
        System.out.println("Enter a number greater than or equal to 5 digits");
        n=sc.nextInt();
        no=Integer.toString(n);                   
        l=no.length();
    }
   
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
    public void num()
    { 
       String mo[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
       int day[]={0,31,28,31,30,31,30,31,31,30,31,30,31};   //storing number of days in accordance with position number of array
       y=Integer.parseInt(no.substring(l-4,l));      //extracting year
       d=Integer.parseInt(no.substring(0,l-4));      //extracting the number of days to be considered
       int rem=d;
       int p;
       while(true)
       {
           if(isleap(y))     //checking if y is leap year or not
           {
               p=366;
               day[2]=29;
            }
            else
            p=365;
            if(rem>p)
            {
                rem=rem-p;            //reducing the extra days
                ++y;
            }
            else
            break;
        }
        for(int i=1;i<=12;i++)
        {
            if(rem>day[i])
            rem=rem-day[i];    //to find out the date of the month of the required year
            else
            {
                System.out.println(rem+" "+mo[i]+" "+y);         //displaying the date in required form
                break;
            }
        }
    }
    public static  void main()       //main method to call the above functions
    {
        numdate ob = new numdate();            //creating object of the class
        ob.input();
        ob.num();
    }
}
/* OUTPUT
Enter a number greater than or equal to 5 digits
2004
Invalid entry!! Please re-enter

Enter a number greater than or equal to 5 digits
2003
Invalid entry!! Please re-enter

Enter a number greater than or equal to 5 digits
3702007
5 January 2008
*/
    
    
    