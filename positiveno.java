/* 4} A positive natural number (eg 27) can be represented as follows:
   2+3+4+5+6+7
   8+9+10
   13+14
   Where every row represents a combination of consecutive natural numbers which add upto 27.
   Write a program which inputs a natural number n and print all the possible consecutive natural number combinations which upto n.
   Input : 9
   Output : 4+5
            2+3+4
 */
import java.util.*;
class positiveno
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println(" Enter a number ");  //accepting number from user
        int n= sc.nextInt();  //storing the number
        int s=0;
        for(int i=1;i<n;i++)
        {
            s=0;
            for(int j=i;j<n;j++)
            {
                s=s+j;  //adding up consecutive numbers
                if(s==n)
                {
                    for(int k=i;k<=j;k++)    //loop to display the consecutive numbers which add upto the number n
                    {
                        if(k<j)
                        System.out.print(k + "+");
                        else
                        System.out.print(k);
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
}
/* OUTPUT
  Enter a number 
21
1+2+3+4+5+6
6+7+8
10+11
 */

                        