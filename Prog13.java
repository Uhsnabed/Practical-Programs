/*
 13)  WAP to input two arrays and print the resultant array filling it with alternate elements from the two arrays taken input.
  Eg- INPUT
       Enter size of array 1
6
Enter size of array 2
4
Enter elements for Array 1 
Enter element 1
1
Enter element 2
2
Enter element 3
3
Enter element 4
4
Enter element 5
5
Enter element 6
6
Enter elements for Array 2 
Enter element 1
20
Enter element 2
30
Enter element 3
40
Enter element 4
50
   
  OUTPUT: 
    FINAL ARRAY 
1
20
2
30
3
40
4
50
5
6
*/

import java.util.*;
class Prog13
{ int a[]; int b[] ; int c[] ;     // data members
   int m, n ; 
    void inputarray()      // method to input array elements of the 2 arrays
   {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter size of array 1");    // taking input size of array 1
        m = sc.nextInt();
       System.out.println("Enter size of array 2");     // taking input size of array 2 
        n = sc.nextInt();
       a = new int[m];
       b = new int[n];
       c = new int[m+n];
       System.out.println("Enter elements for Array 1 ");     // taking input array elements
       for(int i =0;i<m;i++)
       {  System.out.println("Enter element "+ (i+1));
           a[i]= sc.nextInt();
       }
       System.out.println("Enter elements for Array 2 ");       // taking input array elements 
       for(int j =0;j<n;j++)
       {  System.out.println("Enter element "+ (j+1));
           b[j]= sc.nextInt();
       }
    }
   void add()   // method to fill resultant array with alternate elements from the two arrays taken input  
   {    int d = Math.min(m,n);
        int d1 = d + d-1;
        int l1=m ; int l2 = n;
        int k1 = 0, k2=0;
       for(int i = 0;i<(m+n);i++)    // for loop to store alternate elements
       {  if(i<=d1)
           {
               if(i%2==0)       
               {c[i] = a[m-l1];
                l1--;
            }
            else
            { c[i] = b[n-l2];
                l2--;
            }
        }
        else
        {  
            if(n>m)
            {
                c[i] = b[m+k1];
                k1++;
            }
          else if(m>n)
          { c[i] = a[n+k2];
              k2++;
            }
        }
    }
}
      void print()    
      {   System.out.println(" FINAL ARRAY ");       // printing the final array
          for(int i = 0 ; i<(m+n);i++)
          { System.out.println(c[i]);
            }
        }
    public static void main()
    {
        Prog13 ob = new Prog13();    // creating object of the class
        ob.inputarray();    // calling the above functions
        ob.add();
        ob.print();
    }
}
/* 
 OUPUT 1:
Enter size of array 1
6
Enter size of array 2
4
Enter elements for Array 1 
Enter element 1
1
Enter element 2
2
Enter element 3
3
Enter element 4
4
Enter element 5
5
Enter element 6
6
Enter elements for Array 2 
Enter element 1
20
Enter element 2
30
Enter element 3
40
Enter element 4
50
 FINAL ARRAY 
1
20
2
30
3
40
4
50
5
6

OUTPUT 2 :    
 
Enter size of array 1
4
Enter size of array 2
6
Enter elements for Array 1 
Enter element 1
1
Enter element 2
2
Enter element 3
3
Enter element 4
4
Enter elements for Array 2 
Enter element 1
20
Enter element 2
30
Enter element 3
40
Enter element 4
50
Enter element 5
60
Enter element 6
70
 FINAL ARRAY 
1
20
2
30
3
40
4
50
60
70    
              
*/            
           
           
       
        
           
      
    