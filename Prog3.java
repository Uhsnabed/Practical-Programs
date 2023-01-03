/*
 3) The potential of a word is found by adding the ASCII value of the alphabets.
(ASCII values of A to Z are 65 to 90).
Example: BALL
Potential = 66 + 65 + 76 + 76 = 283
Write a program to accept a sentence which may be terminated by either “ . ” , “ ? ” or “ ! ” only.
The words of sentence are separated by single blank space and are in UPPER CASE. Decode the
words according to their potential and arrange them in ascending order of their potential strength.
Test your program with the following data and some random data:
Example 1:
INPUT: HOW DO YOU DO?
OUTPUT: HOW = 238
DO = 147
YOU = 253
DO = 147
 DO DO HOW YOU
Example 2:
INPUT: LOOK BEFORE YOU LEAP.
OUTPUT: LOOK = 309
BEFORE = 435
YOU = 253
LEAP = 290
 YOU LEAP LOOK BEFORE
Example 3:
INPUT: HOW ARE YOU#
OUTPUT: INVALID INPUT
 */
import java.util.*;
class Prog3
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println(" ENTER A SENTENCE ");     // taking input from user
        String s = sc.nextLine();
        
        s=s.toUpperCase();     // converting the string to upper case
        int l1 = s.length();
       
        
        char ch1 = s.charAt(l1-1); 
        if(ch1!='.' && ch1!='?' && ch1!='!')    // checking if the sentence ends with the required punctuation
        {System.out.println("invalid input");
         System.exit(0);
        }
         int z[] = new int[50];    // to store potential of each word
            String z1[] = new String[50];     // to store each word
            int c = 0,sum=0;
            String w = "";
            for(int i = 0;i<l1-1;i++)    // loop to find potential
            {
                char ch2 = s.charAt(i);
                if(ch2!=' ')
                {
                    w=w+ch2;       // storing each word in w
                }
                else
                {
                    z1[c]=w;    // storing each word in array
                  int l2 = w.length();   // storing length of each word
                    for(int j = 0;j<l2;j++)
                    {
                        char ch3 = w.charAt(j);
                        int a1 = (int)ch3;
                        sum = sum + a1;     // storing potential
                    
                    }
                    z[c] = sum;    // storing potential of each word in array
                    c++;     // counter variable to count number of words
                    
                    w = ""; sum = 0;
                }
           
            }
            for(int i=0;i<c;i++)   // priting each word along with their respective potential
            {
                System.out.println(z1[i]+" = " + z[i]);
            }
            for(int i = 0;i<c-1;i++)    // buuble sort to sort the sentence in ascending order of their potential strength
            {
                for(int j = 0;j<c-i-1;j++)
                {
                    if(z[j]>z[j+1])
                    {
                        String t = z1[j];   int t1 = z[j]; z[j] = z[j+1] ; z[j+1] = t1;
                        z1[j] = z1[j+1];
                        z1[j+1] = t;
                    }
                }
            }
             for(int i = 0;i<c;i++)       // printing the sorted sentence
            {   System.out.print(z1[i] + " ");
            }
        }
    }  // end of class
/*
  OUPUT
  ENTER A SENTENCE 
HOW DO YOU DO ?
HOW = 238
DO = 147
YOU = 253
DO = 147
DO DO HOW YOU 
 
*/    

                        
            