/*
 
  6) Given two integer arrays A1[ ]andA2[ ]of size N and M respectively. Sort the first array A1[ ]such 
that all the relative positions of the elements in the first array are the same as the elements 
in the second array A2[ ].
See example for better understanding.
Note: If elements are repeated in the second array, consider their first occurence only.
Example 1:
Input:
N = 11 
M = 4
A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
A2[] = {2, 1, 8, 3}
Output: 
2 2 1 1 8 8 3 5 6 7 9
Explanation: Array elements of A1[] are
sorted according to A2[]. So 2 comes first
then 1 comes, then comes 8, then finally 3
comes, now we append remaining elements in
sorted order.
Input:
N = 11 
M = 4
A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
A2[] = {99, 22, 444, 56}
Output: 
1 1 2 2 3 5 6 7 8 8 9
Explanation: No A1[] elements are in A2[]
so we cannot sort A1[] according to A2[].
Hence we sort the elements in non-decreasing 
order.
*/
import java.util.*;
class Prog6
{
    static Scanner in=new Scanner(System.in);
    static int A1[],A2[],N,M,freq[][],res[],numsLeft[][],p,m,c;      // data members
    Prog6()     // non- parameterized constructor
    {
        N=0;
        M=0;
        p=0;
        m=0;
        c=0;
    }
    void inputArraySize()     // taking input array size from user
    {
        System.out.println("Enter size of the first array");
        N=in.nextInt();
        System.out.println("Enter size of the second array");
        M=in.nextInt();
        A1=new int[N];
        A2=new int[M];
        freq=new int[2][N];
        res=new int[N];
        numsLeft=new int[2][N];
    }
    void Arrayinput()     // taking input the array elements
    {
       
        System.out.println("Enter elements of the first array");
        for(int i=0;i<N;i++)
        A1[i]=in.nextInt();
        System.out.println("Enter elements of the second array");
        for(int i=0;i<M;i++)
        A2[i]=in.nextInt();
    }
    int checkDuplicate(int num)    // sorting starts
    {
        int i;
        for(i=0;i<p;i++)
        {
            if(freq[0][i]==num)
            return 1;
        }
        return 0;
    }
    void calFreq()           
    {
        int i,j,frequency=1;
        for(i=0;i<N;i++)
        {
            if(checkDuplicate(A1[i])==0)
            {
                freq[0][p]=A1[i];
                for(j=i+1;j<N;j++)
                {
                    if(A1[j]==A1[i])
                    frequency++;       // incrementing the value of feequency by 1 if the condition is met
                }
                freq[1][p]=frequency;
                frequency=1;
                p++;
            }
        }
    }
    void fillResArray(int num,int rep)
    {
        int i;
        for(i=0;i<rep;i++)
        res[m++]=num;
    }
    //sorting the array A1[ ]such that all the relative positions of the elements
    //in the first array are the same as the elements in the second array A2[ ].
    
    void relativePos()   
    {
        int i,j;
        for(i=0;i<M;i++)
        {
            for(j=0;j<p;j++)
            {
                if(A2[i]==freq[0][j])
                {
                    fillResArray(A2[i],freq[1][j]);
                    freq[1][j]=0;
                    break;
                }
            }
        }
    }
    void fillnumsLeftArr()
    {
        int i;
        for(i=0;i<p;i++)
        {
            if(freq[1][i]!=0)
            {
                numsLeft[0][c]=freq[0][i];
                numsLeft[1][c++]=freq[1][i];
            }
        }
    }
    void sortnumsLeftArr()
    {
        int i,j,t;
        for(i=0;i<c-1;i++)
        {
            for(j=i+1;j<c;j++)
            {
                if(numsLeft[0][i]>numsLeft[0][j])
                {
                    t=numsLeft[0][i];numsLeft[0][i]=numsLeft[0][j];numsLeft[0][j]=t;
                    t=numsLeft[1][i];numsLeft[1][i]=numsLeft[1][j];numsLeft[1][j]=t;
                }
            }
        }
        for(i=0;i<c;i++)
        {
            fillResArray(numsLeft[0][i],numsLeft[1][i]);
        }
    }
    void display()     // printing the resultant array
    {
        int i;
        System.out.println("Resultant array :");
        for(i=0;i<N;i++)
        System.out.print(res[i]+"\t");
    }
    public static void main(String args [])    // main method
    {
        Prog6 ob=new Prog6();
        ob.inputArraySize();
        ob.Arrayinput();
        ob.calFreq();
        ob.relativePos();
        ob.fillnumsLeftArr();
        ob.sortnumsLeftArr();
        ob.display();
    }   // end of main
}  // end of class
/*
 OUTPUT
Enter size of the first array
11
Enter size of the second array
4
Enter elements of the first array
2
1
2
5
7
1
9
3
6
8
8
Enter elements of the second array
99
22
444
56
Resultant array :
1    1    2    2    3    5    6    7    8    8    9     
 
*/