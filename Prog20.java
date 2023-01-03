/* 20) A disarium number is a number in which the sum of the digits to the power of their respective position is equal to the number itself. 
   Example- 135 = 1^1 + 3^2 + 5^3
   WAP to take input a number and check whether it is disarium number or not.
*/   
import java.util.*;
class Prog20
{
   static  int n,s,r;   // data members
    static double s1;
    Prog20()
    { s=0;r=0;
      s1=0.0;    // initializing the data members
    }
    int disarium(int n2, int len)   // recursive method to check whether a function is disarium or not
    {
       if(n2<=0)
       return s;    // returning sum
       else
       {
           r=n2%10;
           s1 = s1 + Math.pow(r,len);
           s = (int)s1;   // type casting from double to int
           return disarium(n2/10,len-1);
       }
    }
    public static void main()    // main method
    {  Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number ");
        n = sc.nextInt();    // taking input a number from user
        Prog20 ob = new Prog20();
        String s2 = Integer.toString(n);
        int l = s2.length();   // storing the length of the number
       
        int k = ob.disarium(n,l);   // calling the function --> disarium
        
        if(k==n)   // checking whether the number is disarium or not
        System.out.println(n+ " is a Disarium Number");      // printing
        else
         System.out.println(n+ " is not a Disarium Number");
    }   // end of main method
}      // end of class
/*
 OUTPUT
  Enter a number 
135
135 is a Disarium Number
 Enter a number 
89
89 is a Disarium Number
 Enter a number 
68
68 is not a Disarium Number

 */