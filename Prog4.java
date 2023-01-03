/* 
  4) Twins primes are consecutive prime numbers whose difference is 2. For example, (3,5), (11,13), (17,19) are all 
 twin primes. We define the distance of any twin prime pair from a positive integer as follows. If (p1, p2) is a 
 twin prime pair and n is a positive integer then the distance of the twin prime from n is: minimum(abs(n-p1), 
 abs(n-p2)) where abs returns the absolute value of its argument, and minimum returns the smaller of its two 
 arguments. Write a program that reads in a positive integer n and prints out the twin prime pair that has 
 the least distance from n. 
 For example if n is 30 the pair is (29,31), if n is 13 it is (11,13),
 if n is 49 it is  (41,43). If n is 54 it is (59,61).
Sample data: Input: Give the number : 34
Output: Number read in is : 34
Pl=29 p2=31 
Input: Give the number : 60 
Output: Number read in is 60 Pl=59 p2=61
*/
import java.util.*;
class Prog4
{
    int n;     // data members
    public void inputuser()    // taking input from user
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer :");
        n=sc.nextInt();
    }
    
    public boolean prime(int no)   // checking if number is prime or not
    {
        if(no==0||no==1)
        return false;
        if(no==2)
        return true;
        
        for(int i=2;i<=no/2;i++)
        {
            if(no%i==0)
            return false;
        }
        return true;
    }
    
    public void generate()       // generating the numbers and printing it
    {
        int min1=0,min2=0;
        if(prime(n-1)&&prime(n+1))
        System.out.println("P1 = "+(n-1)+", P2 = "+(n+1));
        else
        {
            for(int i=n;i>=2;i--)
            {
                if(prime(i)&&prime(i-2))
                {
                    min1=n-i;;
                    break;
                }
            }
            
            for(int i=n;;i++)
            {
                if(prime(i)&&prime(i+2))
                {
                    min2=i-n;
                    break;
                }
            }
            
            if(min1<min2)
            System.out.println("P1 = "+(n-min1-2)+", P2 = "+(n-min1));      // printing
            else
            if(min2<min1)
            System.out.println("P1 = "+(min2+n)+", P2 = "+(min2+n+2));
            else
            {
                System.out.println("Twin primes on both sides measure equal distance.");
                System.out.println("Twin primes less than "+n+" :");
                System.out.println("P1 = "+(n-min1-2)+", P2 = "+(n-min1));
                System.out.println("Twin primes more than "+n+" :");
                System.out.println("P1 = "+(min2+n)+", P2 = "+(min2+n+2));
            }
        }
    }
    
    public void main()
    {
       Prog4 ob=new Prog4 ();
        ob.inputuser();
        ob.generate();
    }  // end of main method
} // end of class
/*
 OUTPUT 1 
Enter a positive integer :
34
P1 = 29, P2 = 31
 OUTPUT 2
Enter a positive integer :
60
P1 = 59, P2 = 61
 
*/