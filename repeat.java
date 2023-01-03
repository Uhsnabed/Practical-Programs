/*  7} Write a program to accept a string and find the maximum repeated sequence of every letter.
  For example, given the sample input
  "acbaabbbaaaaacc"
  Output for the sample input can be:
  a=5
  b=3
  c=2
 */
import java.util.*;
class repeat
{
    String s;int a[];              //data members
    public void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");    //taking input from user
        s=sc.nextLine();
    }
    public void findfreq()         //method to find maximum frequency of each letter
    {
        s=s+ " ";
        s=s.toLowerCase();
        System.out.println("String in lower case: "+s);
        a=new int[26];
        for(int i=0;i<26;i++)
        {a[i]=0;          //initializing all values to 0
        }int l=s.length();
        int f=0;
        int k=0;
        for(char c ='a';c<='z';c++)
        { for(int i=0;i<l;i++)
            {
                char ch=s.charAt(i);       //storing each letter of the string
                if(ch==c)
                k++;
                if(ch!=c)
                { if(k>a[f])
                    a[f]=k;
                    k=0;
                }
            }
            f++;
        }
    }
    public void display()     //displaying the letters along with their maximum sequence
    {
        char ch='a';
        for(int i=0;i<25;i++)
        {
            if(a[i]>0)
            System.out.println(ch+"="+a[i]);
            ch=(char)(ch+1);
        }
    }
    public void main()     //main method to call the above functions
    {
        repeat ob = new repeat();
        ob.input();
        ob.findfreq();
        ob.display();
    }
}
/* OUTPUT
 Enter a string
 aabbbcczzyyyyfff
 String in lower case: aabbbcczzyyyyfff 
 a=2
 b=3
 c=2
 f=3
 y=4
 z=2
*/
        