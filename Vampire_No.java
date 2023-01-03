// WAP TO CHECK WHETHER A NUMBER IS A VAMPIRE NUMBER OR NOT 
import java.util.*;
class Vampire_No
{
    static int n;
    int prime(int n1)
    {
        int f=0;
        for(int i=1;i<=n1;i++)
        {
            if(n%i==0)
                f++;
        }
        if(f==2)
            return 1;
        else
            return 0;
    }

    public static void main()
    {
        Vampire_No ob = new Vampire_No();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number to check whether it is a Vampire number or not ");
        n = sc.nextInt();
        String z = Integer.toString(n);
        int k = ob.prime(n); int d=0; int h1=0; int h2=0; int z2=0;
        while(z.length()%2 !=0 || n<=0 || k==1)
        {
            System.out.println("Invalid Input . Enter again ");
            System.out.println(" Enter a number to check whether it is a Vampire number or not ");
            n = sc.nextInt();
            z = Integer.toString(n);
            k = ob.prime(n);
        }
        for(int i = (int)Math.pow(10,(z.length()/2)-1);i<=Math.pow(10,(z.length()/2))-1;i++)
        {
            d=0;h1=0;h2=0;
            for (int j=(int)i;j<=Math.pow(10,(z.length()/2))-1;j++)
            {
                if(i*j==n && n%i==0 && n%j==0)
                {
                    String z1 = Integer.toString(i) + Integer.toString(j);
                    char ch1 = Integer.toString(i).charAt(z.length()/2-1);
                    char ch2 = Integer.toString(j).charAt(z.length()/2-1);
                    for(int k1 = 0;k1<z.length();k1++)
                    {
                        if(z.indexOf(z1.charAt(k1))!=-1)
                            d++;
                    }
                    if(ch1=='0')
                        h1++;
                    if(ch2=='0')
                        h2++;

                    if((h1+h2<=1) && (d==z.length()))
                    {
                        System.out.println(h1+h2);
                        System.out.println(d);

                        System.out.println(n+ " is a Vampire Number ");
                        z2 =1;
                        break;
                    }
                }
            }
            if(z2==1)
                break;
        }
        if(z2==0)
            System.out.println(n+ " is not a Vampire Number ");
    }
}
/*
 OUTPUT 1
 Enter a number to check whether it is a Vampire number or not 
12456
Invalid Input . Enter again 
 Enter a number to check whether it is a Vampire number or not 
-6880
Invalid Input . Enter again 
 Enter a number to check whether it is a Vampire number or not 
6880
1
4
6880 is a Vampire Number 
 OUTPUT 2
  Enter a number to check whether it is a Vampire number or not 
6889
6889 is not a Vampire Number 
 OUTPUT 3
Enter a number to check whether it is a Vampire number or not 
125248
0
6
125248 is a Vampire Number
 */
