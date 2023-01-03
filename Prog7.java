/*
  7)Find the elements which are occurring more than once .Remove the Ist occurrence of each item.
Input: No.of elements in the array:-7
Enter the elements:5 2 3 4 5 2 6
Output Initial content of the array 5 2 3 4 5 2 6
Final content of the array:-  3 4 5 2 6
*/
import java.util.*;
class Prog7
{
    static Scanner sc=new Scanner(System.in);
    static int cap,ar[],remo[],count; // data members
    Prog7() //default constructor
    {
        cap=0;
        count=0;
    }
    void inputArraySize() //to input the capacity of the array
    {
        System.out.println("Enter size of the array");
        cap=sc.nextInt();
        ar=new int[cap];
        remo=new int[cap];
    }
    void Arrayinput() //to input the array elements
    {
        int i;
        System.out.println("Enter the elements of the array");
        for(i=0;i<cap;i++)
        ar[i]=sc.nextInt();
        System.out.println("Initial content of the array :");
        display();
    }
    
    //to check whether an element has already been encountered or not
    int checkRemoved(int num)
    {
        int i;
        for(i=0;i<count;i++)
        {
            if(remo[i]==num)
            return 1;
        }
        return 0;
    }
    
    //to rearrange ar[] after removing an element
    void rearranging(int x)
    {
        int i,t;
        for(i=x;i<(cap-1);i++)
        {
            t=ar[i];ar[i]=ar[i+1];ar[i+1]=t;
        }
    }
    
    //to remove the first occurrence of elements appearing more than once
    void removed()
    {
        int i,j,f=0;
        for(i=0;i<cap;i++)
        {
            if(checkRemoved(ar[i])==0)
            {
                for(j=i+1;j<cap;j++)
                {
                    if(ar[j]==ar[i])
                    {
                        f=1;
                        break;
                    }
                }
                if(f==1)
                {
                    remo[count++]=ar[i];
                    rearranging(i);
                    i--;
                    cap--;
                    f=0;
                }
            }
        }
        System.out.println("Final content of the array :");
        display();
    }
    void display() //to display array ar[]
    {
        int i;
        for(i=0;i<cap;i++)
        System.out.print(ar[i]+"\t");
        System.out.println();
    }
    public static void main() //main method
    {
        Prog7 ob = new Prog7(); //object creation
        ob.inputArraySize();
        ob.Arrayinput();
        ob.removed();
    }   // end of main function
}  // end of class
/*
 OUTPUT
Enter size of the array
7
Enter the elements of the array
5 2 3 4 5 2 6
Initial content of the array :
5    2    3    4    5    2    6    
Final content of the array :
3    4    5    2    6     
 */