//Accept a string . All consonants are moved one character backward and all vowels are moved one character forward.
import java.util.*;
class pro
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String s = sc.nextLine();
        s=s.trim();
        s=s+" "; String w=""; 
        String newwrd = ""; String newwrd2 = "";
        int l = s.length(); String z = "AEIOUaeiou";
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                w =w +ch;
            }
            else
            {
                for(int j = 0;j<w.length();j++)
                { 
                    char ch2 = w.charAt(j);
                    if(z.indexOf(ch2)!=-1)
                        newwrd = newwrd + ++ch2;
                    else
                        newwrd = newwrd + --ch2;
                }
                newwrd2 =  newwrd + "  ";
                w="";
                newwrd="";
                System.out.print( newwrd2 + " ");
            }
        }

    }
}
/*
OUTPUT
Enter a String 
ALL ZEBRAS ARE THERE TO EAT
BKK   YFAQBR   BQF   SGFQF   SP   FBS   
 */