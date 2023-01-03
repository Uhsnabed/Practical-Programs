/*
 15) A class Olympic-2021 is defined with following data members. Player array contains at least 5
players’ name and other arrays are having his/her corresponding information in the same sequence.
info_Olympic is n inherited class from Olympic _2021
Class name Olympic_2021
Data member
String player[] Array Contains the name of the players
participated in individual item in 2021 olympic
String item[] Array contains the item in which the players
participated
String state[] Resident state of the players
int age[] Age of the players
String info[] His /her performance in last 3 years.
Meber function
void assign() Assignment of specific information of 5 players’
in 5 different arrays mainintaing the sequence.
void display(String reqdname) Display the information of the player whose
name is accepted in reqdname
Class info_olympic
Data member
String askname String to store the required player’s name
Type_of_medal String to store the type of medal
void accept() To accept the required player’s name and
Type_of_medal
void display(() Display all formation regaring askname accesing
the base class and also display Type_of_medal
Define all the functions mentioned above along with void main() to execute the above functions.
 */
import java.util.*;
    class Olympic_2021      // base class
{
    static String player[],item[],state[];       // data members
    static String info[];
    static int age[];
    static void assign()          // method to declare the arrays and taking input array elements
    {   Scanner sc = new Scanner(System.in);
        player = new String[5];
        item = new String[5];
        state = new String[5];
        age = new int[5];
        info = new String[5]; 
        for(int i = 0;i<5;i++)            // taking input array elements
        {   System.out.println(" FOR PLAYER " +(i+1));
            System.out.println();
            System.out.println(" ENTER PLAYER NAME PARTICIPATED IN INDIVIDUAL EVENT IN 2021 TOKYO OLYMPICS ");
            player[i] = sc.nextLine();
             
            System.out.println(" ENTER THE EVENT IN WHICH THE PLAYER PARTICIPATED ");
            item[i] = sc.nextLine();
           
           System.out.println(" ENTER AGE OF THE PLAYER ");
            age[i] = Integer.parseInt(sc.nextLine());
            System.out.println(" ENTER RESIDENT STATE OF THE PLAYER ");
            state[i] = sc.nextLine(); 
            
            System.out.print(" ENTER HIS/HER PERFORMANCE IN LAST 3 YEARS ");
            info[i] = sc.nextLine();
           
            System.out.println();
        }
    }
    void display(String reqdname)       // method to display the player details
    {  int f=1;
        for(int i = 0;i<5;i++)      // printing the details of the player
        {
            if(player[i].equalsIgnoreCase(reqdname))
            {  System.out.println(" PLAYER NAME : " + player[i]);
               System.out.println(" EVENT PARTICIPATED : "+ item[i]);
               System.out.println(" RESIDENT STATE : "+ state[i]);
               System.out.println(" AGE OF THE PLAYER : "+ age[i]);
               System.out.println(" PERFORMANCE IN LAST 3 YEARS : "+ info[i]);
               f=0;
            }
             
            
        }
            if(f!=0)                          
            System.out.println(" PLAYER NAME NOT FOUND IN THE LIST ");  // if no player name is matched with the names taken as input
        
}
}// end of class
    
             