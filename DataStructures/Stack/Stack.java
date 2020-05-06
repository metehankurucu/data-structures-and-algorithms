// Stack implementation with linked list

class StackNode {
    StackNode next;
    int data;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }

}

public class Stack {
    StackNode head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    // Push item to stack
    public void push(int data) {
        // Stack is empty
        StackNode newNode = new StackNode(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            StackNode temp = this.head;
            newNode.next = temp;
            this.head = newNode;
        }
    }

    // Pop item from stack (Delete and get first item)
    public StackNode pop() {
        // Stack is empty
        if (this.head == null) {
            return null;
        } else {
            StackNode temp = this.head;
            this.head = this.head.next;
            return temp;
        }
    }

    // Get first item in the stack without removing
    public StackNode peek() {
        // Stack is empty
        if (this.head == null) {
            return null;
        } else {
            StackNode temp = this.head;
            return temp;
        }
    }

    void print() {
        if (!isEmpty()) {
            StackNode current = head;
            while (current != null) {
                System.out.println("|" + current.data + "|");
                current = current.next;
            }
        } else
            System.out.println("Stack is empty");
    }
}