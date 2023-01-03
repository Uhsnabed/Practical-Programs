/*
6} An encoded text is decoded by adding 2 (two) in the ASCII code in each alphabet of encode text, other than alphabets are ignored 
and will not be taken into account (eg the decoded character of A is C for B is D, for C is E..... for X is Z ,for Y is A and for 
Z is B.) Whenever character “KK” appears in encoded text will taken a one blank space [If more than pair of “KK” is present in the 
encoded text, it will be taken as one blank space].Write a program to read an encoded text in capital (if not then convert) maximum of 
200 characters only from input, assume there is no space present in the encoded text and print in decoded text format.

The first letter of each word should be in capital and rest be in small.(any numeric data present in the encoded text will be ignored 
i.e. should not be present in the decoded text.)

Test your program with the following data:-

Input(encoded text)   : ZCQRKKMDKKJSAI
Output(decoded text)  : Best Of Luck

Input(encoded text)   : HYKCQKKZMLB
Output(decoded text)  : James Bond

Input(encode text)    : J9Y65NKKKKR122MN
Output(decoded text)  : Lap Top
*/


import java.util.*;
class encode
{
    String s,st="";
    int l;
    public void input()  //method to accept string from user and check if length is in range
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter encoded text : ");
        s=sc.nextLine();   //accepting string from user
        l=s.length();
        if(l>200)   //checking if string length is more than 200
        {
            while(true)   //while loop to keep inputting string until it has a valid range
            {
                System.out.println("Invalid string length! Try again!");
                s=sc.nextLine();
                l=s.length();
                if(l<=200)
                break;
            }
        }
    }

    public void decodeText()   //method to decode the string
    {
        s=s.toUpperCase();
        char c;  //variable to store new character that should be put in the new string
for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);   //extracting a character from the string
            c='\u0000'; 
            if(ch>='A'&&ch<='Z')
            {
                if(ch=='K')
                {
                    char ch1=s.charAt(i+1);
                    if(ch1=='K')  //if successive character is 'K', blank space is inserted in new string and a position is skipped
                    {
                        st=st+" ";
                        i=i+1;
                        while(true)  //while loop to skip every successive two consecutive 'K's                        
                        {
                            if(s.charAt(i+1)=='K'&&s.charAt(i+2)=='K')
                            i=i+2;
                            else
                            break;
                        }
                    }
                    else
                    c=(char)(ch+34);  //forming new character in lowercase
                }
                else
                if(ch=='Y')
                c='a';
                else
                if(ch=='Z')
                c='b';
                else
                c=(char)(ch+34);   //forming new character in lowercase
            }
            else
            if(ch>='0'&&ch<='9')   //if character is between '0' and '9', nothing is done
            {}
            else   //if character is anything other than numbers and alphabets, error message is displayed and program is terminated
            {
                System.out.println("Invalid! String can contain only alphabets and numbers!");
                System.exit(0);
            }

            if(st.equals(""))  //if character is the first one in new string, it is always in capital
            c=Character.toUpperCase(c);
            else
            if(st.charAt(st.length()-1)==' ')   //if last character in new string is blank, the new character added is converted to uppercase
            c=Character.toUpperCase(c);

            if(c!='\u0000')  //if character is not null, character is added to new string
            st=st+c;
        }
    }

    public void display()
    {
        System.out.println("Encoded Text : "+s);
        System.out.println("Decoded Text : "+st);
    }
    public void main()
    {
       encode ob=new encode();
ob.input();
ob.decodeText();
ob.display();
    }
}
/*
Enter encoded text : 
ZCQRKKMDKKJSAI
Encoded Text : ZCQRKKMDKKJSAI
Decoded Text : Best Of Luck
*/

