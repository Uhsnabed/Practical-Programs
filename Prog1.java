/* 
  1) Accept MX8 as dimensions of a 2dimensional array. Fill up the array with the binary
conversion of M no. Of decimal number .Print the column nos. Which are having maximum
number of 1’s in it.
If the converted binary number is not comprising of 8 bits eg for 8 it is 1000
fill it up with 00001000
*/
import java.util.*;
class Prog1
{
    int a[][],m;       // data members
    public String Bin(int no)
    {
        String num=""; 
        
        while(no>0)      // converting decimal to binary
        {
            int d=no%2;  
             
            num=Integer.toString(d) +num;  
            no=no/2; 
        }
        return num;        // returning the converted number
    }
    
    public void Value(String st,int j,int l)
    {
        if(l<8)
        {
            for(int i=1;i<=8-l;i++)
            st="0"+st;
        }
        
        for(int i=0;i<8;i++)
        {
            char ch=st.charAt(i);
            a[j][i]=ch-48;
        }
    }
    
    public void main()      // main function
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements :");
        m=sc.nextInt();
        a=new int[m][8];
        String s;int l;
        
        for(int i=0;i<m;i++)
        {
            System.out.println("Element "+(i+1)+" :");
            a[i][0]=sc.nextInt();
            s=Bin(a[i][0]);
            l=s.length();
            if(l>8)
            {
                System.out.println("Error! Binary equivalant more than 8 bits! Try again!");
                --i;
            }
            else
            Value(s,i,l);
        }
        
        System.out.println("\nConverted matrix :");      // printing the converted matrix
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<8;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }     // end of main function
}  // end of class
/*
 OUTPUT 
Enter number of elements :
4
Element 1 :
3
Element 2 :
4
Element 3 :
5
Element 4 :
7

Converted matrix :
0 0 0 0 0 0 1 1 
0 0 0 0 0 1 0 0 
0 0 0 0 0 1 0 1 
0 0 0 0 0 1 1 1 
 
*/

