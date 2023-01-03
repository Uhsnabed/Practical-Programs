/*
 19)  WAP to take input a word in upper case and rearrange it by bringing all the vowels in the word at the beginning followed by the consonants. Also
  find the frequency of the vowels and consonants in the word.
  Example: ORIGINAL becomes OIIARGNL
*/  
import java.util.*;
class Prog19
{
    String wrd,newwrd;   //data members
    Prog19()
    { wrd="";   // initializing the data members
        newwrd="";
    }
    void readword()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word in upper case");
        wrd = sc.next();    // taking input a word
        wrd = wrd.toUpperCase();
    }
    void freq_vow_con()
    {   int fv=0,fc=0;
        int l = wrd.length();
        for(int i = 0;i<l;i++)     // calulating the frequency of vowels and consonants in the word
        {
            char ch = wrd.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            fv=fv+1;
            else
            fc = fc+1;
        }
        System.out.println(" Frequency of vowels: "+ fv);   // printing
        System.out.println(" Frequency of consonants: "+ fc);
    }
    void arrange()
    {  int l1 = wrd.length();
        String s1="",s2="";
        for(int i = 0;i<l1;i++)      // arranging the word with vowels at first followed by consonants
        {
            char ch = wrd.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            s1 = s1+ch;
            else
            s2= s2+ch;
          }
          newwrd = s1+s2;
        }
    void display()
    { System.out.println(" Original word : " +wrd);    // printing the original word
       System.out.println(" Rearranged word : "+ newwrd);    // printing the rearraged word
    }
    public static void main()   // main method
    {
        Prog19 ob = new Prog19();    //  creating object of the class
        ob.readword();      // calling required functions
        ob.freq_vow_con();
        ob.arrange();
        ob.display();
    }
}    // end of class
/*
 OUTPUT
 Enter a word in upper case
original
 Frequency of vowels: 4
 Frequency of consonants: 4
 Original word : ORIGINAL
 Rearranged word : OIIARGNL
 */        
        
        
    
          
