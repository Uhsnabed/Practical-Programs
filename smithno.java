/* 5} A natural number N is said to be a smith number if sum of all the digits of N and sum of 
  digits of all the prime factors of N are same.
  Write a program to input a positive integer N and print whether it is smith number or not.
  */
  import java.util.*;
class smithno
{
   int n;
   public  void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter a number ");  //accepting a number
        n=sc.nextInt();
    }
    public int sumofdigits(int no)
    {
        int s=0;
        while(no>0)   //while loop to find out sum of digits of the number no
        {
            int d=no%10;
            s=s+d;
            no=no/10;
        }
        return s;    //returning the sum of digits
    }
    public void smithcheck()
    {int sum=0;     //variable to store sum of digits of prime factors
        System.out.print("Prime factors are: ");
        int num=n;   
        for(int i=2;i<=num;i++)
        {if(num%i==0)
            {
                while(num%i==0)     
                {
                    num=num/i;
                    System.out.print(i+" ");     //printing the prime factors
                    if(i<9)
                    sum=sum+i;
                    else
                    {int dsum= sumofdigits(i);    //finding out sum of digits of prime no. if it is greater than 9
                    sum=sum+dsum;
                }
            }
     }
     }
     System.out.println();
     System.out.println("Sum of digits of prime factors: "+sum);
     int nsum=sumofdigits(n);    //calling the function to store sum of digits of original number
     System.out.println("Sum of digits of "+n+" : "+nsum); 
     if( nsum==sum)      //checking if number is smith no.
     System.out.println(n+" is a smith number");
    else
    System.out.println(n+" is not a smith number");
}
    public void main()  // main() method to create object of class and call the methods accordingly
    {
        smithno ob = new smithno();
        ob.input();
        ob.smithcheck();
    }
}
/* OUTPUT
Enter a number 
666
Prime factors are: 2 3 3 37 
Sum of digits of prime factors: 18
Sum of digits of 666 : 18
666 is a smith number
*/
     
            
        




                