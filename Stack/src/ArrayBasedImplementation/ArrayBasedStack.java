package ArrayBasedImplementation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayBasedStack {
    int[] s;
    int top;
    int capacity;
    public ArrayBasedStack(int capacity){
        s=new int[capacity];
        top=-1;
        this.capacity=capacity;
    }
    public void push(int data){

        if(top==s.length-1){
            int[] temp=new int[2*capacity];
            for(int i=0;i<s.length-1;i++){
                temp[i]=s[i];

            }
            capacity=capacity*2;
            s=temp;
        }

        top++;
        s[top]=data;
    }
    public int pop(){
        if(top==-1){
            System.out.println("stack is empyty");
        }
        return s[top--];
    }
    public Boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public int peek(){
        if(top==-1){
            System.out.println("stack is empyty");
        }
        return s[top];
    }

    public int size(){
        return s.length;
    }

}