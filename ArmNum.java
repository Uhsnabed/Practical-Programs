/* 
 17) Design a class ArmNum to check if a given number is An ArmStrong number or not. [ A no. is said to be armstrong if sum of its 
digits raised to the power of the length of the number is equal to the number]. 
Eg - 371- 3^3 + 7^3 + 1^3 
*/
import java.util.*;
class ArmNum
{
    static int n,s,l,r,k;    // data members
    static double s1;
    ArmNum()    // non parameterized constructor
    {
         l=0; r=0;s=0;s1=0;    // intializing the global variables with initial values
         
    }
    static int sum_pow(int n1)     // recursive function
    {  if(n1<=0)
        return s;    // returning the sum 
        else
       {r= n1%10;   // storing digit of the number
        s1=s1+Math.pow(r,l);
        s=(int)s1;    // type casting from double to int
        return sum_pow(n1/10);   
    }
    }
    public static void main()  // main method
    {   ArmNum ob = new ArmNum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is armstrong or not");
        n= sc.nextInt();    //taking input a number to check whether it is armstrong or not 
        int nn=n;
        String s2 = Integer.toString(n);   // converting number to string
        l = s2.length();
        int k = ob.sum_pow(n);   // calling function -->  sum_pow
        
        if(k==n)     // checking whether the number is armstrong number or not
        System.out.println(nn+" is an armstrong number");   // printing
        else
        System.out.println(nn+" is not an armstrong number");
    }   // end of main method
}   // end of class
/*
 OUTPUT
 Enter number to check whether it is armstrong or not
371
371 is an armstrong number
Enter number to check whether it is armstrong or not
1634
1634 is an armstrong number
Enter number to check whether it is armstrong or not
54748
54748 is an armstrong number
Enter number to check whether it is armstrong or not
364
364 is not an armstrong number
 */