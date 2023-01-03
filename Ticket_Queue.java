// 12)
class Ticket_Queue
{
    int Cons_code[],Max_Size,front,rear; //global variables
    Ticket_Queue(int cap)
    {
        Cons_code=new int[cap];
        Max_Size=cap;
        front=0;
        rear=-1;
    }
    
    //to check whether the queue is empty or not
    boolean checkQueueIfEmpty()
    {
        return(rear<front);
    }
    
    //to check whether the queue is full or not
    boolean checkQueueIfFull()
    {
        return(rear>=(Max_Size-1));
    }
    
    //to push viewer codes into the queue
    void pushViewer(int viewer_code)
    {
        if(checkQueueIfFull())
        System.out.println("Queue is full");
        else
        Cons_code[++rear]=viewer_code;
    }
    
    //to pop viewers from the front
    int popViewer()
    {
        if(checkQueueIfEmpty())
        {
            System.out.println("Queue is empty");
            return 9999;
        }
        else
        return(Cons_code[front++]);
    }
}