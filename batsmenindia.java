/*
12} Create a data file having name of the Indian batsmen, runs scored in test matches, in one day match. Access the data file 
and print list of the batsmen in descending order of their runs in test matches.

Also print the names of the batsmen whose runs in one day match is more than 250.
*/
import java.io.*;
public class batsmenindia
{
    String na[];int n,t[],od[];       //data members
    public void create() throws IOException
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name;int test,odi;
FileOutputStream std=new FileOutputStream("runs.dat");
DataOutputStream mat=new DataOutputStream(std);       
System.out.println("Enter number of batsmen :");     //taking input from user
 n=Integer.parseInt(br.readLine());
System.out.println("Enter names, runs scored in test matches and runs scored in one day matches :");    //taking input from user
for(int i=1;i<=n;i++)
        {
System.out.println("Batsman "+i+" :");
System.out.println("Name :");
            name=br.readLine();
System.out.println("Runs scored in test matches :");
            test=Integer.parseInt(br.readLine());
System.out.println("Runs scored in ODI matches :");
odi=Integer.parseInt(br.readLine());
System.out.println();
mat.writeUTF(name);      //writing 
mat.writeInt(test);
mat.writeInt(odi);
        }
System.out.println("File Created");      //file created
std.close();
mat.close();
    }

    public void read() throws IOException
    {
FileInputStream std=new FileInputStream("runs.dat");
DataInputStream mat=new DataInputStream(std);
boolean eof=false;
na=new String[n];
        t=new int[n];
        od=new int[n];
        int i=0;
        while(!eof)                 
        {
            try
            {
                String name="";int test=0,odi=0;
                na[i]=mat.readUTF();       //reading
                t[i]=mat.readInt();
                od[i]=mat.readInt();
                i++;
            }
catch(EOFException e)
            {
                  System.out.println();
                  eof=true;
            }
        }
std.close();
mat.close();
    }

    public void sort()      //method to sort
    {
for(int i=0;i<n-1;i++)    //sorting starts
        {
for(int j=0;j<n-i-1;j++)
            {
                if(t[j]<t[j+1])  //sorting runs
                {
                    int t1=t[j];
                    t[j]=t[j+1];
                    t[j+1]=t1;

                    String t2=na[j];     //sorting names
                   na[j]=na[j+1];
                   na[j+1]=t2;
                   int t3=od[j];
                    od[j]=od[j+1];
                    od[j+1]=t3;
                }
            }
        }
    }

    public void display()
    {
        int c=0;
for(int i=0;i<n;i++)  //printing starts
        {
System.out.println("Name : "+na[i]);
System.out.println("Runs scored in test matches : "+t[i]);
System.out.println("Runs scored in ODI matches : "+od[i]);
System.out.println();
            if(od[i]>250)   //checking batsmen having odi runs>250
                 c++;
        }

        if(c>0)
        {
System.out.println("List of batsmen who scored runs greater than 250 in ODI matches :");
for(int i=0;i<n;i++)
            {
                if(od[i]>250)
System.out.println(na[i]);
            }
        }
        else
System.out.println("No batsman scored runs greater than 250 in ODI matches");
    }

    public void main() throws IOException      //main function
    {
batsmenindia ob=new batsmenindia();    //creating object
ob.create();
ob.read();        //calling functions
ob.sort();
ob.display();
    }
}
/*
 Output:
 Enter number of batsmen :
2
Enter names, runs scored in test matches and runs scored in one day matches :
Batsman 1 :
Name :
Debanshu Sarkar
Runs scored in test matches :
345
Runs scored in ODI matches :
200

Batsman 2 :
Name :
Virat Kohli
Runs scored in test matches :
456
Runs scored in ODI matches :
256

File Created

Name : Virat Kohli
Runs scored in test matches : 456
Runs scored in ODI matches : 256

Name : Debanshu Sarkar
Runs scored in test matches : 345
Runs scored in ODI matches : 200

List of batsmen who scored runs greater than 250 in ODI matches :
Virat Kohli

 */
