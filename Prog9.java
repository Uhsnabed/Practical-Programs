/*
  9) We'll say that a "triple" in a string is a char appearing three times in a row. Return 
  the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
Solve the problem with recursive way and non recursive way.
*/
import java.util.*;
class Prog9
{
    static Scanner in=new Scanner(System.in);
    static String s;
    Prog9()    // non- parameterized constructor
    {
        s="";
    }
    void inputstring()  // taking input from user
    {
        System.out.println("Enter a string");
        s=in.nextLine();
        s=s.toLowerCase();
    }
    int countTripleRecursion(String str)
    {
        if(str.length()<3)
        return 0;
        else
        {
            if(str.charAt(0)==str.charAt(1)&&str.charAt(0)==str.charAt(2))
            return(1+countTripleRecursion(str.substring(1)));
            else
            return(countTripleRecursion(str.substring(1)));
        }
    }
    int countTripleNonRecursion(String str)
    {
        int count=0;
        while(str.length()>=3)
        {
            if(str.charAt(0)==str.charAt(1)&&str.charAt(0)==str.charAt(2))
            count++;         // counting number of triples
            str=str.substring(1);
        }
        return count;
    }
    void checking()     // printing
    {
        System.out.println("Number of triples(with recursion) = "+countTripleRecursion(s));
        System.out.println("Number of triples(without recursion) = "+countTripleNonRecursion(s));
    }
    public static void main(String arg[])
    {
       Prog9 ob=new Prog9();
        ob.inputstring();
        ob.checking();
    }  // end of main function
}   // end of class
/*
 OUTPUT 1
 Enter a string
xxxabyyyycd
Number of triples(with recursion) = 3
Number of triples(without recursion) = 3
 OUTPUT 2
Enter a string
a
Number of triples(with recursion) = 0
Number of triples(without recursion) = 0
 
*/