package QueueImplementation;

public class Queue {
    int[] queue;
    int front;
    int rear;
    int Maxsize;
    int currSize;
    public Queue(int size){
        Maxsize=size;
        queue=new int[Maxsize];
        rear=-1;
        front=0;
    }

    public void insert(int data){
        if(rear==Maxsize-1){
            System.out.print("Queue is full");
        }
        rear++;
        queue[rear]=data;
        currSize++;
    }
    public int remove(){
        if(isEmpty()){
            System.out.print("Queue is Empty");
        }
        int result=queue[front];
        ++front;
        Maxsize--;
        return result;
    }

    public boolean isEmpty(){
        if(rear==-1){
            return true;
        }
        else
            return false;
    }
    public int peek(){
        return queue[front];
    }

    public void display(){
        for(int i=0;i<currSize;i++){
            System.out.print(queue[i]+" ");
        }
    }



}
