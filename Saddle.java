/*
  14} Accept the order of the matrix from the user as M X N.Accept positive integers for filling the matrix.Then find out whether the matrix 
  is having any saddle point. A saddle point from any matrix is determined by finding smallest element in a row which should be the 
  greatest in its corresponding column.
 */
import java.util.*;
class Saddle
{
    public static void main()   //main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");     //taking input from user number of rows
        int M=sc.nextInt();
        System.out.println("Enter number of columns");     //taking input from user number of columns
        int N=sc.nextInt();
        int a[][] = new int[M][N];    //creating array
        System.out.println(" Enter positive integers in the array");
        for(int i=0;i<M;i++)    //taking input array elements from user
        {
            System.out.println("Enter element for row number"+ (i+1));
            for(int j=0;j<N;j++)
            {
              a[i][j]=sc.nextInt();
              while(a[i][j]<=0)        
                {System.out.println("Wrong Input.");
                 System.out.println("Enter element for row number"+ (i+1));
                 a[i][j]=sc.nextInt();
                }
             }
          }
          System.out.println("The original matrix: ");
          for(int i=0;i<M;i++)      //printing the original matrix
          {
              for(int j=0;j<N;j++)
              {
                  System.out.print(a[i][j]+"  ");
                }
              System.out.println();
            }
          Saddle(a);
         }
         static void Saddle(int[][] a)
          {   boolean SaddlePoint=false;
              for(int i=0;i<a.length;i++)
              {
                  int rowMin = a[i][0];
                  int colIndex = 0;
                   SaddlePoint = true;
                  for(int j = 1;j<a[i].length;j++)       //finding the smallest element in the ith row
                  {
                      if (a[i][j]< rowMin)
                      {
                          rowMin = a[i][j];
                          colIndex = j;
                        }
                    }
                    for(int j=0;j<a.length;j++)     //Checking rowMin is also the largest element in its column
                    {
                        if(a[j][colIndex] > rowMin)
                        {
                            SaddlePoint = false;
                            break;
                        }
                    }
                    if(SaddlePoint==true)
                    {
                        System.out.println("Saddle Point is: "+rowMin);   //printing the saddle point element
                        
                    }
                }
                if(SaddlePoint==false)
                  System.out.println("Saddle Point not found");     
                
            }  //end of main method
        }  //end of class
/*
Enter number of rows
3
Enter number of columns
3
 Enter positive integers in the array
Enter element for row number1
-4
Wrong Input.
Enter element for row number1
1
2
3
Enter element for row number2
-4
Wrong Input.
Enter element for row number2
4
-6
Wrong Input.
Enter element for row number2
5
6
Enter element for row number3
-3
Wrong Input.
Enter element for row number3
7
8
9
The original matrix: 
1  2  3  
4  5  6  
7  8  9  
Saddle Point is: 7
*/
             
              
              
    
          
        
    
        
                
         
            
        