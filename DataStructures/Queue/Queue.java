//Queue implementation using Linked list

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }

    //Add item to queue 
    public void enqueue(int data){
        Node newNode = new Node(data);

        //If queue is empty
        if (this.rear == null) { 
            this.front = newNode;
            this.rear = newNode; 
            return; 
        } 
        //Change last node next to newNode
        this.rear.next = newNode; 
        //Change rear to newNode
        this.rear = newNode; 
    }

    //Remove first item of queue 
    public Node dequeue(){
        if(this.front != null){
            Node node = this.front;

            this.front = this.front.next;

            if(this.front == null)
                this.rear = null;
            
            return node;
        }
        return null;
    }

    //Get first item of queue without remove
    public Node peek(){
        return this.front;
    }

    public boolean isEmpty(){
        return front == null && rear == null;
    }

    void print(){
        if(!isEmpty()){
            Node current = front;
            while(current != null){
                System.out.print(current.data + " <-- ");
                current = current.next;
            }
            System.out.println();
        }
        else
            System.out.println("Queue is empty");
    }

}