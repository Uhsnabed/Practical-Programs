// 15)
import java.util.*;
class info_olympic extends Olympic_2021           //  sub class extending parent class
{
    String askname,Type_of_medal;     // data members
    void accept()
    {
        Scanner sc  = new Scanner(System.in);      
        System.out.println(" ENTER PLAYER NAME TO SEARCH ");  // taking input a player name to print his information regarding 2021 Olympics
        askname = sc.nextLine();
        System.out.println(" ENTER THE TYPE OF MEDAL RECEIVED AT OLYMPICS 2020 ");
        Type_of_medal = sc.next();        // taking input the medal received
    }
    void display()     
    {
        super.display(askname);     // calling display function of parent class by passing askname to print the player details
        System.out.println(" TYPE OF MEDAL : "+ Type_of_medal);     //  printing the medal recieved 
    }
    public static void main()    
    {
        info_olympic ob = new info_olympic ();      // creating object of the class
        ob.assign();     // calling base class function
        ob.accept();      // calling sub class functions
        ob.display();
    }
}  // end of class
/*
 OUTPUT
  FOR PLAYER 1

 ENTER PLAYER NAME PARTICIPATED IN INDIVIDUAL EVENT IN 2021 TOKYO OLYMPICS 
PV SINDU
 ENTER THE EVENT IN WHICH THE PLAYER PARTICIPATED 
BADMINTON
 ENTER AGE OF THE PLAYER 
26
 ENTER RESIDENT STATE OF THE PLAYER 
TELENGANA
 ENTER HIS/HER PERFORMANCE IN LAST 3 YEARS GOLD AT 2019 WORLD CHAMPIONSIP WITH A CAREER BEST WORLD RANKING OF 2

 FOR PLAYER 2

 ENTER PLAYER NAME PARTICIPATED IN INDIVIDUAL EVENT IN 2021 TOKYO OLYMPICS 
NEERAJ CHOPRA
 ENTER THE EVENT IN WHICH THE PLAYER PARTICIPATED 
TRACK AND FIELD ( JAVELIN )
 ENTER AGE OF THE PLAYER 
23
 ENTER RESIDENT STATE OF THE PLAYER 
HARYANA
 ENTER HIS/HER PERFORMANCE IN LAST 3 YEARS WON GOLD AT ASIAN GAMES 2018 AND COMMONWEALTH GAMES 2018.

 FOR PLAYER 3

 ENTER PLAYER NAME PARTICIPATED IN INDIVIDUAL EVENT IN 2021 TOKYO OLYMPICS 
BAJRANG PUNIA
 ENTER THE EVENT IN WHICH THE PLAYER PARTICIPATED 
WRESTLING(65-KG CATEGORY)
 ENTER AGE OF THE PLAYER 
27
 ENTER RESIDENT STATE OF THE PLAYER 
HARYANA
 ENTER HIS/HER PERFORMANCE IN LAST 3 YEARS WON SILVER AT WORLD CHAMPIONSHIPS 2018 AND BRONZE AT WORLD CHAMPIONSHIP 2019.
 FOR PLAYER 4

 ENTER PLAYER NAME PARTICIPATED IN INDIVIDUAL EVENT IN 2021 TOKYO OLYMPICS 
RAVI KUMAR DAHIYA
 ENTER THE EVENT IN WHICH THE PLAYER PARTICIPATED 
WRESTLING(57- KG CATEGORY)
 ENTER AGE OF THE PLAYER 
23
 ENTER RESIDENT STATE OF THE PLAYER 
HARYANA
 ENTER HIS/HER PERFORMANCE IN LAST 3 YEARS WON GOLD AT ASIAN CHAMPIONSHIP 2020 AND BRONZE AT WORLD CHAMPIONSHIP 2019

 FOR PLAYER 5

 ENTER PLAYER NAME PARTICIPATED IN INDIVIDUAL EVENT IN 2021 TOKYO OLYMPICS 
CHANU SAIKHOM MIRABAI
 ENTER THE EVENT IN WHICH THE PLAYER PARTICIPATED 
WEIGHTLIFTING(49-KG CATEGORY)
 ENTER AGE OF THE PLAYER 
27
 ENTER RESIDENT STATE OF THE PLAYER 
MANIPUR
 ENTER HIS/HER PERFORMANCE IN LAST 3 YEARS WON GOLD AT COMMONWEALTH GAMES 2018 AND BRONZE AT ASIAN CHAMPIONSHIPS 2020

 ENTER PLAYER NAME TO SEARCH 
PV SINDU
 ENTER THE TYPE OF MEDAL RECEIVED AT OLYMPICS 2020
BRONZE
 PLAYER NAME : PV SINDU
 EVENT PARTICIPATED : BADMINTON
 RESIDENT STATE : TELENGANA
 AGE OF THE PLAYER : 26
 PERFORMANCE IN LAST 3 YEARS : GOLD AT 2019 WORLD CHAMPIONSIP WITH A CAREER BEST WORLD RANKING OF 2
 TYPE OF MEDAL WON AT OLYMPICS 2020 : BRONZE
 
 */    