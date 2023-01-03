/*
Nikhil's father has set a password on his computer to prevent Nikhil from playing games. The password is a string over 
the alphabet {a,b,..., z}. Nikhil's father is not sure if he will remember the password, so he decides to write it down.
To ensure that the password is not obvious to someone reading the paper on which he has written it down, he hides it by 
writing three words on the paper. The actual password is the longest subword that is common to all these three words.
For instance, suppose Nikhil's father had written down the words aabbabbaba, abbabababa and bbabbabab. Then the hidden
password is abbaba, since this is the longest common subword.
Your task is to help Nikhil find the password from the given set of three words. If there is more than one longest common subword, report any one. 
Input format
The input consists of four lines. The first line of the input contains three integers M, N and K. The second line contains a word with M letters, the third line contains a word with N letters and the fourth line contains a word with K letters. 
Output format
A single line containing the longest common subword among the three input words. If there is more than one longest common subword, report any one. 
Test data
You may assume that N,M,K ≤ 300 in 80% of the inputs. In all inputs, N,M,K ≤ 2000.
Example
We now illustrate the input and output formats using the above example.
Sample input
10 10 9
aabbabbaba
abbabababa
bbabbabab
Sample output
abbaba
 */
import java.util.*;
class password
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of 3 words ");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();
        System.out.println("Enter 3 words ");
        String w1= sc.next(); String w2= sc.next();String w3= sc.next();
        while(l1!=w1.length() || l2!=w2.length() || l3!=w3.length())
        {
            System.out.println("Invalid Input. Enter again ");
            System.out.println("Enter length of 3 words ");
            l1 = sc.nextInt();
            l2 = sc.nextInt();
            l3 = sc.nextInt();
            System.out.println("Enter 3 words ");
            w1= sc.next();  w2= sc.next(); w3= sc.next();
        }
        String arr1[] = new String[1000]; String arr2[] = new String[1000]; String arr3[] = new String[1000]; 
        int c=0, d=0 , e=0 , so=0;
        for(int i = 0;i<=w1.length() ;i++)
        {
            for(int j = i;j<=w1.length();j++)
            { 
                String s1 = w1.substring(i,j);
                arr1[c] = s1;
                c++;
            }
        }
        for(int i = 0;i<=w2.length() ;i++)
        {
            for(int j = i;j<=w2.length();j++)
            { 
                String s2 = w2.substring(i,j);
                arr2[d] = s2;
                d++;
            }
        }
        for(int i = 0;i<=w3.length() ;i++)
        {
            for(int j = i;j<=w3.length();j++)
            { 
                String s3 = w3.substring(i,j);
                arr3[e] = s3;
                e++;
            }
        }
        String l[] = new String[5000];
        for(int i=0;i<c;i++)
        {
            String z1 = arr1[i];
            for(int j=0;j<d;j++)
            {
                String z2 = arr2[j];
                for(int k=0;k<e;k++)
                {
                    if(z1.equals(arr3[k]) && z2.equals(arr3[k]))
                    {
                        l[so] = arr3[k];
                        so++;
                    }
                }
            }
        }
        int max = l[0].length(); String nw = "";
        for(int i=0;i<so;i++)
        {
            int lz = l[i].length();
            if(lz>max)
            {
                max = lz;
                nw = l[i];
            }
        }
        System.out.println("The longest common subword which is the password is: " + nw + " having a length of "+ max);
    }
}
/*
 OUTPUT
 Enter length of 3 words 
10
8
10
Enter 3 words 
aabbabbaba
abbabababa
bbabbabab
Invalid Input. Enter again 
Enter length of 3 words 
10
10
9
Enter 3 words 
aabbabbaba
abbabababa
bbabbabab
The longest common subword which is the password is: abbaba having a length of 6

 */
