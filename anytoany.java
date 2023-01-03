 
/* 
  11) Write a menu-driven program to convert any number:
   i}  From decimal to any base.
   ii} From any base to decimal.
  Using above two functions convert from any base to any base.
 */
 import java.util.*;
class anytoany
{
    public String decitoany(long no,int b)      //method to convert decimal to any base
    {
        String num="";
        String s;
        while(no>0)             //converting decimal number to required base 
        {
            int d=(int)no%b;
            s="";
            if(d>=10 && d<=15)
            s=s+(char)(d+55);
            else
            s=Integer.toString(d);
            num=s+num;
            no=no/b;
        }
        return num;               //returning the converted number
    }  //end of decitoany
    public long anytodeci(String s,int b)       //method to convert number of any base to decimal
    {
        int l=s.length();
        long n=0L;
        int d;
        for(int i =0;i<l;i++)           //converting number to decimal
        {
            char ch1=s.charAt(i);
            if(ch1>='A' && ch1<='F')
            d=ch1-55;
            else
            d=ch1-48;
            n=n+d*(long)Math.pow(b,l-i-1);
        }
        return n;           //returning the converted number      
    }  // end of anytodeci
    public void main()     //main method
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter 1 for decimal to any base,2 for any base to decimal,3 for any base to any base:");
        int ch=sc.nextInt();   //taking  choice from user
         while(ch!=1 && ch!=2 && ch!=3)
            {
            System.out.println(" Wrong Choice! Enter correct value. ");
            System.out.println("Enter 1 for decimal to any,2 for any to decimal,3 for any to any:");
            ch=sc.nextInt();
        }
        switch(ch)      //switch case
        {
            case 1:
            System.out.println("Enter decimal number to be converted: ");
            long dec=sc.nextInt();    //taking input
            System.out.println("Enter base to which it needs to be converted");
            int b1= sc.nextInt();     //taking input
            while(b1!=2 && b1!=8 && b1!=10 && b1!=16)
            {
                System.out.println("Base must be 2 or 8 or 10 or 16!  Try Again");
                System.out.println();
                System.out.println("Enter decimal number to be converted: ");
                dec=sc.nextInt();
                System.out.println("Enter base to which it needs to be converted");
                b1= sc.nextInt();
            }
            System.out.println("Converted number : "+decitoany(dec,b1));  //printing
            break;
            case 2:
            System.out.println("Enter number ");
            String st1=sc.next();    //taking input
            System.out.println("Enter its base");
            int b2=sc.nextInt();     //taking input
            while(b2!=2 && b2!=8 && b2!=10 && b2!=16)
            {
                System.out.println("Base must be 2 or 8 or 10 or 16!    Try Again");
                System.out.println();
                System.out.println("Enter number ");
                st1=sc.next();
                System.out.println("Enter its base");
                b2=sc.nextInt();
            }
            System.out.println("Number in decimal system : "+anytodeci(st1,b2));  //printing
            break;
            case 3:
            System.out.println("Enter number, its base and the base to which it has to be converted: ");
            String st2=sc.next();    //taking input
            int b3=sc.nextInt();
            int b4=sc.nextInt();
            while ((b3!=2 && b3!=8 && b3!=10 && b3!=16)&&(b4!=2 && b4!=8 && b4!=10 && b4!=16))
            {
                System.out.println("Base must be 2 or 8 or 10 or 16!    Try Again");
                System.out.println();
                System.out.println("Enter number, its base and the base to which it has to be converted: ");
                st2=sc.next();
                b3=sc.nextInt();
                b4=sc.nextInt();
            }
            long deci = anytodeci(st2,b3);     //calling method anytodeci to convert number of any base to decimal
            String any= decitoany(deci,b4);    //calling method decitoany to convert decimal number to number of any base
            System.out.println("Converted number: "+any);  //printing
            break;
            
           
        }
    }    //end of main
}  //end of class
/*
  Enter 1 for decimal to any,2 for any to decimal,3 for any to any:
5
 Wrong Choice! Enter correct value. 
Enter 1 for decimal to any,2 for any to decimal,3 for any to any:
7
 Wrong Choice! Enter correct value. 
Enter 1 for decimal to any,2 for any to decimal,3 for any to any:
3
Enter number, its base and the base to which it has to be converted: 
45
10
16
Converted number: 2D
*/
 
                
                
        
            
                
                
                
            
        
        