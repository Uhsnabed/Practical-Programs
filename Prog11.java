/*
 11) Animesh owns a mobile repair shop. He can fix screen, battery and motherboard issues. He being a good technician, is quite famous 
 and huge number of people line up to get their phones fixed everyday.

Design a system which generates a token based on a customer’s arrival time and will contain his position in the queue and the issue
he has according to the following : S for screen issues, B for battery issues and M for motherboard issues. The system will route the
customers to Animesh in the following procedure : For every 3 battery issues there will be 2 screen issues and 1 motherboard issue 
that’ll be sent to Animesh.

Let B represent Battery queue.

Let S represent Screen queue.

Let M represent Motherboard queue.

If there are a total of 10 battery issue persons 8 screen issue persons and 5 motherboard problems,

then the queues will fill up as 3B-2S-1M, 3B-2S-1M, 3B-2S-1M, 1B-2S-1M, 1M,...

Input : time of arrival :

Issue : B/S/M

Output : The token numbers passed to Animesh and solved beside their token number

 

Example :

1B issue solved

3B issue solved

4B issue solved

2S issue solved

6S issue solved

5M issue solved 
 */  

import java.util.*;
class Prog11
{
    Scanner sc;
    String t[];      // data members
    int bb,ss,mm;
    String B[],S[],M[],Q[];
    int ct,a,j,k,i;
    Prog11()       // initializing data members to their initial values
    {
        sc=new Scanner(System.in);
        bb=0;
        ss=0;
        mm=0;
        ct=0;
        a=j=k=0;
        i=0;
        t=new String[1000];
        B=new String[1000];
        S=new String[1000];
        M=new String[1000];
        Q=new String[1000];
    }

    void m()
    {
        Prog11 ob=new Prog11();     // creating object of class

        char ans;
        do
        {
            System.out.println("Enter time of arrival in the format B/S/M  ");    // taking input time from user
            t[i]=sc.next();
            ct++;

            System.out.println("Enter issue as \n B for Battery\nS for screen \nM for motherboard");     // taking input the issue
            char ch=sc.next().charAt(0);
            switch(ch)        
            {
                case 'B': bb++;
                B[a++]=ct+"B";
                Q[i]=B[a-1];
                break;
                case 'S':ss++;
                S[j++]=ct+"S";
                Q[i]=S[j-1];
                break;
                case 'M':mm++;
                M[k++]=ct+"M";
                Q[i]=M[k-1];
                break;
            }
            i++;
            System.out.println("Do you want to continue?y/n");     // asking the user if they want to continue or not
            ans=sc.next().charAt(0);
        }
        while(ans!='n');

    }

    void disp()     // method to display required information
    {
        
        int c=0,i1=0,i2=0,i3=0;
        do
        {
        for(int h=0;h<ct;h++)
        {
            char e=Q[h].charAt(1);
            if(e=='B' && Q[h]!="00")     // checking and printing those issues which are solved
            {
                System.out.println(Q[h] +" is solved");
                Q[h]="00";
                i1++;
                c++;
                if(i1>=3)
                {
                    i1=0;
                    break;
                }
            }
        }

            for(int h=0;h<ct;h++)
            {
                char e=Q[h].charAt(1);
                if(e=='S' && Q[h]!="00")     // checking and printing those issues which are solved
                {
                    System.out.println(Q[h]+" is solved");
                    Q[h]="00";
                    i2++;
                    c++;
                    if(i2>=2)
                    {
                        i2=0;
                        break;
                    }
                }
            }

                for(int h=0;h<ct;h++)
                {
                    char e=Q[h].charAt(1);
                    if(e=='M' && Q[h]!="00")         // checking and printing those issues which are solved
                    {
                        System.out.println(Q[h] + " is solved");
                        Q[h]="00";
                        i3++;
                        c++;
                        if(i3>=1)
                        {
                            i3=0;
                            break;
                        }
                    }
                }
            
        }
        while(c<ct);
    }  // end of disp method

        public static void main()    // main method 
        {
            Prog11 ob=new Prog11();   // creating object of class
            ob.m();     // calling the above functions
            ob.disp();
        }    // end of main method
    }  // end of class
/*
 Enter time of arrival in the format B/S/M  
10/45/34
Enter issue as 
 B for Battery
S for screen 
M for motherboard
M
Do you want to continue?y/n
y
Enter time of arrival in the format B/S/M  
10/46/01
Enter issue as 
 B for Battery
S for screen 
M for motherboard
S
Do you want to continue?y/n
y
Enter time of arrival in the format B/S/M  
10/50/02
Enter issue as 
 B for Battery
S for screen 
M for motherboard
B
Do you want to continue?y/n
y
Enter time of arrival in the format B/S/M  
11/06/45
Enter issue as 
 B for Battery
S for screen 
M for motherboard
B
Do you want to continue?y/n
n
3B is solved
4B is solved
2S is solved
1M is solved

*/
          
