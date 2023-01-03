/* 
  5) Given an arrayA[]of integers,sort the array according to frequency of elements. That is elements 
that have higher frequency come first. If frequencies of two elements are same, then smaller 
number comes first.
5 5 4 6 4
4 4 5 5 6
*/
import java.util.*;
class Prog5
{
    static Scanner in=new Scanner(System.in);
    static int A[],res[][],cap,p;   // data members 
    Prog5()      // non - parameterized constructor
    {
        cap=0;
        p=0;
    }
    void inputArraySize()    // taking input the size of the array
    {
        System.out.println("Enter the size of the array");
        cap=in.nextInt();
        A=new int[cap];
        res=new int[2][cap];
    }
    void Arrayinput()     // taking input the array elements
    { 
        int i;
        System.out.println("Enter the elements of the array");
        for(i=0;i<cap;i++)
        A[i]=in.nextInt();
    }
    int Duplicatechecking(int num)
    {
        int i;
        for(i=0;i<p;i++)
        {
            if(res[0][i]==num)
            return 1;
        }
        return 0;
    }
    void calFreq()    // calculating number of duplicate elements
    {
        int i,j,freq=1;
        for(i=0;i<cap;i++)
        {
            if(Duplicatechecking(A[i])==0)
            {
                res[0][p]=A[i];
                for(j=i+1;j<cap;j++)
                {
                    if(A[j]==A[i])
                    freq++;
                }
                res[1][p]=freq;
                freq=1;
                p++;
            }
        }
    }
    void Freqsort()     // sorting the elements according to their frequencies (highest frequency element comes first)
    {
        int i,j,t;
        for(i=0;i<p-1;i++)
        {
            for(j=i+1;j<p;j++)
            {
                if((res[1][i]<res[1][j])||(res[1][i]==res[1][j]&&res[0][i]>res[0][j]))
                {
                    t=res[1][i];res[1][i]=res[1][j];res[1][j]=t;
                    t=res[0][i];res[0][i]=res[0][j];res[0][j]=t;
                }
            }
        }
    }
    void modifyArray()
    {
        int i,j,k=0;
        for(i=0;i<p;i++)
        {
            for(j=1;j<=res[1][i];j++)
            A[k++]=res[0][i];
        }
    }
    void display()      // printing the elements according to their frequencies
    {
        int i;
        System.out.println("Array after sorting the elements according to their frequencies :");
        for(i=0;i<cap;i++)
        System.out.print(A[i]+ " ");
    }
    public static void main(String arg[])    // main method
    {
        Prog5 ob=new Prog5();
        ob.inputArraySize();
        ob.Arrayinput();
        ob.calFreq();
        ob.Freqsort();
        ob.modifyArray();
        ob.display();
    }  // end of main method
}  // end of class 
/*
 OUTPUT
Enter the size of the array
5
Enter the elements of the array
5 5 4 6 4
Array after sorting the elements according to their frequencies :
4 4 5 5 6  

*/