/*
 13}  A mathematician has allowed some process for finding a palindrome of a number having two or more digits as follows:
step 1: Reverse the digits of the original number
step 2: Add the reverse number and the original number to get a new number.
Step 3. If the new number is a palindrome number means the new number is a palindrome otherwise repeat all the steps by 
taking the new number as the original number till a palindrome is obtained. Repeat your process for maximum 15 steps. 

For example: Input num =78

	 Step 1	Step 2	Step 3	Step 4
Number:	  78	 165	 726	 1353
Reverse:  87	 561	 627	 3531
Sum:	 165	 726	1353	 4884

Output num = 78 its palindrome number is 4884 and found in step 4

Write a program to input a positive number ‘num’ of minimum two digits (display appropriate error message if ‘num’ 
is less than two digits.) and generate a palindrome number upto 15 steps using the above procedure and output the 
original number and the palindrome number and step number where palindrome is found. (use recursive function for generating palindrome)
*/
import java.util.*;
class palindrome
{
    long n;    
    public void input()   
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");   //taking input number from user
        n=sc.nextLong();
        String st=Long.toString(n);   //finding number of digits of the number taken from user
        int l=st.length();
        while(l<2)
        {
            System.out.println("Error! Number should have minimum 2 digits!");
            System.out.println("Enter a number :");
            n=sc.nextLong();
            st=Long.toString(n);
            l=st.length();
        }
    }

    public long pgen(long no,long rev)    //recursive function to return reverse of the number
    {
        if(no==0)
        return rev;
        rev=rev*10+no%10;
        return pgen(no/10,rev);
    }

    public boolean pcheck(long a)
    {
        long num=a,reverse;
        long s,rev1;
        int c=0;
for(int i=1;i<=15;i++)      //generating palindrome number
        {
            reverse=pgen(num,0);
            s=num+reverse;
            rev1=pgen(s,0);
            num=s;
            if(rev1==s)
            {
                c=1;
                break;
            }
        }
        if(c==1)
        return true;
        return false;
    }

    public void pfind()     //printing
    {
        if(pcheck(n)==false)
        {
            System.out.println("No palindrome number can be generated within 15 steps");
            System.exit(0);
        }
        long num=n,reverse;
        long s,rev1;
        System.out.println("Original number : "+n);     
        System.out.println("New number at :");         //printing new number
for(int i=1;i<=15;i++)    
        {
            reverse=pgen(num,0);
            s=num+reverse;
            rev1=pgen(s,0);
            num=s;
            System.out.println("Step "+i+" : "+s);
            if(rev1==s)
            {
                System.out.println("Palindrome number obtained at step "+i);   //printing step where palindrome number is found
                break;
            }
        }
    }

    public void main()
    {
       palindrome ob=new palindrome();     //creating object
ob.input();    //calling functions
ob.pfind();
    }   //end of main method
}   //end of class
/*
Enter a number :
4
Error! Number should have minimum 2 digits!
Enter a number :
5
Error! Number should have minimum 2 digits!
Enter a number :
78
Original number : 78
New number at :
Step 1 : 165
Step 2 : 726
Step 3 : 1353
Step 4 : 4884
Palindrome number obtained at step 4
*/
