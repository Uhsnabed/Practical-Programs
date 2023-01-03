// 12
class Theatre_Stack
{
    int viewer_code[],Max_Size,first,last; //global variables
    Theatre_Stack(int cap)
    {
        Max_Size=cap;
        viewer_code=new int[Max_Size];
        last=-1;
        first=0;
    }
    
    //to check whether any ticket has been sold or not
    boolean checkStackIfEmpty()
    {
        return(last<0);
    }
    
    //to check whether all seats have been taken
    boolean checkStackIfFull()
    {
        return(last>=(Max_Size-1));
    }
    
    //to push a viewer code into the stack
    void pushBuyTicket(int viewer_code)
    {
        if(checkStackIfFull())
        System.out.println("Stack Overflow");
        else
        this.viewer_code[++last]=viewer_code;
    }
    
    //to pop viewers from the last place
    void popViewer()
    {
        if(checkStackIfEmpty())
        System.out.println("Stack Underflow");
        else
        viewer_code[last--]=0;
    }
}