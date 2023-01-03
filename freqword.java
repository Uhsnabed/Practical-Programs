
 //  2) Accept a text, words( seperated by more than 1 blank,!,?). Find the frquency of each word and also find the mode.
 import java.util.*;
class freqword
{
    public static void main()  //taking input from user
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        StringTokenizer tokens= new StringTokenizer(s," !?");
        int n=tokens.countTokens();
        String word[]=new String[n];  //using String Tokenizer storing each word in form of token
        int f[]=new int[n];
        int t=0;
        for(int i=0;i<n;i++)
        {
            String st=tokens.nextToken();
            int check=1;
            for(int j=0;j<t;j++)
            {
                if(word[j].equalsIgnoreCase(st))
                {
                    f[j]++;
                    check=0;
                    break;
                }
                else
                check=1;
            }
            if(check==1)
            {
                word[t]=st;
                f[t]++;
                t++;
            }
        }
        int high = 0;
        System.out.println();
        System.out.println();
        System.out.println("Word"+"\t" +"\t"+  "Frequency");
        System.out.println();
        System.out.println();
         for(int i=0;i<t;i++)   //printing each word along with their frequency
        {
            System.out.println(word[i]+"\t"+ "\t"+  f[i]);
            if(f[i]>high)
            {
                high=f[i];
            }
        }
        
        System.out.println();
        System.out.println();
        System.out.println("Mode in the sentence");
        System.out.println();
        for(int i=0;i<t;i++)     //printing mode
          {
              if(f[i]==high)
              System.out.print(word[i] + "\t");
            }
        System.out.println();
        System.out.println();
        System.out.println("Frequency:" + " "+ high);     //printing frequency of mode
        }
}
/*
Enter a sentence
Sun rises in the east and sets in the west


Word		Frequency


Sun		1
rises		1
in		2
the		2
east		1
and		1
sets		1
west		1


Mode in the sentence

in	the	

Frequency: 2
*/
            
                
        
 