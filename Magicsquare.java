

/*  1) To generate a magic square
 Accept the order of the matrix as an odd integer.Write a program to print a magic matrix where the sum of row elements,sum of column elements and sum of diagonals will all be equal

 eg: if n=3 sum=15
 */
import java.util.*;
class Magicsquare
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);     //taking input from user``
        System.out.println("Enter odd order of the square matrix");
        System.out.println();
        int n=sc.nextInt();
        while(n%2==0)
        {
            System.out.println("ERROR!EVEN SIZE OF MATRIX FOUND");
            System.out.println();
            System.out.println("Enter odd no size of the matrix");
            n=sc.nextInt();
        }
        int i,j,k;
        int a[][]=new int[n][n];
        for(int i1=0;i1<n;i1++)   //initializing all elements of the matrix to 0
        {  
            for(int j1=0;j1<n;j1++)
            {
                a[i1][j1]=0;
            }
        }
        if(n%2!=0)    //storing numbers in the matrix
        {
            i=0;
            j=n/2;
            k=1;
            while(k<=n*n)
            {
                a[i][j]=k++;
                i--;
                j++;
                if(i<0 && j>n-1)
                {
                    i=i+2;
                    j--;
                }
                if(i<0)
                i=n-1;
                if(j>n-1)
                j=0;
                if(a[i][j]>0)
                {
                    i=i+2;
                    j--;
                }
            }
        }
         if(n%2!=0)
        {
         System.out.println();
         System.out.println();
         System.out.println("The Magic Matrix");
        } 
        for(int i2=0;i2<n;i2++)   //printing the matrix
        {
            for(int j2=0;j2<n;j2++)
            {
                System.out.print(a[i2][j2]+"\t");
            }
            System.out.println();
        }
    }
}
/*
 Enter odd order size of the matrix

4
ERROR!EVEN SIZE OF MATRIX FOUND

Enter odd no size of the matrix
6
ERROR!EVEN SIZE OF MATRIX FOUND

Enter odd no size of the matrix
7



The Magic Matrix
30	39	48	1	10	19	28	
38	47	7	9	18	27	29	
46	6	8	17	26	35	37	
5	14	16	25	34	36	45	
13	15	24	33	42	44	4	
21	23	32	41	43	3	12	
22	31	40	49	2	11	20	

*/

            
        
        