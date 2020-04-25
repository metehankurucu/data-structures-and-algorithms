// Queue implementation using array
class Queue {

    queue = [];

    //Add item to queue  
    enqueue(item) {
        this.queue.push(item);
    }

    //Remove first item of queue 
    dequeue(){
        if(!this.isEmpty()){
            const item = this.queue.splice(0,1);
            return item;
        }
        return null;
    }

    //Get first item of queue without remove
    peek(){
        if(!this.isEmpty()){
            return this.queue[0];
        }
    }

    isEmpty(){
        return this.queue.length == 0;
    }

}
