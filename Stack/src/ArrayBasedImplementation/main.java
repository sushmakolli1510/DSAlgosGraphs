package ArrayBasedImplementation;

public class main {

    public static void main(String[] args) {
        ArrayBasedStack stack = new ArrayBasedStack(2);

        // Use push() to add elements into the Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());


    }
}
