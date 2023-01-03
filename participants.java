/*
 15} Class name : participants
Data members :
String pnam[], int no

participants(int num)                  : to initialize no with num and accordingly initialize pnam[]
void display()                         : to display the contents of the array pnam[]
participants common(participants obr)  : to find out the common names between the array of obr and the array of current object.
*/
import java.util.*;
class participants
{
    String pnam[];      //data members
    int no; 
    participants(int num)       //parameterized constructor
    {
        no=num;
        pnam=new String[no];
    }

    public void display()   //display method
    {
        for(int i=0;i<no;i++)
System.out.println(pnam[i]);
    }

    participants common(participants obr)
    {
        participants com=new participants(this.no);   //finding common element
        int count=0;
        for(int i=0;i<this.no;i++)
        {
            for(int j=0;j<obr.no;j++)
            {
                if(this.pnam[i].equalsIgnoreCase(obr.pnam[j]))
                {
                    int check=0;
                    for(int k=0;k<count;k++)//checking if there is duplicate elements common array
                    {
                        if(this.pnam[i].equalsIgnoreCase(com.pnam[k]))
                        check=1;
                    }
                    if(check==1)
                    break;
                    else
                    {
                        com.pnam[count]=this.pnam[i];
                        count++;
                        break;
                    }
                }
            }
        }
        com.no=count;
        return com;
    }

    public static void main()    //main method
    {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements in array 1 :");
        int n1=sc.nextInt();   //taking input length of first array
      participants ob1=new participants(n1);
        for(int i=0;i<n1;i++)    //taking input elements of first array
        {
System.out.println("Element "+(i+1)+" :");
            ob1.pnam[i]=sc.next();
        }

System.out.println("Enter number of elements in array 2 :");
        int n2=sc.nextInt();    //taking input length of second array
        participants ob2=new participants(n2);
        for(int i=0;i<n2;i++)     //taking input elements of second array
        {
System.out.println("Element "+(i+1)+" :");
            ob2.pnam[i]=sc.next();
        }

System.out.println("First array:"); //printing first array elements
        ob1.display();  //calling function

System.out.println("Second array:");   //printing second array elements
        ob2.display();   //calling function 

       participants res=ob1.common(ob2);
System.out.println("Common Elements:");    //printing common elements
res.display();    //calling function
    }   //end of main method
}   //end of class
/*
 Enter number of elements in array 1 :
3
Element 1 :
2
Element 2 :
4
Element 3 :
6
Enter number of elements in array 2 :
3
Element 1 :
1
Element 2 :
3
Element 3 :
6
First array:
2
4
6
Second array:
1
3
6
Common Elements:
6
*/