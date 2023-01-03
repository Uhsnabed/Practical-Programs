/*
 14) A super class record has been defined to store the names and ranks of 10 students. Define a sub
class Rank to find the highest rank along with the name. The details of two classes are given below:
Class name Record
Data members
name[] To store the names of the students
mk[] Stores the rank of the students
Member
functions/methods
Record() Constructor to initialize the dat members
void readvalues() To stores names and ranks of 10 studenrs
void display() Displays the names and the corresponding ranks
Class name Rank
index integer to store the index of the topmost rank
Member methods
Rank() Constructor to invoke base class constructor and
initialize index=0
void highest() Find the index/location/subscriot of the topmost rank
void display() Displays the names and ranks along with the names
having the topmost rank.
Using the concept of inheritance specify both the calsses and using void main() execute the
functions mentioned.
 */
import java.util.*;
public class Record     // base class
{ static String name[];      // data members
  static int mk[];
  Record()       // non-parameterized constructor
  { name = new String[10];
    mk = new int[10];
  }
  static void readvalues()      
  {
      Scanner sc = new Scanner(System.in);        // taking input from user rank and student name
      for(int i =0;i<10;i++)
      {
          System.out.println(" ENTER STUDENT NAME "+ (i+1));
          name[i] = sc.next();
          System.out.println(" ENTER RANK ");
          mk[i] = sc.nextInt();
        }
    }
   void display()      // displaying name and rank
   {  
       for(int i =0;i<10;i++)
      {      
          
          System.out.println("NAME  "+name[i] + "  RANK:" + mk[i]);
          
        }
    }
}
    
          

    