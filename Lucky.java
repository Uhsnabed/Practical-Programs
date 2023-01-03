/*  
   9} Consider the following sequence of numbers:
     1,2,3,4,5,6,7,8,9,10,11,12,13...........
     Removing every second number produces the sequence:
     1,3,5,7,9,11,13,15............
     Removing every third number on the sequence produces:
     1,3,7,9,13
     This process continues indefinitely by removing the fourth,fifth and so on, till after a fixed number of 
     steps,certain natural numbers indefinitely. These are known as lucky numbers. 
     Write a program to generate and print Lucky numbers less than a given natural number n where n<=50
*/
import java.util.*;
class Lucky
{
    int a[],n,no;
    public void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value not more than 50 upto which lucky numbers would be printed");
        n=sc.nextInt();         
        while(n>50)
        {
         System.out.println("Number cannot be greater than 50! :(  Try Again");
         System.out.println();
         System.out.println("Enter value not more than 50 upto which lucky numbers would be printed");
         n=sc.nextInt();        //taking input until user input n less than 50
         }
      }
    public void generate()        //method to generate Lucky numbers
    {
        a= new int[n];
        int ar[]=new int[n/2];     
        for(int i=0;i<n;i++)
        a[i]=i+1;
        int c=0;
        no=n;
        for(int i=2;;i++)
        {
            if(i>no)                                //checking Lucky numbers
            break;
            c=0;
            for(int j=0;j<no;j++)
            {
                if((j+1)%i==0)
                {
                    ar[c]=a[j];
                    c++;
                }
            }
            for(int k=0;k<c;k++)
            {
                for(int l=0;l<no;l++)
                {
                    if(ar[k]==a[l])
                    {
                       for(int m=l+1;m<no;m++)
                       a[m-1]=a[m];
                       no--;
                       break;
                    }
                }
            }
        }
    }
  public void display()        //displaying the Lucky numbers
  { System.out.print("Lucky numbers are ");
      for(int i=0;i<no;i++)
      System.out.print(a[i]+ " ");
  }
    public static void main()    //main method to call above functions
  {
      System.out.println();
       Lucky ob = new Lucky();
      ob.input();
      ob.generate();
      ob.display();
   }
}
/* OUTPUT
Enter value not more than 50 upto which lucky numbers would be printed
56
Number cannot be greater than 50! :(  Try Again

Enter value not more than 50 upto which lucky numbers would be printed
64
Number cannot be greater than 50! :(  Try Again

Enter value not more than 50 upto which lucky numbers would be printed
25
Lucky numbers are 1 3 7 13 19 
*/
    
    
           