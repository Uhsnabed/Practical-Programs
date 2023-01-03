  /*
 8) Saurabh is receiving some encrypted messages. Decrypting them seems to be very easy to him. 
Still he is too lazy to decode it. The message is in the form of a string with digits(1-9) and 
uppercase English alphabets (A-Z). Digits imply the number of times the string following it 
(till the next digit) will be printed. Help Saurabh to print the exact answer. (Solve the program with recursion)

Note: There will not be two consecutive digits in given string.
1st line of input n. Of strings taken as input

Input:
2
1A1B
2AB3C

Output:
AB
ABABCCC
*/
import java.io.*;
class Prog8
{
    int n;
    String en[],de[];     // data members
    public void inputstring() throws IOException         // taking input from user
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of String :");
        n=Integer.parseInt(br.readLine());
        en=new String[n];
        de=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("String "+(i+1)+" :");
            en[i]=br.readLine();
            char last=en[i].charAt(en[i].length()-1);
            for(int j=0;j<en[i].length()-1;j++)
            {
                char ch=en[i].charAt(j);
                char ch1=en[i].charAt(j+1);
                if((ch>='0'&&ch<='9'&&ch1>='0'&&ch1<='9')||(last>='0'&&last<='9'))
                {
                    System.out.println("Invalid input! Try again!");       // asking user to input again if condition not met
                    --i;
                    break;
                }
            }
        }
    }
    
    public String converting(String st,int l)     // decrypting the code
    {
        char ch=st.charAt(0);
        int end=0;
        for(int i=1;i<l;i++)
        {
            char ch1=st.charAt(i);
            if(ch1>='0'&&ch1<='9')
            {
                end=i;
                break;
            }
            if(i==l-1)
            end=l;
        }
        String extract=st.substring(1,end);
        String decrypt="";
        
        for(int i=1;i<=ch-48;i++)
        decrypt=decrypt+extract;
        
        int newlen=l-1-extract.length();      // extracting the characters
        if(newlen==0)
        return decrypt; 
        return (decrypt+converting(st.substring(end,l),newlen));
    }
        
    public void changed()   
    {
        for(int i=0;i<n;i++)
        de[i]=converting(en[i],en[i].length());
    }
        
    public void display()     // printing the decoded text
    {
        System.out.println("Decrypted String(s) :");
        for(int i=0;i<n;i++)
        System.out.println(de[i]);
    }

    public void main() throws IOException     // main method
    {
        Prog8 ob=new Prog8();
        ob.inputstring();
        ob.changed();
        ob.display();
    }    // end of main method
}   // end of class

/*
  OUTPUT
Enter number of String :
2
String 1 :
1A1B
String 2 :
2AB3C
Decrypted String(s) :
AB
ABABCCC

*/