import java.util.*;

interface Stack {
    void push(String item);
    String pop();
    String peek();
    boolean isEmpty(); // should return boolean, not String
}

class ArrayStack implements Stack {
    private String[] elements = new String[10];
    private int top = -1;

    @Override
    public void push(String item) {
        if (top == elements.length - 1) {
            System.out.println("Stack is full! Cannot push.");
            return;
        }
        elements[++top] = item;
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to undo.");
            return null;
        }
        return elements[top--];
    }

    @Override
    public String peek() {
        if (isEmpty()) return null;
        return elements[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}

public class TestEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStack undostack = new ArrayStack();

        while (true) {
            System.out.println("\n__Test Editor__");
            System.out.println("1. Type text");
            System.out.println("2. Undo");
            System.out.println("3. View current text");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter text:");
                    String text = sc.nextLine();  // Corrected to nextLine()
                    undostack.push(text);
                    break;
                case 2:
                    String undo = undostack.pop();
                    if (undo != null) {
                        System.out.println("Undo: " + undo);
                    }
                    break;
                case 3:
                    String current = undostack.peek();
                    System.out.println("Current text: " + (current != null ? current : "No text"));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

