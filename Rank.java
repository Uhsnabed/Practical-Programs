//14)
class Rank extends Record    // sub class extending parent class
{
    static int index;     // data member
    Rank( )         // non_parameterized constructor
     {
    super();
    index = 0;
}
 void highest()        // method to calculate index of students getting tomost rank
 {   
    
    int  maxRank = mk[0];
     for(int i = 0;i<10;i++)
     {
         if(mk[i]<maxRank)
         { index = i;
            }
        }
    }
    void display()
    { super.display();     // calling the display function of base class
      System.out.println();
        System.out.println("NAME/S WITH TOPMOST RANK");
       int  maxRank1 = mk[0];
       for(int i = 0;i<10;i++)      // storing the topmost rank
     {
         if(mk[i]<maxRank1)
         {  maxRank1 = mk[i];
            }
        }
      for(int i = 0;i<10;i++)        // printing names of students who got the topmost rank
       { if(mk[i]==maxRank1)
           { System.out.println(name[i]);
            }  
        
    }  
}
    public static void main()    // main method
    {
        Rank ob = new Rank();    // creating object of the class
        ob.readvalues();    // calling base class function
        ob.highest();     // calling sub class functions
        ob.display();
    }
}  // end of class
/*
 OUTPUT
 
  ENTER STUDENT NAME 1
Debanshu
 ENTER RANK 
5
 ENTER STUDENT NAME 2
Virat
 ENTER RANK 
3
 ENTER STUDENT NAME 3
Arko
 ENTER RANK 
2
 ENTER STUDENT NAME 4
Parthiv
 ENTER RANK 
6
 ENTER STUDENT NAME 5
Rohit
 ENTER RANK 
10
 ENTER STUDENT NAME 6
Pandya
 ENTER RANK 
2
 ENTER STUDENT NAME 7
Rishi
 ENTER RANK 
7
 ENTER STUDENT NAME 8
Raj
 ENTER RANK 
2
 ENTER STUDENT NAME 9
Pujara
 ENTER RANK 
4
 ENTER STUDENT NAME 10
Ram
 ENTER RANK 
2
NAME  Debanshu  RANK:5
NAME  Virat  RANK:3
NAME  Arko  RANK:2
NAME  Parthiv  RANK:6
NAME  Rohit  RANK:10
NAME  Pandya  RANK:2
NAME  Rishi  RANK:7
NAME  Raj  RANK:2
NAME  Pujara  RANK:4
NAME  Ram  RANK:2

NAME/S WITH TOPMOST RANK
Arko
Pandya
Raj
Ram

*/
     
     