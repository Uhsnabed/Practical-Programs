/*
 10) An Evil number is a positive whole number which has even number of 1’s in its binary equivalent.
Example: Binary equivalent of 9 is 1001, which contains even number of 1’s.
 Thus, 9 is an Evil Number.
A few Evil numbers are 3, 5, 6, 9....
Design a program to accept a positive whole number ‘N’ where N>2 and N<100. Find the binary
equivalent of the number and count the number of 1s in it and display whether it is an Evil number or
not with an appropriate message.
Test your program with the following data and some random data:
Example 1:
INPUT: N = 15
BINARY EQUIVALENT: 1111
NUMBER OF 1’s: 4
OUTPUT: EVIL NUMBER
Example 2:
INPUT: N = 26
BINARY EQUIVALENT: 11010
NUMBER OF 1’s: 3
OUTPUT: NOT AN EVIL NUMBER
Example 3:
INPUT: N = 145
OUTPUT: NUMBER OUT OF RANGE
 */import java.util.*;
class Prog10
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);       
        System.out.println(" ENTER A NUMBER TO CHECK WHETHER IT IS EVIL NUMBER OR NOT"); // taking input a number from user
        int a = sc.nextInt(); int a1=a;
        while(a<=2 || a>=100)     // checking if the number is within the range or not. If not then taking input from the user again 
        {                         // until he inputs number within required range
           System.out.println(" NUMBER OUT OF RANGE  . PLEASE ENTER AGAIN");
           System.out.println(" ENTER A NUMBER TO CHECK WHETHER IT IS EVIL NUMBER OR NOT");
           a = sc.nextInt();
        }
        String s = "",s1=""; int c= 0;
        for(int i= 1; ; i++)    // for loop to find reversed of the binary equivalent
        {
            int r = a/2;
            if(a/2==0)
            {
                s=s+'1';
                break;
            }
            else if (a%2==0)
            s=s+'0';
            else if(a%2!=0)
            s=s+'1';
            a=r;
        }
        int l = s.length();
        for(int i =0;i<l;i++)   // counting number of 1s prsent in the binary equivalent
        {
            char ch = s.charAt(i);
            if(ch=='1')
            c=c+1;                              
        }
         for(int i = l-1;i>=0;i--)    // storing the binary equivalent of the number
        {
           char ch1= s.charAt(i);
           s1= s1+ch1;
        }
        
        System.out.println( "BINARY EQUIVALENT : " +s1);  // printing binary equivalent of the number
        System.out.println("NUMBER OF 1s : " +c);    // printing number of 1s prsent in the binary equivalent
        if(c%2==0)     // printing whether the number is evil number or not.
        System.out.println(a1+ " IS AN EVIL NUMBER ");
        else
         System.out.println(a1+ " IS  NOT AN EVIL NUMBER ");
    }   // end of class
}
/*
 OUTPUT 1
 ENTER A NUMBER TO CHECK WHETHER IT IS EVIL NUMBER OR NOT
26
BINARY EQUIVALENT : 11010
NUMBER OF 1s : 3
26 IS  NOT AN EVIL NUMBER 

OUTPUT 2 
ENTER A NUMBER TO CHECK WHETHER IT IS EVIL NUMBER OR NOT
15
BINARY EQUIVALENT : 1111
NUMBER OF 1s : 4
15 IS AN EVIL NUMBER 
 
OUTPUT 3
ENTER A NUMBER TO CHECK WHETHER IT IS EVIL NUMBER OR NOT
145
 NUMBER OUT OF RANGE  . PLEASE ENTER AGAIN
 ENTER A NUMBER TO CHECK WHETHER IT IS EVIL NUMBER OR NOT
1
 NUMBER OUT OF RANGE  . PLEASE ENTER AGAIN
 ENTER A NUMBER TO CHECK WHETHER IT IS EVIL NUMBER OR NOT
15
BINARY EQUIVALENT : 1111
NUMBER OF 1s : 4
145 IS AN EVIL NUMBER 
 */
         
             