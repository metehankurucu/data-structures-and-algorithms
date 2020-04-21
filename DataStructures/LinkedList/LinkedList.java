
class Node {
    Node next = null;
    int data;

    public Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    Node head = null;
    int size = 0;

    public LinkedList(){

    }

    public LinkedList(int[] fromArr){
        fromArray(fromArr);
    }

    //Appends node to the end of list
    public void add(int data){
        size++;
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null)
            current = current.next;

        current.next = new Node(data);
    }

    //Add given data to given index in the list
    public void addAt(int index, int data){
        if(head == null) return;

        //If add to head
        if(index == 0){
            addFirst(data);
            return;
        }
        
        Node current = head;
        int count = 0;
        while(current.next != null){
            //Found index
            if(count + 1 == index){
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                size++;
                return;
            }
            current = current.next;
            count++;
        }
    }

    //Inserts node to beginning of list
    public void addFirst(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        size++;
    }


    //Removes given data in the list
    public void remove(int data){
        if(head == null) return;

        //If deletes head
        if(head.data == data){
            size--;
            head = head.next;
            return;
        }
        
        Node current = head;
        while(current.next != null){
            //Found node
            if(current.next.data == data){
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void removeFirst(){
        removeAt(0);
    }

    public void removeLast(){
        removeAt(size - 1);
    }
    
    //Removes given index in the list
    public void removeAt(int index){
        if(head == null) return;

        //If deletes head
        if(index == 0){
            size--;
            head = head.next;
            return;
        }
        
        Node current = head;
        int count = 0;
        while(current.next != null){
            //Found node
            if(count + 1 == index){
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
            count++;
        }
    }

    public int[] toArray(){
        if(head == null)
            return new int[0];

        Node current = head;
        int[] arr = new int[size];
        int index = 0;

        while(current != null){
          arr[index++] = current.data;  
          current = current.next;
        }

        return arr;
    }

    public void fromArray(int[] arr){
        for(int data : arr){
            add(data);
        }
    }

    public void print(){
        Node current = head;
        System.out.println("\nLinked List: with size " + size);
        while(current != null){
            System.out.print(" " + current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] fromArr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        LinkedList list = new LinkedList(fromArr);

        list.add(4);
        list.add(6);
        list.add(7);
        
        list.print();

        list.addAt(2,90);

        list.print();

        list.addAt(4,12);
        list.remove(4);

        list.print();
        list.addFirst(-1);

        list.print();
    }
}


