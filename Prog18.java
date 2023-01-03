/* 18) WAP to take input an square matrix and perform the following tasks:
     i}  Print the original matrix
    ii}  Check whether the matrix is symmetric or not
   iii}  Check whether the matrix is skew symmetric or not
    iv}  Print the sum of the left and right digonal elements
 */  
import java.util.*;
class Prog18
{   static int A[][], M;   // data members
    public static void main()
    {  Scanner sc = new Scanner(System.in);
       System.out.println(" ENTER THE ORDER OF THE MATRIX ");
       M = sc.nextInt();    // taking input the order of the matrix
       if( M<=2 || M>=10)
        {System.out.println(" SIZE IS OUT OF RANGE");
        System.exit(0);   
    }
    Prog18 ob = new Prog18(M);    // creating object of the class
    ob.input();    // calling the required functions
    ob.display();
    ob.symmetric();
    ob.skewsymmetric();
    ob.sumleftdiagonal();
    ob.sumrightdiagonal();
    }
    Prog18(int n)
    { A = new int[n][n];   // declaring the array
    }
    void input()
    { Scanner sc = new Scanner(System.in);
      System.out.println(" ENTER ARRAY ELEMENTS");    // taking inut array elements
      for (int i = 0;i<M;i++)
      {    System.out.println(" ENTER ELEMENT FOR ROW "+(i+1));
          for(int j = 0;j<M;j++)
          {  A[i][j] = sc.nextInt();
            }
        }
      }
      void display()
      {System.out.println(" ORIGINAL ARRAY ");   // printing the original array
        for (int i = 0;i<M;i++)
        {  for(int j = 0;j<M;j++)
            {   System.out.print(A[i][j] + "  ");
            }
            System.out.println();
        }
          
      }
       void symmetric()
       {  int f=0;        
           for (int i = 0;i<M;i++)
            {  for(int j = 0;j<M;j++)
            { if(A[i][j] == A[j][i])
                f++;
            }
        }
        if(f== (M*M))     // checking the matrix is symmetric or not
        System.out.println(" THE GIVEN MATRIX IS SYMMETRIC ");
        else
         System.out.println(" THE GIVEN MATRIX IS NOT SYMMETRIC ");
        }
        void skewsymmetric()
        { int f1=0; 
            for (int i = 0;i<M;i++)
            {  for(int j = 0;j<M;j++)
                { if(A[i][j] == -A[j][i])
                   f1++;
            }
        } 
        if(f1== (M*M))     // checking the matrix is skew symmetric or not
        System.out.println(" THE GIVEN MATRIX IS SKEW SYMMETRIC ");
        else
         System.out.println(" THE GIVEN MATRIX IS NOT SKEW SYMMETRIC ");
        }
        void sumleftdiagonal()
        { int s1=0;
            for (int i = 0;i<M;i++)      // calculating the sum of left diagonal
            {  for(int j = 0;j<M;j++)
                { if(i==j)
                   s1 = s1+A[i][j];
                }
            }
          System.out.println(" SUM OF LEFT DIAGONAL: " + s1);
        }
        void sumrightdiagonal()
        { int s2=0;
            for (int i = 0;i<M;i++)     // calculating the sum of right diagonal
            {  for(int j = 0;j<M;j++)
                { if(i+j==(M-1))
                   s2 = s2 + A[i][j]; 
                }
            }
          System.out.println(" SUM OF RIGHT DIAGONAL: " + s2);
        }
    }    // end of class  
    /*
    OUTPUT
     ENTER THE ORDER OF THE MATRIX 
4
 ENTER ARRAY ELEMENTS
 ENTER ELEMENT FOR ROW 1
7
8
9
2
 ENTER ELEMENT FOR ROW 2
4
5
6
3
 ENTER ELEMENT FOR ROW 3
8
5
3
1
 ENTER ELEMENT FOR ROW 4
7
6
4
2
 ORIGINAL ARRAY 
7  8  9  2  
4  5  6  3  
8  5  3  1  
7  6  4  2  
 THE GIVEN MATRIX IS NOT SYMMETRIC 
 THE GIVEN MATRIX IS NOT SKEW SYMMETRIC 
 SUM OF LEFT DIAGONAL: 17
 SUM OF RIGHT DIAGONAL: 20

   */                 
        
     
        
    
    

