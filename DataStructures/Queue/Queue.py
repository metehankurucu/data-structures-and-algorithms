#Queue implementation using Linked list

class Node: 
    def __init__(self, data): 
        self.data = data 
        self.next = None
  
class Queue: 
      
    def __init__(self): 
        self.front = None
        self.rear = None
    
    def isEmpty(self): 
        return self.front == None and self.rear == None

    #add item to queue  
    def enqueue(self, item): 
        newNode = Node(item) 
          
        if self.rear == None: 
            self.front = self.rear = newNode 
            return
        self.rear.next = newNode 
        self.rear = newNode 
  
    #remove first item of queue 
    def dequeue(self): 
        if not self.isEmpty(): 
            node = self.front 
            self.front = self.front.next
    
            if(self.front == None): 
                self.rear = None
                
            return node
    #get first item of queue without remove
    def peek(self):
        if(not self.isEmpty()):
            return self.front.data
        return None
