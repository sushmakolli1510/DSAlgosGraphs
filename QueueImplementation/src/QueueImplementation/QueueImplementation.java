package QueueImplementation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QueueImplementation {
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.insert(5);
        q.insert(9);
        q.insert(10);
        q.insert(11);
        System.out.print(q.remove());
        q.display();
        System.out.print(q.peek());

        }
    }
