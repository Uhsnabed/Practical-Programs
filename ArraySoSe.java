/*
  3) Write a program to take n numbers in an array arr[] and sort them in ascending order using Bubble sort.Then ask the
user for a number and search it in the array using Binary Search algorithm.
Class Name:                                           ArraySoSe

Instance variables:            n- to take as input the number of array terms
                              arr[]- the array in which the input is taken and stored.
                              num- the number to be searched.

Instance methods:            void Bin_Search(Array SoSe x) - to search
                             void input()  - to input the arrray
                             void display()  - to display the array
                             
*/                             
import java.util.*;
class ArraySoSe
 {
     static int n,arr[],num;
    ArraySoSe()
     {
         arr=new int[n];
         n=0;
         num=0;
        }
        public void input()     //taking input from the user
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter no. of elements");
            n= sc.nextInt();
            arr=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter"+ "\t"+ "element" + "\t"+ (i+1));
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the number to be searched in the array:");
            num=sc.nextInt();
        }
        public void display()   //displaying the original array
        {
            System.out.println(" Original Array:");
            for(int i=0;i<n;i++)
            
            System.out.print(arr[i]+"\t");
            
        System.out.println();
            
        }
        public void Bubble_Sort(ArraySoSe x)     //sorting the array in ascending order using Bubble Sort
         {  int a[]=x.arr;
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-1-i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
               System.out.println("Sorted Array:");
            for(int i=0;i<n;i++)   //printing the sorted array
            System.out.print(a[i]+"\t");
            System.out.println();
              System.out.println();
            }
        public void Bin_Search(ArraySoSe x)   //searching the number in the array gven by the user using Binary Search
          {
            int a[]=x.arr;
            int l=0;
            int u=n;
            int c=0;
          
            while(l<=u)
            {
                int m=(l+u)/2;
                if(a[m]==num)
                { 
                    System.out.println("SUCCESSFUL SEARCH: NUMBER FOUND AT POSITION -->> "+(m+1));
                    c++;
                    break;
                }
                else 
                if (a[m]<num)
                l=m+1;
                else
                u=m-1;
            }
            if (c==0)
             
             System.out.println("NUMBER NOT FOUND");
            }
         public static void main()  //creating object of the class and calling other functions
        {
            ArraySoSe ob = new ArraySoSe();
            ob.input();
            ob.display();
            ob.Bubble_Sort(ob);
            ob.Bin_Search(ob);
        }
    }
/*
Enter no. of elements
6
Enter	element	1
4
Enter	element	2
8
Enter	element	3
2
Enter	element	4
5
Enter	element	5
6
Enter	element	6
1
Enter the number to be searched in the array:
2
 Original Array:
4	8	2	5	6	1	
Sorted Array:
1	2	4	5	6	8	

SUCCESSFUL SEARCH: NUMBER FOUND AT POSITION -->> 2
*/
            
            