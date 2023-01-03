/* 
  2)Write a program to declare a single dimensional array a[] and a square matrix b[][] of size N
where  and N>2 &N<10 .Allow the user to input positive integer only into the single
dimensional array. Perform the following tasks.
a.Sort the elements of the one diensional array in ascending order using any sorting technique   
display the sorted array.
b. Fill the array b[][] in the following format   if the array a[]={5,2,8,1} then after sorting it
becomes a[]={1,2,5,8}
Then the matrix b[][] will be filled as below:
1 2 5 8
1 2 5 1
1 2 1 2
1 1 2 5
*/
import java.util.*;
class Prog2
{
    int a[],b[][],n;     // data members
    public void inputuser()    // taking input
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 1D array :");
        n=sc.nextInt();
        
        if(n<3||n>9)
        {
            System.out.println("Error! Size out of range!");
            System.exit(0);
        }
        
        a=new int[n];
        b=new int[n][n];
        System.out.println("\nEnter "+n+" elements :");
        for(int i=0;i<n;i++)
        {
            System.out.println("Element "+(i+1)+" :");
            a[i]=sc.nextInt();
        }
        
        System.out.println("\nUnsorted array :");      // printing the unsorted array
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
    
    public void bblesort()      // sorting the array using bubble sort
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        
        System.out.println();
        System.out.println("Sorted array :");    // printing the sorted array
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
    
    public void transformation()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            b[i][j]=a[j];
            if(i>0)
            {
                for(int k=1;k<=i;k++)
                b[i][n-k]=a[i-k];
            }
        }
        
        System.out.println();       //       printing the 2-D array
        System.out.println("2D array :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(b[i][j]+" ");
            System.out.println();
        }
    }
    
    public void main()     // main method
    {
       Prog2 ob=new Prog2();
        ob.inputuser();
        ob.bblesort();
        ob.transformation();
    }    // end of main function
}   // end of class
/*
 OUTPUT
Unsorted array :
5 2 8 1 
Sorted array :
1 2 5 8 
2D array :
1 2 5 8 
1 2 5 1 
1 2 1 2 
1 1 2 5 
  
*/