class Node {
    data;
    next;
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    head;
    size;

    constructor(){
        this.head = null;
        this.size = 0;
    }

    addAt(index, data){
        const newNode = new Node(data);

        if(this.head == null) {
            this.head = newNode;
            this.size = this.size + 1; 
            return;  
        }

        if(index == 0){
            newNode.next = this.head;
            this.head = newNode;
            this.size = this.size + 1;   
            return;
        }

        let current = this.head;
        let count = 0;
        while(current != null){
            if(count + 1 == index){
                newNode.next = current.next;
                current.next = newNode;
                this.size = this.size + 1;
                return;
            }
            current = current.next;
            count += 1;
        }
        current.next = newNode;
        this.size = this.size + 1;
    }


    removeAt(index){
        if(this.size == 0)
            return;
        
        if(index == 0){
            this.head = this.head.next;
            this.size = this.size - 1;
            return;
        }
            
        let current = this.head;
        let count = 0;
        while(current != null){
            if(count + 1 == index){
                current.next = current.next.next
                this.size = this.size - 1
                return
            }
            current = current.next
            count += 1
        }
            
    }


    addFirst(data){
        this.addAt(0, data);
    }

    addLast(data){
        this.addAt(this.size, data);
    }

    removeFirst(){
        this.removeAt(0);
    }

    removeLast(){
        this.removeAt(this.size - 1);
    }

    remove(data){
        if(this.head == null)
            return;
        
        if(this.head.data == data){
            this.removeFirst(0);
            return;
        }
            

        let current = this.head;

        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                this.size = this.size - 1;
                return;
            }
            current = current.next
        }
    }

    toArray(){
        const arr = [];
        let current = this.head;
        while (current != null){
            arr.push(current.data);
            current = current.next;
        }
        return arr;
    }

    fromArr(arr){
        for (const data of arr) {
            this.addLast(data);
        }
    }

    isEmpty(){
        return this.size === 0;
    }
}
