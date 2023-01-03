 /*
 16) A positive whole number 'n' that has `d' number of digits is squared and split into two pieces, a
right-hand piece that has ‘d’ digits and a left-hand piece that has remaining ‘d’ or ‘d-1’ digits. If
the sum of the two pieces is equal to the number, then ‘n’ is a Kaprekar number. The first few
Kaprekar numbers are: 9, 45, 297
Example 1: 9
9
2 = 81, right-hand piece of 81 = 1 and left hand piece of 81 = 8
Sum = 1 + 8 = 9, i.e. equal to the number.
Example 2: 45
452 = 2025, right-hand piece of 2025 = 25 and left hand piece of 2025 = 20
Sum = 25 + 20 = 45, i.e. equal to the number.
Example 3: 297
2972= 88209, right-hand piece of 88209 = 209 and left hand piece of 88209 = 88
Sum = 209 + 88 = 297, i.e. equal to the number.
Given the two positive integers p and q, where p < q, write a program to determine how many
Kaprekar numbers are there in the range between p and q (both inclusive) and output them.
The input contains two positive integers p and q. Assume p < 5000 and q < 5000. You are
required to output the number of Kaprekar numbers in the specified range along with their values 
  */
import java.util.*;
 class Prog16
{
    public static void main()    // main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER LOWER RANGE ");   // taking input lower range
        int p = sc.nextInt();
        System.out.println(" ENTER UPPER RANGE ");   // taking input upper range
        int q = sc.nextInt();
        if( (p>q) || (p<0 || q<0) || (p>5000 || q>5000))    // checking condition
        {System.out.println(" INCORRECT INPUT ! SORRY RESTART THE PROGRAM AGAIN :( ");
        System.exit(0);
    }
     System.out.print("  THE KAPREKAR NUMBERS ARE : ");
     int f=0,sq,n,l,l1,a3,a4;
     double a1,a2;
     String s1,s2;
     for(int i = p;i<=q;i++)   // for loop to generate the kaprekar numbers
     {  n=i;
        sq= n*n;   // storing square of the number
        s1 = Integer.toString(n); l = s1.length();    
        s2 = Integer.toString(sq); l1 = s2.length();   
        a1 = sq% Math.pow(10,l);      // storing one half of the number
        a2 = sq/ Math.pow(10,l);      // storing other half of the number
        a3 = (int)a1; a4= (int)a2;
        if(a3+a4==n)
        {
            f++;    // counting the number of kaprekar numbers
            System.out.print(n+ " ");    // printing the kaprekar numbers
        }
       
    }
    if(f==0)   
       System.out.print("NILL");
       System.out.println(); 
        System.out.println("  FREQUENCY OF KAPREKAR NUMBERS IS :"+ f);    // printing the frequency of kaprekar numbers
    }  // end of main method
}   // end of class
/*
 OUTPUT
  ENTER LOWER RANGE 
1
 ENTER UPPER RANGE 
100
  THE KAPREKAR NUMBERS ARE : 1 9 45 55 99 
  FREQUENCY OF KAPREKAR NUMBERS IS :5
 ENTER LOWER RANGE 
120
 ENTER UPPER RANGE 
1000
  THE KAPREKAR NUMBERS ARE : 297 703 999 
  FREQUENCY OF KAPREKAR NUMBERS IS :3
 ENTER LOWER RANGE 
100
 ENTER UPPER RANGE 
290
  THE KAPREKAR NUMBERS ARE : NILL
  FREQUENCY OF KAPREKAR NUMBERS IS :0
 */
