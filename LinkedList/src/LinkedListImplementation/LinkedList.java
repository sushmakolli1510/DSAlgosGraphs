package LinkedListImplementation;
import java.lang.*;


public class LinkedList {
    private Node head;
    private int size;
    public LinkedList(){
        this.size = 0;
    }
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;

        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
        public void inserFirst(int val){
            Node node=new Node(val);
            node.next=head;
            head=node;
            if(head==null){
                head=node;
            }
            size++;
        }
        public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
            System.out.println("END");

        }
        public void insertEnd(int val){
            if(head==null){
                inserFirst(val);
                return;
            }
        Node node=new Node(val);
        Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.next=null;
            size++;

        }
        public int deleteFirst(){
        if(head==null){
            System.out.print("linkedlist is empty");
        }
        int val=head.val;
        head=head.next;
        size--;
        return val;
        }
        public int deleteEnd(){
            if(size<=1){
                deleteFirst();
            }
Node n=get(size-2);
            Node last=get(size-1);
            int val=last.val;
            //last=n;
          n.next=null;
return val;
        }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.inserFirst(4);
        ll.inserFirst(5);
        ll.insertEnd(6);
        ll.deleteFirst();
        ll.deleteEnd();
        ll.deleteEnd();
ll.display();
    }
    }

